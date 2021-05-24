package sprint1;
import java.util.Scanner;

public class SprintCompleto {
static Scanner sc=new Scanner(System.in);


// Menu do Projeto
static void MontarMenu(){
System.out.println("Menu:");
       System.out.println("1-Instruções");
       System.out.println("2-Jogar");
       System.out.println("3-Créditos");
       System.out.println("4-Sair");
}

//Opções do Menu Com trava de aceitação
static byte Opcoes(){
byte opc;

    opc=sc.nextByte();
while(opc<1 || opc>4){
       System.err.println("Digite uma opção válida");
    opc=sc.nextByte();
}
return opc;
}

//Switch case Da Opção
static void Imprimir(byte opcao){

    switch(opcao){
         case 1:
                System.out.println("Instruções");
                instruções();
                break;
            case 2:
                System.out.println("Jogar");
                
                break;
            case 3:
                System.out.println("Créditos");
                créditos();
                break;
            case 4:
                System.out.println("Sair");
                System.out.println("Boa Sorte Batman");
                break;
    }
}

static void instruções(){
    String cont;    
    System.out.println("O jogo se baseia em uma luta entre Batman e seu inimigo Charada e seus capangas, dentro de seu covil maléfico \n"
                + "onde em meio a essa luta frenética, podem ser trocados socos, especiais ou até mesmo responder uma charada para sair com vida de lá! \n "
                + "Será apresentado as opções de ataques e de resposta e o usário deverá escolher-lá da froma correspondente \n"
                + "Seus pontos ficarão salvos para que jamais perca sua atitude heroíca e sua grandeza \n \n");
    System.out.println("Digite O.k Para voltar ao menu Inicial");
    cont=sc.next();
}

static void créditos(){
      String cont;

        System.out.print("Arkham City \n");
        System.out.print("RPG desenvolvido para conclusão do Projeto Integrador - Desenvolvimento de Lógica \n \n");
        System.out.print("Programadores: \n" + "Brendo Rotta Machado \n" + "Carlos Henrique de Oliveira Santos \n" + "Cathariny Lopes Damasceno \n" + "Marcos Vinicius Rodrigues Ribeiro \n \n");

        System.out.println("Digite O.k Para voltar ao menu Inicial");
        cont = sc.next();
}


public static void main(String[] args) {
byte opcao;

do{
MontarMenu();       //Chamando a Função 
opcao=Opcoes();    //Opção em Numeros Para O Switch
Imprimir(opcao);   //Opção Switch 

}while(opcao<4 && opcao>0);



}}