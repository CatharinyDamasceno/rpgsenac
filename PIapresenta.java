package piapresenta;
import java.util.Scanner;
import java.util.Random;
public class PIapresenta {

static Scanner sc=new Scanner(System.in);
static Random rd=new Random();
// Menu do Projeto função feita apenas para visualizar
    static void MenuMount() {
        System.out.println("Menu:");
        System.out.println("1-Instruções");
        System.out.println("2-Jogar");
        System.out.println("3-Créditos");
        System.out.println("4-Sair");
    }

//Opções do Menu Com trava de aceitação
    static byte Options() {
        byte opc;
        opc = sc.nextByte();
        while (opc < 1 || opc > 4) { // aceitos apenas numeros de 1 a 4
            System.err.println("Digite uma opção válida");
            opc = sc.nextByte();
        }
        return opc;
    }

//Switch case Da Opção
    static void PrintOut(byte opcao) {

        switch (opcao) {
            case 1: // Se digitado 1 o case chama a função Instruções
                System.out.println("Instruções");
                Instructions(); // Função de imprimir as Instructions
                break;
            case 2: // Se digitado 2 é chamado a função Battle, onde esta o código do jogo
                System.out.println("Jogar");
                Battle(); // Função do jogo
                break;
            case 3: // Digitado 3 o case joga o usuario para a função credito
                System.out.println("Créditos");
                Credits(); // Função onde esta o texto de Credits
                break;
            case 4: // Digitado 4 o usuario deseja encerrar o programa
                System.out.println("Sair");
                System.out.println("Boa Sorte Batman \n");
                break;
        }
    }

    static void Instructions() {
        String cont;
        System.out.println("O jogo é baseado no universo fictício de Batman Arkhamn \numa serie de jogos do cavaleiro das trevas, neste jogo Batman adentrou no covil \n"
                + "de seu inimigo Charada, onde percebeu ser uma armadilha, Batman agora precisa sair do covil \n"
                + "antes que seja derrotado pelos capangas do Charada, pois o covil esta cheio deles e em meio a essa cena, Batman precisa \n"
                + "enfrentar os inimigos podendo ser trocados socos, ataque de equipamentos ou até mesmo responder uma charada de seu inimigo para sair \n"
                + "de uma armadilha com vida! \n"
                + "Será apresentado de forma numerada as opções de ataques e de respostas para charadas \n"
                + "O usário deverá escolher numero da opção desejada de forma correspondente \n"
                +"O Jogador vence ao concluir todas as Charadas com a vida maior que Zero \nAperte 9 a qualquer momento para fechar o jogo"
        );
        System.out.println("\nDigite Ok Para voltar ao menu Inicial");
        cont = sc.next();
    }

    static void Credits() {
        String cont;

        System.out.print("Arkham City \n");
        System.out.print("RPG desenvolvido para conclusão do Projeto Integrador - Desenvolvimento de Lógica \n \n");
        System.out.print("Programadores: \n" + "Brendo Rotta Machado \n" + "Carlos Henrique de Oliveira Santos \n" + "Cathariny Lopes Damasceno \n" + "Marcos Vinicius Rodrigues Ribeiro \n \n");

        System.out.println("Digite Ok Para voltar ao menu Inicial");
        cont = sc.next();
    }

