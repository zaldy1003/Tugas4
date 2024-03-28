package eval2;

public class Orang {
    protected String nama ;
    public Orang() { this.nama= "Aminah";}

    public Orang(String nama) {
    this.nama = nama;
    }

    private String getOrg(){
        return nama;
    }

    private String setNama(String nama){
        return this.nama=nama;
    }

    //buat static pada no.2
    public static void info(){
        System.out.println("nama="+ new Orang().nama);
    }

    public void panggilInfo(){
        info();
    }
    
   }
