import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
		// ArrayListDouble
		
	ArrayList<Double> jkt1 = new ArrayList();
		
		jkt1.add((double) 10.00);
		jkt1.add((double) 11.00);
		jkt1.add((double) 12.00);
		jkt1.add((double) 13.00);
		jkt1.add((double) 14.00);
		System.out.println();
		jkt1.remove(2);
		System.out.println();
		jkt1.remove(11.00);
		jkt1.add((double) 15.00);
		System.out.println();

		
		ArrayList<Double> jkt2 = (ArrayList<Double>) jkt1.clone();
		System.out.println("mhs1 "+jkt1);
		System.out.println("mhs2 "+jkt2);
		
		System.out.println("Kosongkah :"+jkt1.isEmpty());
		if(jkt1.contains(jkt1)) System.out.println("ADA angka 14.00");
		
		
		else {System.out.println();
			}
		System.out.println("mhs1 "+jkt1);
		System.out.println("mhs2 "+jkt2);


	}

}
