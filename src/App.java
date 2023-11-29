import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double summa = omkretsCirkel(2);
        System.out.println("Omkretsen av cirkeln är " + summa);
        ritaLinje(23);
        ritaRektangel(8, 20);
        System.out.println("Är talet positivt? " + tal_positivt(2.5));
 
    }

     static double omkretsCirkel(double radie)
    {
        double summa = 3.14*2*radie;
        return summa;
    }

    static void ritaLinje(int längd){
        for(;längd!=0; längd--)
        {
            System.out.print("-");
        }
    }

    static void ritaRektangel(int höjd, int bredd){
        
        for(int i=0; i<höjd;i++)
        {
            System.out.println(" ");
            for(int j=0; j<bredd; j++)
            {

            System.out.print("*");
            }
        }
    }

    static boolean tal_positivt(double tal) {
        

        if(tal>0){
            return true;
        }
        else{
            return false;
        } 
        

    }
}
