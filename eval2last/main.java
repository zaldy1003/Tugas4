package eval2.eval2last;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

import eval2.Mahasiswa;

public class main {
    public static void main(String[] args) throws IOException {
        double na = 0, tugas = 0;

        Scanner scan= new Scanner(System.in);
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Masukkan nama Mahasiswa: ");
        String nama= scan.nextLine();
        System.out.printf("Masukkan Stambuk Mahasiswa: ");
        String STB= scan.nextLine();
        identitas mhs1= new identitas();
        
        mhs1.setNama(nama);
        mhs1.setSTB(STB);

        System.out.print("input nilai tugas 1: ");
        int Tugas1= input.read(); 
    
        System.out.print("input nilai tugas 2: ");
        int Tugas2= input.read();
        scan.nextLine();
        System.out.print("input nilai MID: ");
        int MID= input.read();
        scan.nextLine();
        System.out.print("input nilai UAS: ");
        int UAS= input.read();
        scan.nextLine();

        HitungNilaiAkhir hitungNilai = new HitungNilaiAkhir();
        hitungNilai.setTugas1(Tugas1);
        hitungNilai.setTugas2(Tugas2);
        hitungNilai.setMID(MID);
        hitungNilai.setUAS(UAS);

        na = hitungNilai.nilaiTugas(Tugas1, Tugas2);
        tugas = hitungNilai.nilaiAKhir(UAS, MID, na);

        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("STB: " + mhs1.getSTB());
        System.out.println("Nilai Tugas: " + na);
        System.out.println("Nilai Akhir: " + tugas);

        System.out.println("\n");
        JOptionPane.showMessageDialog(null,"Nama: "+ mhs1.getNama());
        JOptionPane.showMessageDialog(null,"Stb: "+ mhs1.getSTB());
        JOptionPane.showMessageDialog(null,"Nilai Tugas: "+ na );
        JOptionPane.showMessageDialog(null,"Nilai Akhir: "+ tugas);
    }
}