    static int Riddles(int[] vet, int controlQuest) {
        String[][] QuestionList = new String[20][6]; //Matriz de 20 questoes e 6 linhas, onde 1 é a pergunta 4 alternativas e 1 resposta correta!
        int cont = controlQuest; // Controlador de posição do vetor Scrambled 
        int res; // resposta do usuario
        int ac=0; // Usado para pegar o acerto
        int[] opc = Option(); //O vetor das opções chama a função de embaralhar o vetor, para toda vez que entrar 
        // na função charada seja embaralhanda de maneira nova e aleatoria novamente
        QuestionList[0][0] = "\n\nPosso começar uma guerra ou acabar com ela.\nPosso lhe dar a força dos heróis ou deixá-lo importante.\nPosso ser capturado com um olhar, mas nenhuma força me obriga a ficar.\nQuem eu sou?";
        QuestionList[0][1] = "Amor";
        QuestionList[0][2] = "Bomba ";
        QuestionList[0][3] = "Inteligência";
        QuestionList[0][4] = "Estratégia";
        QuestionList[0][5] = "Amor";

        QuestionList[1][0] = "Posso ocupar uma sala ou apeas um coração.\nOutros podem me ter, mas não posso ser dividido.\nQuem eu sou?";
        QuestionList[1][1] = "Oxigênio";
        QuestionList[1][2] = "Amor";
        QuestionList[1][3] = "Solidão";
        QuestionList[1][4] = "Ódio";
        QuestionList[1][5] = "Solidão";

        QuestionList[2][0] = "Insiste em me ignorar e finalmente quando me vou, você luta para me ter de volta.\nQuem eu sou?";
        QuestionList[2][1] = "Crush";
        QuestionList[2][2] = "Tempo";
        QuestionList[2][3] = "A ex";
        QuestionList[2][4] = "Amor";
        QuestionList[2][5] = "Tempo";

        QuestionList[3][0] = "O que há em nenhuma parte mas em todos os lugares, exceto quando algo é?";
        QuestionList[3][1] = "Ar";
        QuestionList[3][2] = "Esperança ";
        QuestionList[3][3] = "Nada";
        QuestionList[3][4] = "Átomo";
        QuestionList[3][5] = "Nada";

        QuestionList[4][0] = "Sinto seus movimentos, conheço seus pensamentos pensamentos, estou contigo desde o nascer e eu vou vê-lo apodrecer.\nO que eu sou?";
        QuestionList[4][1] = "Reflexo";
        QuestionList[4][2] = "Conhecimento";
        QuestionList[4][3] = "Medo";
        QuestionList[4][4] = "Coração";
        QuestionList[4][5] = "Reflexo";

        QuestionList[5][0] = "Eu sou aquilo que não pode ser questionada.\nEu sou aquilo que as pessoas dizem procurar.\nEu sou aquilo que as pessoas costumam dizer que sabem.\nEu sou aquilo que não existe em totalide mesmo sendo supostamente universal.\nO que eu sou?";
        QuestionList[5][1] = "Mentira";
        QuestionList[5][2] = "Opnião";
        QuestionList[5][3] = "Verdade";
        QuestionList[5][4] = "Provas";
        QuestionList[5][5] = "Verdade";

        QuestionList[6][0] = "Posso trazer lágrimas em seu rosto, sou criado em um instante mas duro a vida toda.\nO que eu sou?";
        QuestionList[6][1] = "Emoções";
        QuestionList[6][2] = "Memórias";
        QuestionList[6][3] = "Piadas";
        QuestionList[6][4] = "Traumas";
        QuestionList[6][5] = "Memórias";

        QuestionList[7][0] = "Eu falo, mas não tenho boca.\nEu ouço, mas não tenho ouvidos.\nNão tenho corpo, mas vivo com o vento.\nQuem sou eu?";
        QuestionList[7][1] = "Silêncio ";
        QuestionList[7][2] = "Eco";
        QuestionList[7][3] = "Siren Head";
        QuestionList[7][4] = "Consciência";
        QuestionList[7][5] = "Eco";

        QuestionList[8][0] = "Eu sou algo que as pessoas amam ou odeiam.\nEu mudo tanto a aparência das pessoas quanto seus pensamentos.\nSe uma pessoa cuida de si mesma, eu subo ainda mais.\nEu engano algumas pessoas.\nE para outras, sou um verdadeiro mistério.\nAlgumas pessoas bem que tentam me esconder, mas uma hora, inevitavelmente, eu apareço.\nNão importa o que as pessoas tentem, eu jamais cairei.\nQuem sou eu?";
        QuestionList[8][1] = "Cabelo ";
        QuestionList[8][2] = "Altura ";
        QuestionList[8][3] = "Peso";
        QuestionList[8][4] = "Idade";
        QuestionList[8][5] = "Idade";

        QuestionList[9][0] = "Tenho quatro vezes a idade do meu filho.\nDentro de 20 anos, terei exatamente o dobro da idade dele.\nQuantos anos eu tenho? Quantos anos meu filho tem?";
        QuestionList[9][1] = "Eu tenho 40 anos e meu filho tem 10";
        QuestionList[9][2] = "Eu tenho 39 anos e meu filho tem 10";
        QuestionList[9][3] = "Eu tenho 41 anos e meu filho tem 12";
        QuestionList[9][4] = "Eu tenho 35 anos e meu filho tem 15";
        QuestionList[9][5] = "Eu tenho 40 anos e meu filho tem 10";

        QuestionList[10][0] = "Sou cheio de buracos, mas ainda assim consigo reter muita água.\nQuem sou eu?";
        QuestionList[10][1] = "Rua";
        QuestionList[10][2] = "Esponja";
        QuestionList[10][3] = "Bueiro";
        QuestionList[10][4] = "Ocenano";
        QuestionList[10][5] = "Esponja";

        QuestionList[11][0] = "Quando precisa de mim, você me atira para longe, até um lugar onde ninguém pode me ver.\nMas quando já não precisa mais, você me traz de volta.\nQuem sou eu?";
        QuestionList[11][1] = "Boomerang ";
        QuestionList[11][2] = "Ancora";
        QuestionList[11][3] = "Foguete";
        QuestionList[11][4] = "Flecha";
        QuestionList[11][5] = "Ancora";

        QuestionList[12][0] = "Um limpador de janelas está limpando uma janela no 25º andar de um prédio quando, por um mero descuido, ele escorrega e cai.\nEle não estava usando equipamentos de segurança e não havia nada embaixo para evitar sua queda.\nNo entanto, ele não sofre um único arranhão.\nComo isso é possível?";
        QuestionList[12][1] = "Ele se transformou no Hulk";
        QuestionList[12][2] = "Ele estava limpando a janela do lado de dentro do prédio.";
        QuestionList[12][3] = "Ele caiu em cima do colchão  ";
        QuestionList[12][4] = "Um mero imortal ";
        QuestionList[12][5] = "Ele estava limpando a janela do lado de dentro do prédio.";

        QuestionList[13][0] = "Ana teve 5 filhas. A primeira chama-se Segunda!\nA segunda chama-se Terça!\nA terceira chama-se Quarta!\nA quarta chama-se Quinta!\nQual é o nome da quinta?";
        QuestionList[13][1] = "Sabado";
        QuestionList[13][2] = "Sexta ";
        QuestionList[13][3] = "Domingo";
        QuestionList[13][4] = "Quinta";
        QuestionList[13][5] = "Quinta";

        QuestionList[14][0] = "Há um pato entre dois patos, um pato atrás de um pato e um pato na frente de outro pato.\nDe quantos patos estamos falando?";
        QuestionList[14][1] = "3 Patos";
        QuestionList[14][2] = "4 Patos";
        QuestionList[14][3] = "2 Patos";
        QuestionList[14][4] = "1 Pato";
        QuestionList[14][5] = "3 Patos";

        QuestionList[15][0] = "Ponha os dedos em mim que eu abrirei as minhas potentes mandíbulas.\nE vou devorar tudo o que vier pela frente.\nQuem sou eu?";
        QuestionList[15][1] = "Cobra";
        QuestionList[15][2] = "Tesoura";
        QuestionList[15][3] = "Crush morrendo de fome";
        QuestionList[15][4] = "Ratoeira";
        QuestionList[15][5] = "Tesoura";

        QuestionList[16][0] = "Eu posso guardar tudo dentro de mim.\nTudo o que você pode imaginar: o vento, as florestas, o mundo, o universo e até Deus.\nTudo o que vier à sua cabeça você pode encontrar dentro de mim.\nQuem sou eu?";
        QuestionList[16][1] = "Imaginação ";
        QuestionList[16][2] = "Cofre";
        QuestionList[16][3] = "Alfabeto";
        QuestionList[16][4] = "Carteira";
        QuestionList[16][5] = "Alfabeto";

        QuestionList[17][0] = "Quem me faz não diz que faz.\nUma pessoa pode me dar para outra.\nQuem me tem não sabe que tem.\nE quem sabe não me quer ter de jeito nenhum.\nQuem sou eu?";
        QuestionList[17][1] = "Dinheiro Falso";
        QuestionList[17][2] = "Traição";
        QuestionList[17][3] = "Doença";
        QuestionList[17][4] = "Chifre";
        QuestionList[17][5] = "Dinheiro Falso";

        QuestionList[18][0] = "Um gato persegue um rato.\nEnquanto o gato dá 2 pulos o rato dá 3, mas cada pulo do gato vale 2 pulos do rato.\nSe a distância entre eles inicialmente é de 30 pulos de gato.\nQuantos pulos o gato terá dado até alcançar o rato?";
        QuestionList[18][1] = "O gato tem que dar 120 pulos";
        QuestionList[18][2] = "O gato tem que dar 125 pulos";
        QuestionList[18][3] = "O gato tem que dar 130 pulos";
        QuestionList[18][4] = "O gato tem que dar 115 pulos";
        QuestionList[18][5] = "O gato tem que dar 120 pulos";

        QuestionList[19][0] = "João é mais velho que Pedro, que é mais novo que Carlos;\nAntônio é mais velho do que Carlos, que é mais novo do que João.\nAntônio não é mais novo do que João e todos os quatros meninos tem idades diferentes.\nQuem é o mais jovem?";
        QuestionList[19][1] = "Pedro";
        QuestionList[19][2] = "Carlos";
        QuestionList[19][3] = "Antonio";
        QuestionList[19][4] = "Pedro e Antonio";
        QuestionList[19][5] = "Pedro";

        //Mensagem de saida usando o vetor Scrambled com a posição sendo o controQuest para dar a linha
        //E opções usando outro vetor Scrambled
        System.out.println("\n" + (cont + 1) + ") " + QuestionList[vet[cont]][0] + "\n\tAlternativas: \n1: " + QuestionList[vet[cont]][opc[0]] + "\n2: " + QuestionList[vet[cont]][opc[1]]
                + "\n3: " + QuestionList[vet[cont]][opc[2]] + "\n4: " + QuestionList[vet[cont]][opc[3]]);
        do{
            res = sc.nextInt();
        }while(res<1 || res>4 && res!=9);

        if (res!=9) { //Se a pessoa digitar 9 as questões são puladas 
            res--; //Uma decrementação da resposta que o usuario digitou, para bater
            // com a posição lógica do vetor
            if (QuestionList[vet[cont]][opc[res]].equals(QuestionList[vet[cont]][5])) {
                 ac++; // Caso o Usuario acerte a questão, o acerto volta como 1
                       // Assim acrecentando na pontuação
                 falas(ac);
                
            }else{
                falas(ac);
                System.out.println("A resposta Certa era: " + QuestionList[vet[cont]][5] + "\n");
            } // Mensagem caso o Usuario Erre a pergunta
        }else if(res==9){
            ac=res;
        } // Caso a Pessoa digite 9 em meio da pergunta 
        // O acerto volta como 9 Para que o programa seja totalmente encerrado 
        return ac;
    }   // Chave da função das perguntas e seu sistema de acertos
    
