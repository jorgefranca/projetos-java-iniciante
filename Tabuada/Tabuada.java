/*
    classe que criara questoes de mutiplicacao
    ----------------------------------------
    - implementar outras operacoes
    - verificar a necessidade dos setNumero
    ----------------------------------------
 */
import java.security.SecureRandom;

public class Tabuada 
{
    SecureRandom numeroAleatorio = new SecureRandom(); 
    
    private int numero1;
    private int numero2;
    private int operacao;
    private int resultado;
    private double resultadoDivisao;

    //metodos para gerar numeros
    public void gerarNumero1()
    {
        this.setNumero1(1 + numeroAleatorio.nextInt(9));
    }
    public void gerarNumero2()
    {
        this.setNumero2(1 + numeroAleatorio.nextInt(9));
    }

    //metodo para realizar operacoes
    public void gerarCalculo()
    {
        this.operacao = 1 + numeroAleatorio.nextInt(4);

        switch(operacao)
        {
            case 1: //soma
                this.setResultado(this.numero1 + this.numero2);
                System.out.println("  "+this.numero1 + "+" + this.numero2 + " = " + " ?");
                break;
            case 2: //subtracao
                this.setResultado(this.numero1 - this.numero2);
                System.out.println("  "+this.numero1 + "-" + this.numero2 + " = " + " ?");
                break;
            case 3: //multiplicacao
                this.setResultado(this.numero1 * this.numero2);
                System.out.println("  "+this.numero1 + "*" + this.numero2 + " = " + " ?");
                break;
            case 4: //divisao
                //descobrir um jeito de truncar as divisões 
                //para até duas casas decimais
                this.setResultadoDivisao((double)this.numero1 / this.numero2);
                System.out.println("  "+this.numero1 + "/" + this.numero2 + " = " + " ?");
                break; 
         }       
    }
    //metodos setters
    public void setNumero1(int numero1)
    {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2)
    {
        this.numero2 = numero2;
    }
    public void setResultado(int resultado)
    {
        this.resultado = resultado;
    }
    public void setResultadoDivisao(double resultado)
    {
        this.resultadoDivisao = Math.round(resultado*100)/100d;
    }

    //metodos getters
    public double getResultado()
    {
        if(operacao == 4)
            return resultadoDivisao;
        return resultado;
    }
    public int getNumero1()
    {
        return numero1;
    }
    public int getNumero2()
    {
        return numero2;
    }
}
