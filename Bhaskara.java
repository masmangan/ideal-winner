
/**
 * Escreva uma descrição da classe Bhaskara aqui.
 * 
 * @author marco.mangan@pucrs.br 
 * @version (um número da versão ou uma data)
 */
public class Bhaskara
{
    private double a;
    private double b;
    private double c;

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
    
    
    public double raiz1() {
        //TODO:
        return 0.0;
    }

    public double raiz2() {
        //TODO:
        return 0.0;
    }    
    
}
