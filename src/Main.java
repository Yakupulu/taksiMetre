import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        double perKm=2.20,topucret,km;
        int basucret=10;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden  giriniz: ");
        km=input.nextDouble();

        topucret=(perKm*km);
        topucret+=basucret;

        topucret= topucret<20? 20:topucret;
        System.out.println(topucret);

       // System.out.println((topucret<20)?"ucret:20":"ucret:"+topucret);











    }
}
