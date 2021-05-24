package projetoetp;

import java.util.Scanner;

public class ProjetoEtp {

    static Scanner sc = new Scanner(System.in);

    static void MontarMenu() {
        System.out.println("Menu:");
        System.out.println("1-Instruções");
        System.out.println("2-Jogar");
        System.out.println("3-Créditos");
        System.out.println("4-Sair");
    }

    static byte Opcoes() {
        byte opc;

        opc = sc.nextByte();
        while (opc < 1 || opc > 4) {
            System.err.println("Digite uma opção válida");
            opc = sc.nextByte();
        }
        return opc;
    }

    static void Imprimir(byte Opcoes) {

        switch (Opcoes) {
            case 1:
                System.out.println("Instruções");

                break;
            case 2:
                System.out.println("Jogar");

                break;
            case 3:
                System.out.println("Créditos");

                break;
            case 4:
                System.out.println("Sair");

                break;
        }
    }

    public static void main(String[] args) {
        MontarMenu();
        byte opcao = Opcoes();
        Imprimir(opcao);
}
}
