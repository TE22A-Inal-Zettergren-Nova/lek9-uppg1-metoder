import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double summa = omkretsCirkel(2);
        System.out.println("Omkretsen av cirkeln är " + summa);
    }

     static double omkretsCirkel(double radie)
    {
        double summa = 3.14*2*radie;
        return summa;
    }
}
