import java.util.ArrayList;

public class StackDouble {
	ArrayList<Double> container = new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value) {
		top = top+1;
		container.add(top, value);
		
	}
	public Double pop() {
		Double value = 0.0;  //String value = "otak kosong"
		if(!container.isEmpty()) { // if (!container.isEmpty()) {
		value = container.get(top); //top = top - 1;
		container.remove(top);  
		top = top - 1;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("TOP:"+top+"# CONTAINER:"+container.toString());
	}
			
}
