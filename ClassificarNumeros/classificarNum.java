/*classificarNum.java - recebe 5 numeros e classifica em positivo
 * negativo ou zero.
 * Exercicio 2.31 do livro 'Java - Como programar' pag 54/ pdf 89
 * Autor: Jorge França
 * Data: 27de dezembro de 2020
 * --------------------------------------------------------------
 *  Para resolver esse exercicio, usaremos o comando if() e contadores
 *  assim será possível armazenar a quantidade de cada valor.
 *  SUGESTAO: usar estrutura de repeticao para reduzir e otimizar o cod
 *  */
import java.util.Scanner;

public class classificarNum
{
  public static void main(String[] args)
  {
    
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    int contPositivo = 0;
    int contNegativo = 0;
    int contZero = 0;

    Scanner input = new Scanner(System.in);//variavel que recebe valores
    System.out.print("Digite o 1° numero: ");
    num1 = input.nextInt();
    System.out.print("Digite o 2° numero: ");
    num2 = input.nextInt();
    System.out.print("Digite o 3° numero: ");
    num3 = input.nextInt();
    System.out.print("Digite o 4° numero: ");
    num4 = input.nextInt();
    System.out.print("Digite o 5° numero: ");
    num5 = input.nextInt();

    if(num1<0)
    {
      contNegativo = contNegativo + 1;

    }else if(num1>0)
    {
      contPositivo = contPositivo + 1;
    }else
    {
      contZero = contZero + 1;
    }

    if(num2<0)
    {
      contNegativo = contNegativo + 1;
     
    }else if(num2>0)
    {
      contPositivo = contPositivo + 1;
    }else
    {
      contZero = contZero + 1;
    }  
    if(num3 < 0)
      contNegativo = contNegativo + 1;
    else if (num3 > 0)
      contPositivo = contPositivo + 1;
    else
      contZero = contZero + 1;
    
    if (num4 < 0)
      contNegativo = contNegativo + 1;
    else if (num4 > 0)
      contPositivo = contPositivo + 1;
    else
      contZero = contZero + 1;

    if (num5 < 0)
      contNegativo = contNegativo + 1;
    else if (num5 > 0)
      contPositivo = contPositivo + 1;
    else
      contZero = contZero + 1;
    //--------
    System.out.printf("Valores positivos: %d%n", contPositivo);
    System.out.printf("Valores negativos: %d%n", contNegativo);
    System.out.printf("Valores nulos(zeros): %d%n", contZero);
    
  }
}
