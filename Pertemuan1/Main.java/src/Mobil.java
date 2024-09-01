public class Mobil
{   private String merk;
    private int tahunPembuatan;
    private int cc;

    public void nyalakan(){
        System.out.println("BRUMM!!");
    }
    public void jalan(){
        System.out.println("ngenggg! Mobil " + this.merk + " dengan mesin " +cc + "cc" +
                " berjalan di jalan raya");
    }

    public Mobil (String merk, int tahunPembuatan, int cc){
        this.merk = merk;
        this.tahunPembuatan= tahunPembuatan;
        this.cc=cc;
    }
}
