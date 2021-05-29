package teste;

import java.util.Random;
import java.util.Scanner;

public class RPGjoinha {
    static Scanner sc = new Scanner(System.in);

    
// Menu do Projeto
    static void MontarMenu() {
        System.out.println("Menu:");
        System.out.println("1-Instruções");
        System.out.println("2-Jogar");
        System.out.println("3-Créditos");
        System.out.println("4-Sair");
    }

//Opções do Menu Com trava de aceitação
    static byte Opcoes() {
        byte opc;

        opc = sc.nextByte();
        while (opc < 1 || opc > 4) {
            System.err.println("Digite uma opção válida");
            opc = sc.nextByte();
        }
        return opc;
    }

//Switch case Da Opção
    static void Imprimir(byte opcao) {

        switch (opcao) {
            case 1:
                System.out.println("Instruções");
                instruções();
                break;
            case 2:
                System.out.println("Jogar");
                batalinha();
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

    static void instruções() {
        String cont;
        System.out.println("O jogo se baseia em uma luta entre Batman e seu inimigo Charada e seus capangas, dentro de seu covil maléfico \n"
                + "onde em meio a essa luta frenética, podem ser trocados socos, especiais ou até mesmo responder uma charada para sair com vida de lá! \n "
                + "Será apresentado as opções de ataques e de resposta e o usário deverá escolher-lá da froma correspondente \n"
                + "Seus pontos ficarão salvos para que jamais perca sua atitude heroíca e sua grandeza \n \n");
        System.out.println("Digite O.k Para voltar ao menu Inicial");
        cont = sc.next();
    }

    static void créditos() {
        String cont;

        System.out.print("Arkham City \n");
        System.out.print("RPG desenvolvido para conclusão do Projeto Integrador - Desenvolvimento de Lógica \n \n");
        System.out.print("Programadores: \n" + "Brendo Rotta Machado \n" + "Carlos Henrique de Oliveira Santos \n" + "Cathariny Lopes Damasceno \n" + "Marcos Vinicius Rodrigues Ribeiro \n \n");

        System.out.println("Digite O.k Para voltar ao menu Inicial");
        cont = sc.next();
    }
    
    
    
    static int ataqueUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha seu ataque:");
        System.out.println("(1) - Voadora");
        System.out.println("(2) - Especial");
        return sc.nextInt();

    }

    static int ataqueComputador() {
        Random gerador = new Random();
        return gerador.nextInt(6) + 1;
    }

    static void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais) {
        System.out.println("==================");
        System.out.println("- HP Usuario " + hpUsuario);
        System.out.println("- HP Adversario " + hpComputador);
        System.out.println("* Contagem especiais: " + contagemEspeciais);
        System.out.println("==================");
    }

