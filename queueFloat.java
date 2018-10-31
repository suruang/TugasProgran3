import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> container = new ArrayList<Float>();
	int ecor = -1;
	
	
	public void insert(Float value) {
		ecor = ecor + 1; //ecor++

		container.add(ecor, value);
		
		
	}
	
	public 	Float get () { //getter = output DIBERI OUTPUT;
		Float value = (float) 10.00; // String value = "";
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
