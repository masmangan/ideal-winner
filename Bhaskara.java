
/**
 * Class Bhaskara solves a equation with 3 parameters: a, b, and c.
 * 
 * @author marco.mangan@pucrs.br 
 * @version 2022-11-16
 */
public class Bhaskara
{
    private double a;
    private double b;
    private double c;

    private double root1;
    private double root2;
    
    
    /**
     * Construtor para objetos da classe Bhaskara
     */
    public Bhaskara(double a, double b, double c)
    {
        if (a == 0.0)
            throw new IllegalArgumentException("A=0! Nao e um equacao do segundo grau!");
            
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;
    }    
    
}