    static int batalinha() {
        int hpUsuario = 150;
        int hpComputador;
        int contagemEspecial = 5;
        int escolhaAtaque;
        int i =1;
 
        while (hpUsuario > 0) {
            hpComputador = 10 + i;
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Adversario " + i);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            
            while (hpUsuario > 0 && hpComputador > 0) {
                imprimeHP(hpUsuario, hpComputador, contagemEspecial);
                escolhaAtaque = ataqueUsuario();
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Usuario aplicou uma Voadora.\n");
                        hpComputador -= 7;
                        break;
                    case 2:
                        System.out.println("Usuario aplicou um ataque especial.\n");
                        hpComputador -= 20;
                        contagemEspecial--;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                if (hpComputador > 0) {
                    escolhaAtaque = ataqueComputador();
                    Scanner sc = new Scanner(System.in);
                    int  resposta;
                    switch (escolhaAtaque) {
                        case 1:
                            System.out.println("=== Adversario aplicou um soco. ===\n");
                            hpUsuario -= 2 + (int) (i/10);
                            break;
                        case 2:
                            System.out.println("=== Adversario aplicou um chute. ===\n");
                            hpUsuario -= 3 + (int) (i/10);
                            break;
                        case 3:
                            System.out.println("=== Adversario aplicou um ataque especial. ===\n");
                            hpUsuario -= 4 + (int) (i/20);
                            break;
                        case 4:
                            System.out.println("HAHAHAHAHA(Risada maligna)! Você caiu em uma charada! Se acertar você me derrotará");
                            System.out.println("*==============================================================* \n" + 
                                                "Posso começar uma guerra ou acabar com ela.\n" +
                                                "Posso lhe dar a força dos heróis ou deixá-lo impotente.\n" +
                                                "Posso ser capturado com um olhar, mas nenhuma força me obriga a ficar.\n" +
                                                "Quem sou eu? \n"+        
                                                "*==============================================================*");
                            System.out.println("(1) Amor \n" +
                                               "(2) Bomba \n" +
                                               "(3) Inteligência");
                            resposta = sc.nextInt();
                                if(resposta == 1 ){
                                    System.out.println("Maldito, você acertou! Mas nos vemos na próxima! HAHAHAHAHA (Risada maligna)");
                                    hpComputador -= 1000;
                                }else{
                                    System.out.println("Resposta ERRADA HAHAHAHAHA (Risada maligna)");
                                    System.out.println("Não vou contar qual é a reposta hehehehe");
                                    hpUsuario -= 4 + (int) (i/20);
                                }
                                break;
                        case 5:
                            System.out.println("HAHAHAHAHA(Risada maligna)! Você caiu em uma charada! Se acertar você me derrotará, se nao, você irá perder hp!");
                            System.out.println("Posso ocupar uma sala ou apenas um coração. Outros podem me ter, mas não posso ser dividido.\n" +
                                                "O que eu sou?\n" +
                                                "*==============================================================*");
                            System.out.println("(1) Oxigênio \n" +
                                               "(2) Amor \n" +
                                               "(3) A solidão");
                            resposta = sc.nextInt();
                                if(resposta == 3 ){
                                    System.out.println("Maldito, você acertou! Mas nos vemos na próxima! HAHAHAHAHA (Risada maligna)");
                                    hpComputador -= 1000;
                                }else{
                                    System.out.println("Resposta ERRADA HAHAHAHAHA (Risada maligna)");
                                    System.out.println("Não vou contar qual é a reposta hehehehe");
                                    hpUsuario -= 4 + (int) (i/20);
                                }
                                break;
                        case 6:
                             System.out.println("HAHAHAHAHA(Risada maligna)! Você caiu em uma charada! Se acertar você me derrotará, se nao, você irá perder hp!");
                            System.out.println("Insiste em me ignorar e finalmente quando me vou, você luta para me ter de volta.\n" +
                                                "Quem eu sou?\n" +
                                                "*==============================================================*");
                            System.out.println("(1) Crush \n" +
                                               "(2) Tempo \n" +
                                               "(3) A ex");
                            resposta = sc.nextInt();
                                if(resposta == 2 ){
                                    System.out.println("Maldito, você acertou! Mas nos vemos na próxima! HAHAHAHAHA (Risada maligna)");
                                    hpComputador -= 1000;
                                }else{
                                    System.out.println("Resposta ERRADA HAHAHAHAHA (Risada maligna)");
                                    System.out.println("Não vou contar qual é a reposta hehehehe");
                                    hpUsuario -= 4 + (int) (i/20);
                                }
                                break;
                    }
                } else {
                    System.out.println("!!! Adversario derrotado! !!!\n");
                }
            }
            if(hpUsuario > 0){
                hpUsuario += 5;
                if(hpUsuario > 150){
                    hpUsuario = 150;
                    
                }
                if(i % 10 == 0){
                    contagemEspecial++;
                    if(contagemEspecial > 5){
                        contagemEspecial = 5;
                    }
                }
            }
            
            i++;
        }
        return i;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continua = 1;
        int recorde = 0;
        
        byte opcao;

        do {
            MontarMenu();       //Chamando a Função 
            opcao = Opcoes();   //Opção em Numeros Para O Switch
            Imprimir(opcao);   //Opção Switch 

        } while (opcao < 4 && opcao > 0);
        
        
        
        
        while (continua == 1) {

            int pontos = batalinha();
            System.out.println("Usuario chegou a " + pontos + " pontos.");
            if(pontos > recorde){
                recorde = pontos;
            }
            System.out.println("RECORDE ATUAL: " + recorde);

            System.out.println("Fim do jogo. Deseja contiuar? (1) Sim (2) Não");
            continua = sc.nextInt();

        }
    }

}


