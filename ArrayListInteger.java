import java.util.ArrayList;
import java.util.Scanner;
 

 
public class ArrayListInteger
{
    public static void main(String[] args)
    {
        //  Buat Objek ArrayList dan set datanya menjadi integer
        ArrayList<Integer> arr_data = new ArrayList();
         
        //  Buat Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //  Input jumlah Data yang di inginkan oleh User
        System.out.print("Input jumlah Data : ");   int jlh_data = scan.nextInt();
         
        //  Input tiap nilai dan masukkan ke dalam ArrayList
        System.out.println("\nInput nilai Data");
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Data ke-"+(a+1)+" : ");
            int value = scan.nextInt();     //  Membaca inputan dari si User
             
            //  Masukkan ke dalam ArrayList
            arr_data.add(value);
        }
         
        //  Tampilkan Data hasil inputan
        System.out.println("\nData yang ada di dalam ArrayList");
        int posisi = 1;
        for(Integer i : arr_data)
        {
            System.out.println("-->Data ke-"+posisi+" : "+i);
            posisi++;
        }
         
        //  Input Data yang akan dicari
        System.out.print("\nInput Data yang akan dicari : ");   int cari = scan.nextInt();
         
        //  Proses Pencarian di dalam ArrayList
        int iterasi = 1;
        boolean temu = false;
        for(Integer i : arr_data)
        {
            if(i == cari)
            {
                System.out.println("Iterasi ke-"+iterasi);
                System.out.println(i+" == "+cari);
                temu = true;
                    break;
            }
            else
            {
                System.out.println("Iterasi ke-"+iterasi);
                System.out.println(i+" != "+cari);
            }
            iterasi++;
            System.out.println();
        }
         
        if(temu == true)
            System.out.println("\nData ditemukan pada iterasi ke-"+iterasi);
         
        else
            System.out.println("\nData tidak ditemukan");
         
    }
}