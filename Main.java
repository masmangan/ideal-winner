import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Scanner in;
        Bhaskara eq;       
        double a, b, c;
        System.out.println("Eq. do Segundo Grau");
        System.out.println();
        
        in = new Scanner(System.in);
        System.out.print("Informe o valor de a: ");
        a = in.nextDouble(); 
        System.out.print("Informe o valor de b: ");
        b = in.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = in.nextDouble();
        in.close();
        
        eq = new Bhaskara(a, b, c);
        
        System.out.println(eq.getRoot1());
        System.out.println(eq.getRoot2());
        
    }
}
