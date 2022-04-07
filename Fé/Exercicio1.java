package valedosdesesperados;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class ValedosDesesperados {

    /**
     * @MonHardy
     */
    
    public static void main(String[] args) throws IOException {
    String nome, pedidoCompleto, status, nomeProduto; int quantidade;
    Scanner input = new Scanner(System.in); Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente: ");
    nome = input.nextLine();

    System.out.println("Informe se o pedido está completo: ");
    status = input.next();
    
    // ------ Com switch -------
    /*switch(status){
        case "nao":
            String nomeProduto;
            System.out.println("Informe o nome do pedido: ");
            nomeProduto = scanner.nextLine();
            
            System.out.println("Informe a quantidade desejada: ");
            quantidade = input.nextInt();
            break;
            
        case "sim":
            System.out.println("O pedido já foi encaminhado para a cozinha.");
            break;
    }
    */

    // ------- Com if e else -------
    
   if(status.equals("N")|| status.equals("nao")){
      System.out.println("Informe o nome do pedido: ");
      nomeProduto = scanner.nextLine();
      // nomeProduto = input.next(); input.next(); -- Só aceita dois
      // nomeProduto = input.next() + input.next(); -- Só aceita dois
      // nomeProduto = input.nextLine(); -- Pula a pergunta
      // nomeProduto = input.next(); -- Só aceita um nome
      // nomeProduto = scanner.nextLine(); -- recebe, aleluia, GLÓRIA DEUX --
     
     // Explicação desse comentário sem sentido: Eu queria nome composto, eu não sabia como e fiquei tentando todas as possibilidades. XD'
      
      System.out.println("Informe a quantidade desejada: ");
      quantidade = input.nextInt();
   
      }else{
      System.out.println("O pedido já foi encaminhado para a cozinha."); 
      
    }
    }
}
