import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> container = new ArrayList<Double>();
	int ecor = -1;
	
	
	public void insert(Double value) {
		ecor = ecor + 1; //ecor++

		container.add(ecor, value);
		
		
	}
	
	public 	Double get () { //getter = output DIBERI OUTPUT;
		Double value = 0.0; // String value = "";
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
