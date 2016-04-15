package OOP;

import java.util.ArrayList;


public class ExerciseArrayList {

	public static void main(String[] args) {
		Pisica p1 = new Pisica("Seesha","siameza");
		ArrayList<Pisica> pisici = new ArrayList();
		pisici.add(new Pisica("Sasha","birmaneza"));
		pisici.add(p1);
		pisici.add(new Pisica("Sasha","birmaneza"));
		pisici.add(null);
		pisici.add(new Pisica("Kitty","maidaneza"));
		pisici.add(p1);
		pisici.add(new Pisica("Sasha","birmaneza"));
		pisici.add(p1);
		System.out.println(pisici.size() );
		for (Pisica p:pisici){
			if (p == null) {
				System.out.println("null");
			}
			else {
			System.out.print(p.name + "  " + p.rasa);
			System.out.println();
			}
		}
		
		System.out.println(pisici.get(2).name + "  "+ pisici.get(2).rasa);
		System.out.println();
		System.out.println();
	pisici.set(1, new Pisica ("Cat", "maidaneza"));
		for (Pisica p:pisici){
			if (p == null) {
				System.out.println("null");
			}
		else {
			System.out.print(p.name + "  " + p.rasa);
		}
			System.out.println();
			}
		}
	}



class Pisica {
	String name;
	String rasa;
	public Pisica(String name, String rasa) {
		super();
		this.name = name;
		this.rasa = rasa;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rasa == null) ? 0 : rasa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pisica other = (Pisica) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rasa == null) {
			if (other.rasa != null)
				return false;
		} else if (!rasa.equals(other.rasa))
			return false;
		return true;
	}

}

