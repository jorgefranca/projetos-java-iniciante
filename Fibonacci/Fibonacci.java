/**
 * Fibonacci.java - programa para exibir uma sequencia de fibonacci com 
 * a quantidade de termos que o usuario solicitar;
 * --------------------------------------------------------------------
 * Autor: Jorge F            
 * Data: 06/03/2021
 * --------------------------------------------------------------------
 * Exemplo de sequencia com 10 termos: 0 1 1 2 3 5 8 13 21 34 ...
 * - os dois primeiros termos (0 e 1) sempre estarão presenter para
 * numero de termos > 2; os outros termos são a soma dos dois termos 
 * anteriores.
 * --------------------------------------------------------------------
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        //metodo fibonacci(n)
        int n;            

        Scanner input = new Scanner(System.in);

        System.out.println("Numero de termos: ");
        n = input.nextInt();

        //int[] sequenciaFibonacci = new int[n];
        Double[] sequenciaFibonacci = new Double[n];

        sequenciaFibonacci[0] = 0.0;
        sequenciaFibonacci[1] = 1.0;
        
        for (int i = 2; i < n; i++){
            sequenciaFibonacci[i] = sequenciaFibonacci[i-1] + sequenciaFibonacci[i-2];
        }
            
        int cont = 0;
        for (int i = 0; i < n; i++){
            if(sequenciaFibonacci[i] >= 0){
                System.out.printf(" %.0f ",sequenciaFibonacci[i]);
                cont++; //contar quantos termos o tipo int suporta. nesse caso eu adoto um valor alto e avalio a resposta. Pensar em outra forma de avaliar 
            }else{
                System.out.println("Sequencia máxima");
                break;
            }
        } System.out.printf("%nNUMERO DE TERMOS: %d%n", cont);
   } 
}
