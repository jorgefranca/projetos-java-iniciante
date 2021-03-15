/*
    GuessNumber.java - jogo retirado de um exercicio do livro 'java - como programar'
    ---------------------------------------------------------------------------------
    Author: Jorge França                |  Data: 27-Jan-2021
    ---------------------------------------------------------------------------------
    fazer:
     - contar o numero de adivinhacoes que o jogador fez

*/
import java.util.Scanner;
import java.util.Random;

public class GuessNumber 
{ 
    public static void main(String[] args)
    {
        Random gerarNumero = new Random();
        Scanner input = new Scanner(System.in);

        //gerar numero entre 1 e 1000;
        int numEscondido = gerarNumero.nextInt(1000) + 1;
        int numero = 0;
        int cont = 0;
        char resp = 'y';
        //topo do jogo
        System.out.println();
        System.out.println();
        System.out.println("=========================================");
        System.out.println("          ~ GUESS THE NUMB3R ~           ");
        System.out.println("                   ---                   ");
        System.out.println("               by Jorge F.               ");
        System.out.println("=========================================");
        //looping para ler o numero e verificar 
        while(resp == 'y')
        {
            System.out.println("=========================================");
            System.out.println();
            System.out.println(" Vamos comecar, o numero ja foi escolhido!");
            System.out.println(" Agora voce deve adivinhar!               ");
            System.out.println();
            System.out.println("=========================================");

            do 
            {
                System.out.printf("Qual meu numero? ");
                numero = input.nextInt();

                if (numero > numEscondido)
                {
                    System.out.println();
                    System.out.println("Tenta um numero mais baixo!");
                }
                else if(numero < numEscondido)
                {
                    System.out.println();
                    System.out.println("Tenta um numero mais alto");
                }
                
                else
                {
                    System.out.println("--------------------------------------------");
                    System.out.println("                 PARABENS!                  "); 
                    System.out.println("                VOCE ACERTOU!               ");
                    System.out.println("    Tentativas: " + cont                     );
                    System.out.println("--------------------------------------------");
                }      
                cont = cont + 1; //corrigir
            }while (numero != numEscondido);

            System.out.println("Voce deseja continuar adivinhando? (y/n)");
            resp = input.next().charAt(0);
        }


    }
    
}
