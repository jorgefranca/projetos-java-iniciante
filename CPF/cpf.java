/*  cpf.java
  --------
  Autor: Jorge França (JorgeF) | Data: 15 - fev - 2021
  ---------------
  Proposta retirada do site: 
   https://hackingnaweb.com/programacao/gerar-cpfs-validos/#more-98
   - o cpf segue a mascara ###.###.###-##
   -----------------------------------------
   Algoritmo matemático para validar um cpf:
   -----------------------------------------
   1) Os 9 primeiros dígitos são multiplicados por uma sequencia
   descrescente iniciando no 10. Exemplo: 217.306.891-16
   
   2x10 + 1x9 + 7x8 + 3x7 + 0x6 + 6x5 + 8x4 + 9x3 + 1x2
 
   2) multiplica o resultado do passo (1) por 10 e divide por 11 e 
   armazena o resto da divisao (se o módulo for igual a 10, devemos
   adotar valor 0)
 
   197*10 % 11
 
   o resultado encontrado aqui é o primeiro digito verificador
   do cpf
 
   3) repetimos o primeiro passo, agora para os 10 primeiros digitos
   e começando de 11
   
   4) o resultado do passo (3) devera ser multiplicado por 10 e
   dividido por 11, o resto dessa divisao será o segundo digito 
   verificador
 
   5) basta comparar os digitos encontrados com os fornecidos para
   verificar se o cpf é válido 
 
   ----------------------------------------
   Algoritmo para criar novos CPFs:
   ----------------------------------------
   - por fazer
*/
 
import java.util.Scanner;

public class cpf 
{
    
    public static void topo()
    {// por enquanto apenas a opcao 1 foi implementada
        System.out.println("#########################");
        System.out.println("#      SISTEMA CPF      #");
        System.out.println("#~        JORGE F      ~#");
        System.out.println("#########################");
        System.out.println(" opcoes:                 ");
        System.out.println("[1] Verificar CPF        ");
        System.out.println("[2] Gerar CPF            ");
        System.out.println("-------------------------");
    }
    
    public static void main(String[] args)
    {
        topo();
        Scanner input = new Scanner(System.in);

        long cpfUser;
        long vetorCpfUser[] = new long[11];

        System.out.println("[1] Validar cpf: ");
        cpfUser = input.nextLong();
        
        //existe outra maneira de ler e trabalhar com cpf sem ser tipo -long- 
        long n = cpfUser;
        long cont = 10000000000L;
        
        //separar os digitos
        for (int i = 0; i < 11; i++)
        {
            long resto = n % cont;
            vetorCpfUser[i] = (n-resto)/cont;
            n = resto;
            cont = cont/10;

        }

        //passo 1
        int valor = 10;
        long somaCpf = 0;
        for (int i = 0; i < 9; i++)
        { 
            somaCpf = somaCpf + (vetorCpfUser[i] *valor);  
            valor -= 1;
        }

        //passo 2
        long digitoVerificarUm = (somaCpf *10) % 11;
        if (digitoVerificarUm == 10)
            digitoVerificarUm = 0;
        // System.out.println(digitoVerificarUm);
        
        //passo 3
        valor = 11;
        somaCpf = 0;
        for (int i = 0; i < 10; i++)
        { 
            somaCpf = somaCpf + (vetorCpfUser[i] *valor);  
            valor -= 1;
        }

        //passo 4
        long digitoVerificarDois = (somaCpf *10) % 11;
        if (digitoVerificarDois == 10)
            digitoVerificarDois = 0;
        //  System.out.println(digitoVerificarDois);
        
        //passo 5
        if (digitoVerificarUm == vetorCpfUser[9] && digitoVerificarDois == vetorCpfUser[10])
        {
            System.out.println("O CPF informado e valido!");
        }else
        {
            System.out.println("O CPF nao e valido!");
        }    
        //---------------------------------------------------------------------------------------------------
        // [2] Gerar cpf com base nos 9 digitos
        //separar os digitos
      
    }
}







