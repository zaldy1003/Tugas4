package eval2;
import java.util.*;
 
   public class Utama {
    public static void main(String[] args) {
    Orang orang = new Orang();
    orang.nama = "zaldy"; // isi sesuai nama anda
    System.out.println("Stb : " + orang.nama);

    //tambah objek mhs1
    Mahasiswa mhs1= new Mahasiswa();

    //tanbah objek mhs2
    Mahasiswa mhs2= new Mahasiswa("13020220057", "Zaldy");

    mhs1.info();
    System.out.println("\n");
    mhs2.info();
    }

   }