    static void falas(int ac){
    String[][]fl=new String[2][4];
    int res=rd.nextInt(4);
    fl[0][0]="\nEu Sabia que não conseguiria acertar hahaha \nÉ demais mesmo para você Batman";
    fl[0][1]="\nOque foi Batman?? \nNão consegue pensar estando sobre pressão? hahahahaha";
    fl[0][2]="\nSabe, acho que te superestimei Batman \nVocê não é tudo isso hahahha";
    fl[0][3]="\nSeria mais divertido se você fosse inteligente Batman";
    
    fl[1][0]="\nOque?? como??? \nNão tinha como você Saber éssa";
    fl[1][1]="\nEu não sei como... \nMas você esta trapaceando";
    fl[1][2]="\nGRRRRR É impossivel que alguem Consiga responder essa nessa situação";
    fl[1][3]="\nComo é que você está obtendo as respostas Morcego Trapaceiro??";
    
        System.out.println(fl[ac][res]);}

    static int[] Scrambled() {  // Embaralhar os conteudos da posições dos vetores 
        int perg[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}; // Vetor declarado 
        int x, y; //Parametros usados para as posições do vetor
        int temp;

        for (int i = 0; i <= 30; i++) {  // Laço para criar os Numeros
            x = rd.nextInt(20); // Primeiro numero de 0 a 19
            y = rd.nextInt(20); // Segundo numero de 0 a 19

            temp = perg[x];   // A variavel tem guarda o valor do vetor de posição x
            perg[x] = perg[y]; // o vetor com posição x recebe o y
            perg[y] = temp; // o y recebe o x que foi guardado
        }

        return perg;  // Retorno do vetor Scrambled
    }

