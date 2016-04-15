/*  - one day ticket: 2
		- 7 days ticket: 7
		- 30 days ticket: 25
*/
package introducere;

public class BusTickets {
	
	private static final int ONE_DAY_TICKET = 2;
	private static final int SEVEN_DAYS_TICKET = 7;

	private static int minNrOfDaysInWeek;

	static {
		minNrOfDaysInWeek = SEVEN_DAYS_TICKET / ONE_DAY_TICKET + 1;
	}
	public static void main(String[] args) {

		int[] vect = { 5, 6, 8, 9, 10, 11, 12, 14, 24, 25, 29 , 30 };
		// min 18
		int minimumCost = busTicket(vect);
		System.out.println(" Costul minim  pentru { 5, 6, 8, 9, 10, 11, 12, 14, 24, 25, 29 , 30 } este " + minimumCost);
		
		int[] test = { 5, 6, 8 };
		// min 18
		int minimumCost2 = busTicket(test);
		System.out.println(" Costul minim  pentru { 5, 6, 8 } este " + minimumCost2);
	}

		private static int busTicket(int[] ar) {

			int priceFromTopToBottomParsing = calculatePriceFromTopToBottomParsing(ar);
			int priceFromBottomToTopParsing = calculatePriceFromBottomToTopParsing(ar);

			return Integer.min(Integer.min(priceFromTopToBottomParsing, priceFromBottomToTopParsing), 25);

		}

		private static int calculatePriceFromTopToBottomParsing(int[] originalArray) {

			int nrOfWeekTickets = 0;
			int spareDays = 0;

			boolean[] daysInMonth = new boolean[31];
			// 0-index element is not taken into account

			// Initialize days with true
			for (int i = 0; i < originalArray.length; i++) {

				daysInMonth[originalArray[i]] = true;
			}

			// calculate number of week tickets
			for (int i = 0; i < daysInMonth.length; i++) {

				if (daysInMonth[i]) {

					if (doWeHaveAProfitableWeekTicketFromTop(daysInMonth, i)) {

						nrOfWeekTickets++;

						// remove all travels covered by this week ticket
						//*******************************************************
						// Add this:
						int maxLimit = (i > 24) ?  daysInMonth.length : i + 7;
						//*******************************************************
						for (int j = i; j < maxLimit; j++) {   // change i + 7 to maxLimit
							daysInMonth[j] = false;
						}

					}
				}
			}

			// calculate number of spare days
			for (int i = 0; i < daysInMonth.length; i++) {

				if (daysInMonth[i]) {
					spareDays++;
				}

			}

			return nrOfWeekTickets * SEVEN_DAYS_TICKET + spareDays * ONE_DAY_TICKET;

		}

		private static int calculatePriceFromBottomToTopParsing(int[] originalArray) {

			int nrOfWeekTickets = 0;
			int spareDays = 0;

			boolean[] daysInMonth = new boolean[31];
			// 0-index element is not taken into account

			// Initialize days with true
			for (int i = 0; i < originalArray.length; i++) {

				daysInMonth[originalArray[i]] = true;
			}

			// calculate number of week tickets
			for (int i = daysInMonth.length - 1; i > 0; i--) {

				if (daysInMonth[i]) {

					if (doWeHaveAProfitableWeekTicketFromBottom(daysInMonth, i)) {

						nrOfWeekTickets++;

						// remove all travels covered by this week ticket
						//******************************************
						// Add this:
						int minLimit;

						if (i < 7) {
							minLimit = 0;
						} else {
							minLimit = i - 7;
						}					
						//******************************************
						for (int j = i; j > minLimit; j--) {  //change i - 7 to minLimit
							daysInMonth[j] = false;
						}

					}
				}
			}

			// calculate number of spare days
			for (int i = 0; i < daysInMonth.length; i++) {

				if (daysInMonth[i]) {
					spareDays++;
				}

			}

			return nrOfWeekTickets * SEVEN_DAYS_TICKET + spareDays * ONE_DAY_TICKET;

		}

		private static boolean doWeHaveAProfitableWeekTicketFromTop(boolean[] daysInMonth, int i) {

			int maxLimit;

			if (i > 24) {
				maxLimit = daysInMonth.length;
			} else {
				maxLimit = i + 7;
			}

			int howManyTravelsThisWeek = 1; // we already have a travel at position
											// i.

			for (int j = i + 1; j < maxLimit; j++) {

				if (daysInMonth[j]) {
					howManyTravelsThisWeek++;
				}
			}

			if (howManyTravelsThisWeek >= minNrOfDaysInWeek) {
				return true;
			}
			return false;

		}

		private static boolean doWeHaveAProfitableWeekTicketFromBottom(boolean[] daysInMonth, int i) {

			int minLimit;

			if (i < 7) {
				minLimit = 0;
			} else {
				minLimit = i - 7;
			}

			int howManyTravelsThisWeek = 1; // we already have a travel at position
											// i.

			for (int j = i - 1; j > minLimit; j--) {

				if (daysInMonth[j]) {
					howManyTravelsThisWeek++;
				}
			}

			if (howManyTravelsThisWeek >= minNrOfDaysInWeek) {
				return true;
			}
			return false;

		}

	}
