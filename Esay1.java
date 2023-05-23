//NAMA : MUHAMMAD RAYSA FARHAN
//NPM  : 227064516100
package esay1;
import java.util.Scanner;
public class Esay1 {

    public static void main(String[] args) {
        Scanner perulangan = new Scanner (System.in);// membuat scanner baru dengan inputan
      int pilih;//mendeklarasikam variabel pilih
      System.out.println("\t==========Frendly Match=========== ");//menampilkan output "frendly match"
      System.out.println("\t======= Indonesia VS Argentina =========");//menampilkan output ''Indonesia vs Argentina"
      System.out.println( "\t=====================================");
      System.out.println();
      
      System.out.println ("Silahkan pilih kategori yang di inginkan");//menampilkan output "kategori yang di inginkan
      System.out.println ("1. Kategori I");//menampikan output kategori 1
      System.out.println("2. Kategori II");//menampilkan output kategori 2
      System.out.println ("3. Kategori III");//menampilkan output kategori 3
      
      System.out.print("Masukan Kategori yang anda pilih : ");//menampilkan output yang anda pilih
      pilih=perulangan.nextInt();//menyimpan inputan variabel pilih
      System.out.println ("=============================");
      
      if (pilih==001)//untuk menampilkan pilihan
          System.out.println ("Harga Kategori I : Rp.1.000.000");//menampilkan output kategori 1 dengan harga
      else if (pilih==002)//untuk menampilkan pilihan
          System.out.println ("Harga Kategori II : Rp.800.000");//menampilkan output kategori 2 dengan harga
      else if (pilih==003)//untuk menampilkan pilihan
          System.out.println ("Harga Kategori III : Rp.500.000");//menampilkan output kategori 3 dengan harga
      else 
          System.out.println ("Kode Yang Anda Masukan Salah!!!");//menampilkan output kode anda salah
      System.out.println ("=================================");
      
      for (int i=1; i>0; i--)//untuk melakukan perulangan
      {
          for (int j=1; j>0; j++)//untuk melakukan perulangan
          {
              System.out.println ("Apakah Pilihan Anda Benar ?");//menampilkan output apakan pilihan anda benar
              System.out.println ("1.IYA");//menampilkan output iya
              System.out.println ("2.TIDAK");//menampilkan output tidak
              System.out.print ("Pilih :");//menampilkan output pilih
              pilih=perulangan.nextInt();//menyimpan inputan variabel pilih
              
              if (pilih==01)//untuk menampilkan pilihan
                  System.out.println ("Selamat, Tiket Anda Sudah Terpesan!!!");//menampilkan output berhasil memasan tiket
              else if (pilih==02)//untuk menampilkan pilihan
                  System.out.print ("Masukan Kategori Yang Anda Pilih :");//menampilkan output untuk mengulang memilih kategori
              pilih=perulangan.nextInt();
                if (pilih==001)//untuk menampilkan pilihan
          System.out.println ("Harga Kategori I : Rp.1.000.000");//menampilkan output kategori 1 dengan harga
      else if (pilih==002)//untuk menampilkan pilihan
          System.out.println ("Harga Kategori II : Rp.800.000");//menampilkan output kategori 2 dengan harga
      else if (pilih==003)//untuk menampilkan pilihan
          System.out.println ("Harga Kategori III : Rp.500.000");//menampilkan output kategori 3 dengan harga
      else 
          System.out.println ("Kode Yang Anda Masukan Salah!!!");//menampilkan output kode anda salah
      System.out.println ("=================================");
          }
      }
    }
    
}

