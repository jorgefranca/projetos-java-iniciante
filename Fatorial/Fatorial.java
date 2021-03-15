/*
 * Fatorial.java 
 * -------------------------------------
 *  Jorge França (jorgeF)
 * -------------------------------------
 *  calcular fatorial de um numero inteiro (>0)
 * */
import java.util.Scanner;

public class Fatorial
{
 public static int FatorialNumero(int num)
 {
    int fat = num;
    for (int i = 1; i<num; i++)
    {
      fat = fat * (num-i);
    }
  return fat;
  }

 public static void main(String[] args)
  {
    int numero;
    int resultado;
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");
    numero = input.nextInt();
    resultado = FatorialNumero(numero);

    System.out.println(resultado);
    
  }
}
