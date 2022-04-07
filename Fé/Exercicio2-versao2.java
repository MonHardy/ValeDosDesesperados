import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;

public class ValedosDesesperados25 {

      /* --------
      * @MonHardy
        -------- */

     /**
     *  Em um salão de beleza, os procedimentos estéticos são agendados da seguinte forma: primeiramente e perguntada à
        cliente qual seu nome e idade. Daí é perguntado quantos procedimentos ela deseja fazer. Depois de coletadas essas
        informações, uma sequencia, equivalente ao número de procedimentos que a cliente pediu deve acontecer, perguntando o
        nome do procedimento e a data que a cliente está disponível (dica: use vetores).
     */
  
    public static void main(String[] args) {
        String nomeCliente; int idade, i, nProcedimentos;
        Scanner ler = new Scanner(System.in); 
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual seu nome: ");
        nomeCliente = ler.nextLine();
        
        System.out.println("Qual sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("Quantos procedimentos deseja realizar: ");
        nProcedimentos = ler.nextInt();
        
        ArrayList<String> ListaNomeProcedimento = new ArrayList<>();
        ArrayList<String> ListaDataProcedimento = new ArrayList<>();
        
        for(i=1; i<=nProcedimentos;i++){
            System.out.println("Informe o nome do procedimento: ");
            String nomeProcedimento = scanner.nextLine();
            
            System.out.println("Informe a data disponível para o procedimento no formato dd/mm/aaaa: ");
            String dataProcedimento = scanner.nextLine();
            
            ListaNomeProcedimento.add(nomeProcedimento);
            ListaDataProcedimento.add(dataProcedimento);
        }
        
        for(int j=0;j <= nProcedimentos-1;j++){
            System.out.println("O procedimento agendado " + ListaNomeProcedimento.get(j) + " foi marcado para o dia: " + ListaDataProcedimento.get(j));
        }
    }
}
