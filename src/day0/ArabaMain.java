package day0;

public class ArabaMain {
    public static void main(String[] args) {
          Araba honda = new Araba("avensis","beyaz",2000,2020);
        Araba volvo = new Araba("s80","füme",2400,2023);

        System.out.println(honda);
        System.out.println(volvo);

        System.out.println(honda.getModel()+""+honda.getMotor()+honda.getRenk()+honda.getYil());
honda.setYil(2028);
honda.setModel("aşk");
honda.setRenk("beyaz");
        System.out.println(honda.getModel()+""+honda.getRenk());
    }


}
