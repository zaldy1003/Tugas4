package eval2.eval2last;

public class HitungNilaiAkhir extends nilai {
    double nilaiTugas;
    double nilaiAkhir;

    public double nilaiTugas(int Tugas1, int Tugas2){
        nilaiTugas= (Tugas1+Tugas2)/2.0;
        return nilaiTugas;
    }

    public double nilaiAKhir(int UAS ,int MID, double nilaiTugas){
        nilaiAkhir= (nilaiTugas*0.4)+(MID*0.3)+(UAS*0.3);
        return nilaiAkhir;
    } 

}
