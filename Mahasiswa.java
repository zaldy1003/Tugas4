package eval2;

public class Mahasiswa extends Orang{
    private String stb;
    public Mahasiswa() {
    super();
    this.stb="13020220057"; //stambuk anda
    }

    public Mahasiswa(String stb, String nama) {
    super(nama);
    this.stb = stb;
    }

    public String getStb(){
        return stb;
    }
    public void setStb(String STB){
        this.stb=STB;
    }

    public static void info(){
        System.out.println("stambuk: "+ new Mahasiswa().stb);
    }

    public void panggilInfo(){
        info();
    }
    }


