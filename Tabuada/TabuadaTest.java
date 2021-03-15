/* 
    TabuadaTest.java - joguinho de tabuada para aplicar com criancas
    ---------------------------------------------------------------------
    @author: Jorge França      | Data: 11 - fev - 2021
    ---------------------------------------------------------------------
    Informacoes:
        -Projeto baseado em um exercicio do livro 'Java - como programar'
        -Classes criadas:
            -Mensagens.java 
                -retorna mensagens de erro e acerto e o topo do programa
            -Tabuada.java
                -realiza todos os calculos necessarios
    ---------------------------------------------------------------------
    Implementar:
        -implementar uma variavel que conte o numero de acerto e de erros
        para auxiliar em uma tomada de decisao por parte do/da professor/
        professora do/da estudante ou responsavel.
        -Nao seria necessario usar o secureRandom, bastava um random
        provavelmente seria mais eficiente (apesar do prog ser pequeno)
        -Avaliar as regras de arredondamento
        ________FEITO______________________
        -corrigir problema o resultado da divisao, o resultado da divisao
        tem muitas casas decimais. O ideal seriam duas casas decimais.
        -Solicitar o numero de questoes que serao feitas pelo usuario
    ---------------------------------------------------------------------
*/

import java.util.Scanner;
import java.security.SecureRandom;

public class TabuadaTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cont = 1;

        Mensagens m = new Mensagens();
            m.mensagemTopo();

        System.out.println("Numero de questoes: ");
        int quantidadePerguntas = input.nextInt();
        System.out.printf("Pronto! %d questoes para voce responder!%n", quantidadePerguntas);
        System.out.println("__________________________________________");

        while(cont <= quantidadePerguntas) //elaborar 10 calculos
        {
            Tabuada n = new Tabuada();
            n.gerarNumero1();
            n.gerarNumero2();
            n.gerarCalculo();
           // System.out.println(n.getResultado());
            double resposta = input.nextDouble();
            m.gerarOpcao();
            m.gerarMensagem(resposta, n.getResultado());
            cont += 1; 
        }
        
          
    }

    
}
