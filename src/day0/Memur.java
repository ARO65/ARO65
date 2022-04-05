package day0;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                '}';
    }

    public static void main(String[] args) {
        Memur memur1=new Memur();
        memur1.maas= memur1.maasHesapla();

        System.out.println(memur1);

    }
}
