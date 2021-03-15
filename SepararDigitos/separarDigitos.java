/*separarDigitos.java - recebe um numero com 5 digitos e retorna esses numeros 
 * separados. 
 * Exercicio 2.30 do livro 'Java - Como programar' pag 53/pdf 88
 *-----
 * Autor: Jorge França
 * Data: 28 de dezembro de 2020
 * ---------------------------
 *  Usar o mod (%) e divisao para conseguir o resultado desejado
 * */

import java.util.Scanner;

public class separarDigitos
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int numero;
    int digito1;
    int digito2;
    int digito3;
    int digito4;
    int digito5;
    int resto1, resto2, resto3, resto4;
    int temp;

    System.out.print("Digite o inteiro de 5 digitos: ");
    numero = input.nextInt();
    
    resto1 = numero % 10000;
    digito1 = (numero - resto1)/10000;
    temp = resto1;
    
    resto2 = resto1 % 1000; 
    digito2 = (temp - resto2)/1000;
      
    resto3 = resto2 % 100;
    digito3 = (resto2 - resto3)/100;
    
    resto4 = resto3 % 10;
    digito4 = (resto3 - resto4)/10;

    digito5 = resto4;


    System.out.printf("%d %d %d %d %d%n",digito1, digito2, digito3, digito4, digito5);



  }
}
