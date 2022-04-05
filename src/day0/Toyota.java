package day0;

public class Toyota {
    String marka;
    int tekerSayisi = 4;
    boolean motoruVarMi = true;
    String yakıt;
    String model;
    int yıl;

   public void maxHız(){
       if(yakıt.equalsIgnoreCase("benzinli")){
           System.out.println("benzinli arabalar 240hhız yapar");
       }else if (yakıt.equalsIgnoreCase("dizel")){
           System.out.println("benzinli arabalar 260 hhız yapar");
       }

    }

}
