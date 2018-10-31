import java.util.ArrayList;

public class QueueString {
	ArrayList<String> container = new ArrayList<String>();
	int ecor = -1;
	
	
	public void insert(String value) {
		ecor = ecor + 1; //ecor++

		container.add(ecor, value);
		
		
	}
	
	public 	String get () { //getter = output DIBERI OUTPUT;
		String value = "KONTAINER KOSONG"; // String value = "";
		if (!container.isEmpty()) {					// if(!container.isEmpty(){
		value = container.get(0); 
		container.remove(0);
		ecor--;//ecor = ecor - 1;
		
		}
		return value;
	}
	
	public void cetak() {
		System.out.println("ECOR:"+ecor+"# CONTAINER:"+container.toString());
	}

}
