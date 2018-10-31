
public class mainQueueString {

	public static void main(String[] args) {
		// queue cetak
		QueueString q = new QueueString();
		q.cetak();
		
		
		q.insert("Gazali");
		q.cetak();
		
		
		q.insert("Wira");
		q.cetak();
		
		q.insert("Liskawati");
		q.cetak();

		
		String o1 = q.get();
		System.out.println(o1);
		q.cetak();
		
		String o2 = q.get();
		System.out.println(o2);
		q.cetak();
		
		String o3 = q.get();
		System.out.println(o3);
		q.cetak();
		
		String o4 = q.get();
		System.out.println(o4);
		q.cetak();
	}

}

