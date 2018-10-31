import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		// ArrayListString
	ArrayList<String> arl1 = new ArrayList<String>();
		
		arl1.add("C");
		arl1.add("S");
		arl1.add("K");
		arl1.add("O");
		arl1.add(1, "D");
		arl1.add(3, "E");
		System.out.println(arl1);
		arl1.remove(2);
		System.out.println(arl1);
		arl1.remove("O");
		arl1.add("P");
		System.out.println(arl1);

		
		ArrayList<String> arl2 = (ArrayList<String>) arl1.clone();
		System.out.println("arl1 "+arl1);
		System.out.println("arl1 "+arl2);
		
		System.out.println("Kosongkah :"+arl1.isEmpty());
		if(arl1.contains("K")) System.out.println("ADA huruf K");
		else {System.out.println("tak ADA HURUF K");}
		System.out.println("arl1 "+arl1);
		System.out.println("arl1 "+arl2);
		
		

	}

}
