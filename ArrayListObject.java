
public class ArrayListObject {
private	String nama;
private	String nim;
private String kelas;
private	String alamat;

String getNama () {
	System.out.println(nama);
	return nama;
	
}
String setNama(String nama) {
	System.out.println(nama);
	return nama;
}
String getNim() {
	System.out.println(nim);
	return nim;
}
String setNim(String nim) {
	System.out.println(nim);
	return nim;
}
String getKelas(String kelas) {
	System.out.println(kelas);
	return kelas;
}
String setKelas(String kelas) {
	System.out.println(kelas);
	return kelas;
}
String getAlamat() {
	System.out.println(alamat);
	return alamat;
}
String setAlamat(String alamat) {
	System.out.println(alamat);
	return alamat;
}



String setTinggiBadan(String tinggiBadan) {
	System.out.println(tinggiBadan);
	return tinggiBadan;
}




	public static void main(String[] args) {
		// objek
		ArrayListObject data = new ArrayListObject();
		data.setNama("nama=Abdul Wahab");
		data.setNim("nim=D0217025");
		data.setKelas("kelas=Informatika D");
		data.setAlamat("alamat=Desa Suruang Kec.Campalagian");

	
		
	
		
		
	}

}
