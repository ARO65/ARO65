package day0;

public class ToyotaRunners {
    public static void main(String[] args) {
        Toyota obj1 = new Toyota("MUSTAFA","yıldırım",44,true);
        System.out.println(obj1.toString());
        System.out.println(obj1);
        Toyota obj2= new Toyota("MUSTAFA","yıldız",44);
        System.out.println(obj2);
    }
}