    static int[] Option() {    // Embaralhar as posições de 1 a 4 que sera as colunas da resposta
        int[] resp = {1, 2, 3, 4};
        int tem, x, y;

        for (int i = 0; i <= 40; i++) {
            x = rd.nextInt(4);
            y = rd.nextInt(4);
            tem = resp[x];
            resp[x] = resp[y];
            resp[y] = tem;
        }

        return resp;
    }

    static int UserAttack() {
        int ecl, i = 0;
        do {
            if (i > 0) {
                System.out.println("Digite uma opção valida \n");
            }
            System.out.println("Escolha seu ataque:");
            System.out.println("(1) - Golpe de Luta");
            System.out.println("(2) - Batarang");
            ecl = sc.nextInt();
            i++;
        } while (ecl < 1 || ecl > 2 && ecl != 9);
        return ecl;
    }

    static int ComputerAttack() {
        return rd.nextInt(4) + 1;
    }

    static void PrintsHP(int hpUsuario, int hpComputador, int contagemEspeciais, int i) {
        System.out.println("==================");
        System.out.println("!! Adversario " + i + " !!");
        System.out.println("- HP Usuario " + hpUsuario);
        System.out.println("- HP Adversario " + hpComputador);
        System.out.println("* Contagem especiais: " + contagemEspeciais);
        System.out.println("==================");
    }

