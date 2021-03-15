/* 
    MEnsagens.java - classe criada para retornar mensagens para TabuadaTest
    -----------------------------------------------------------------------
    @author: Jorge França      | Data: 11 - fev - 2021
    -----------------------------------------------------------------------
    Informacoes:
        -Projeto baseado em um exercicio do livro 'Java - como programar'
        
           
    -----------------------------------------------------------------------
    Implementar:
        - implementar outras mensagens de acerto/erro
        
    -----------------------------------------------------------------------
*/
import java.security.SecureRandom;

public class Mensagens 
{
    SecureRandom posicaoMensagem = new SecureRandom();
    private int opcao;

    public void gerarOpcao()
    {
        this.setOpcao(1 + posicaoMensagem.nextInt(4));
    }

    public void setOpcao(int valor)
    {
        this.opcao = valor;
    }

    public void gerarMensagem(double respostaUsuario, double respostaCorreta)//int respostaCorreta)
    {
        if(respostaUsuario != respostaCorreta)
        {
            mensagemErro();
        }else
        {
            mensagemAcerto();
        }
    }
    public void mensagemErro()
    {
        System.out.println("----------");
        switch (opcao) 
        {
            case 1:
                System.out.println("  Errado !");
                break;
            case 2:
                System.out.println("  Muito Errado !");
                break;
            case 3:
                System.out.println("  Ta Errado! Tente novamente");
                break;
            case 4:
                System.out.println("  Muito Longe ! Desista");
                break;
        }
        System.out.println("----------");
    }
    public void mensagemAcerto()
    {
        System.out.println("----------");
        switch (opcao) 
        {
            case 1:
                System.out.println("  E isso ai!");
                break;
            case 2:
                System.out.println("  Parabens!");
                break;
            case 3:
                System.out.println("  Voce eh um genio");
                break;
            case 4:
                System.out.println("  Temos um Einstein aqui!");
                break;
        }
        System.out.println("----------");
    }
    public void mensagemTopo()
    {
        System.out.println(" __________________________________");
        System.out.println("|                                  |");
        System.out.println("|      JOGO DA TABUADA - v1.0      |");
        System.out.println("|          by Jorge Artur          |");
        System.out.println("|  _____________________________   |");
        System.out.println("|  Objetivo:                       |");
        System.out.println("|   Acertar o maximo de questoes   |");
        System.out.println("|  _____________________________   |");
        System.out.println("|  Info:                           |");
        System.out.println("|  Ao escrever os resultados das   |");
        System.out.println("|  divisoes, utilize virgula ','   |");
        System.out.println("|  no lugar do ponto '.'           |");
        System.out.println("|  Ex.: 1/2 = 0,50 -> correto      |");
        System.out.println("|       1/2 = 0.50 -> errado       |");
        System.out.println("|                                  |");
        System.out.println("|__________________________________|");
        System.out.println();
        System.out.println(" ____VAMOS LA! PODE COMECAR:____ ");
        System.out.println();

    }
    
}
