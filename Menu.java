package sprint1;
import java.util.Scanner;
public class Menu {
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
                
                break;
            case 4:
                System.out.println("Sair");
                System.out.println("Boa Sorte Batman");
                break;
    }
}
}