    static int Difficulty() {
        int dif, i = 0;
        do {
            if (i > 0) {
                System.out.println("Digite uma opção valida");
            }
            System.out.println("Selecione uma opção de dificuldade:");
            System.out.println("1-Facil \n2-Médio \n3-Dificil");
            dif = sc.nextInt();
            i++;
        } while (dif < 1 || dif > 3);
        return dif;
    }

    static void Battle() { // Função do jogo
        int dificuldade = Difficulty();
        int hpUsuario = 150;
        int hpComputador = 10;
        int contagemEspecial = 5;
        int escolhaAtaque = 1;
        int i = 1; // Si
        int controlQuest = 0; // controlador de posições de perguntas
        int[] vet = Scrambled(); // um vetor para pegar os numeros embaralhados
        int resposta, ac = 0;

        while (hpUsuario>0 && escolhaAtaque!=9 && controlQuest<20) {
            if (hpComputador <= 0) {
                hpComputador = 10+(2*i);
            }else if(hpComputador>0) {
                hpComputador += 2;
            }
            if(hpUsuario>0 && controlQuest<20) {
                if(escolhaAtaque!=9){
                    PrintsHP(hpUsuario, hpComputador, contagemEspecial, i);
                    escolhaAtaque = UserAttack();
                }

                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("\nBatman aplicou uma Voadora. ");
                        hpComputador -= 7;
                        break;
                    case 2:
                        if (contagemEspecial<=0){
                            System.out.println("\nBatman não possui no momento o \n"
                                    + " Batarang em seu cinto");
                        }else{
                            System.out.println("\nBatman acertou um Batarang");
                            hpComputador -= 20;
                            contagemEspecial--;
                        }
                        break;
                    case 9:
                        System.out.println("\nFechando o jogo...");
                        break;
                }
                if (hpComputador>0 && escolhaAtaque!=9 && controlQuest<20){
                    escolhaAtaque = ComputerAttack();

                    switch (escolhaAtaque){ // Ataque do computador vem de um random de 1 a 4
                        case 1:
                            System.out.println("=== Adversario aplicou um soco. ===");
                            hpUsuario -= (6*dificuldade); // Dano vezes a dificuldade escolhida
                            break;
                        case 2:
                            System.out.println("=== Adversario aplicou um chute. ===");
                            hpUsuario -= (7*dificuldade);
                            break;
                        case 3:
                            if(dificuldade==3){  //Um if de Mecanica de bloqueio do Ataque inimigo
                            int bloc=rd.nextInt(10)+1; // Gerar um numero de 1 a 3
                            if(bloc==3 || bloc==7 || bloc==10){System.out.println("Batman conseguiu Defender o especial do inimigo"); // Se sair 3 o golpe é defendido
                            }else{System.out.println("=== Adversario aplicou um ataque especial. ==="); // Se sair outro numero o jogador leva o golpe
                            hpUsuario -= (10*dificuldade);} // e toma dano normalmente 
                            }else{ // se não estiver no nivel dificil Não tem a opção de defender 
                            System.out.println("=== Adversario aplicou um ataque especial. ===");
                            hpUsuario -= (10*dificuldade);}
                            break;
                        case 4:
                            System.out.println("Caiu na minha armadilha Morcego tolo hahahahaha \nTenta sair dessa agora \nAHAHAHAH (Risada maligna)");
                            resposta = Riddles(vet,controlQuest); // Chamando a função das Riddles com os acertos
                            controlQuest++; // controlador de posição para a matriz de charadas 
                            switch (resposta) { // se o retorno da matrix for 1 A pessoa acertou a charada
                                hpComputador -= 1000; // O adversario perde de imediato
                                ac += resposta; // E é acrescentado 1 para a variavel que ira mostrar os acertos 
                                hpUsuario += 8; // e recupera um pouco de Vida pelo acerto
                            } else if (resposta == 0) { // Retorno de 0 A pessoa errou a charada 
                                hpUsuario -= (20 * dificuldade); // Toma o maior dano do jogo
                            } else if (resposta == 9) { // If para que se o usuario digitar 9 
                                escolhaAtaque = 9;      // enquanto esta nas Riddles
                                System.out.println("\nFechando o jogo...");
                            }
                            break;
                    }
                }
            } // Chave do IF para só rodar o ataque 
            //caso os Hps sejam maior que zero e as Riddles não tenham acabado

            if(hpComputador<=0 && controlQuest<20){   // Mensagem de saida caso um Oponente seja derrotado
                System.out.println("Adversario Derrotado");
                i++;
            }

            if (hpUsuario>0) { // Reposição de HP do Usuario
                if (i>10) {
                    hpUsuario += (5 * dificuldade);
                } else if (dificuldade == 3) {
                    hpUsuario += 12;
                } else {
                    hpUsuario += 6;
                }

                if (hpUsuario > 150) {
                    hpUsuario = 150;
                }// Trava para limite de vida

                if (i % 10 == 0) { // Reposição de especial do Usuario
                    contagemEspecial++; // A cada 10 loop 1 ganha 1 especial
                    if (contagemEspecial > 5) {
                        contagemEspecial = 5;
                    } // Trava nos limites do Especial    
                } // IF de reposição dos especiais
            }// Conjunto de reposição: Vida e especial, caso o Usuario tenha HP 
        } //Laço de repetição da batalha

        if (escolhaAtaque != 9 && hpUsuario > 0) {  // Mensagem de saida caso O jogador vença 
            System.out.println("Você Venceu com: " + ac + " Acertos");
            if (ac <= 11) {  // Mensagem de Classificação
                System.out.println("Categoria Bronze \n\n");
            } else if (ac > 11 && ac < 16) { // Mensagem de Classificação
                System.out.println("Categoria Prata \n\n");
            } else if (ac >= 16) { // Mensagem de Classificação
                System.out.println("Categoria Ouro \n\n");
            }

        } else if (escolhaAtaque!=9 && hpUsuario <= 0) {   // Mensagem de saida caso O jogador Perca
            System.out.println("Sabe Batman... Você perdeu HAHAHAHAH \n EU COOONSEGUIII \n");
        }
    }

    public static void main(String[] args) {
        byte opcao;
        do {
            MenuMount();       //Chamando a Função 
            opcao = Options();   //Opção em Numeros Para O Switch
            PrintOut(opcao);   //Opção Switch 
        } while (opcao < 4 && opcao > 0); // Loop do Menu Para só sair na opção 4

    }
}
