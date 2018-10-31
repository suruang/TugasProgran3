import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
		// ArrayListFloat
		ArrayList<Float> mhs1 = new ArrayList();
		
		mhs1.add((float) 10.00);
		mhs1.add((float) 11.00);
		mhs1.add((float) 12.00);
		mhs1.add((float) 13.00);
		mhs1.add((float) 14.00);
		System.out.println();
		mhs1.remove(2);
		System.out.println();
		mhs1.remove(11.00);
		mhs1.add((float) 15.00);
		System.out.println();

		
		ArrayList<Float> mhs2 = (ArrayList<Float>) mhs1.clone();
		System.out.println("mhs1 "+mhs1);
		System.out.println("mhs2 "+mhs2);
		
		System.out.println("Kosongkah :"+mhs1.isEmpty());
		if(mhs1.contains(mhs1)) System.out.println("ADA angka 14.00");
		
		
		else {System.out.println();
			}
		System.out.println("mhs1 "+mhs1);
		System.out.println("mhs2 "+mhs2);

	}


		
	}


