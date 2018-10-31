import java.util.ArrayList;

public class StackString {
	ArrayList<String> container = new ArrayList<String>();
	int top = -1;
	
	public void push(String value) {
		top = top+1;
		container.add(top, value);
		
	}
	public String pop() {
		String value = "OTAK KOSONG";  //String value = "otak kosong"
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
