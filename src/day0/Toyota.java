package day0;

public class Toyota {
    String isim;
    String soyIsım;
    int numara;
    boolean gercekMİ;

    public Toyota(String ism, String soyism, int no, boolean grc) {
        isim = ism;
        soyIsım = soyism;
        numara = no;
        gercekMİ = grc;

    }

    public Toyota(String mustafa, String yıldız, int no) {
        this.isim = isim ;
        this.soyIsım = soyIsım ;
        this.numara = numara ;

    }

    public String toString() {
        return ("isim : " + isim +
                "soyIsım : " + soyIsım +
                "numara : " + numara +
                "gercekMı :" + gercekMİ);
    }
}
