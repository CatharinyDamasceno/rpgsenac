package teste;
import java.util.Scanner;
import java.util.Random;
public class Teste {
    static Scanner sc=new Scanner(System.in);
    static Random rd=new Random();
    
    static void charadas(int []vet, int []opc){
String[][] QuestionList = new String[20][6]; //Matriz de 20 questoes e 6 linhas, ode 1 é a pergunta 4 alternativas e 1 resposta correta!
int cont=0;
int res;

        QuestionList[0][0] = "Posso começar uma guerra ou acabar com ela.\nPosso lhe dar a forçados eróis ou deixá-lo importante.\nPosso ser capturado com um olhar, mas nenhuma força me obriga a ficar.\nQuem eu sou?";
        QuestionList[0][1] = "Amor";
        QuestionList[0][2] = "Bomba ";
        QuestionList[0][3] = "Inteligência";
        QuestionList[0][4] = "Nenhuma das alternativas";
        QuestionList[0][5] = "Amor";

        QuestionList[1][0] = "Posso ocupar uma sala ou apeas um coração.\nOutros podem me ter, mas não posso ser dividido.\nQuem eu sou?";
        QuestionList[1][1] = "Oxigênio";
        QuestionList[1][2] = "Amor";
        QuestionList[1][3] = "Solidão";
        QuestionList[1][4] = "Nenhuma das alternativas";
        QuestionList[1][5] = "Solidão";

        QuestionList[2][0] = "Insiste em me ignorar e finalmente quando me vou, você luta para me ter de volta.\nQuem eu sou?";
        QuestionList[2][1] = "Crush";
        QuestionList[2][2] = "Tempo";
        QuestionList[2][3] = "A ex";
        QuestionList[2][4] = "Nenhuma das alternativas";
        QuestionList[2][5] = "Tempo";

        QuestionList[3][0] = "O que há em nenhuma parte mas em todos os lugares, exceto quando algo é?";
        QuestionList[3][1] = "Ar";
        QuestionList[3][2] = "Esperança ";
        QuestionList[3][3] = "Nada";
        QuestionList[3][4] = "Nenhuma das alternativas";
        QuestionList[3][5] = "Nada";

        QuestionList[4][0] = "Sinto seus movimentos, conheço seus pensamentos pensamentos, estou contigo desde o nascer e eu vou vê-lo apodrecer.\nO que eu sou?";
        QuestionList[4][1] = "Reflexo";
        QuestionList[4][2] = "Conhecimento";
        QuestionList[4][3] = "Medo ";
        QuestionList[4][4] = "Coração";
        QuestionList[4][5] = "Reflexo";

        QuestionList[5][0] = "Eu sou aquilo que não pode ser questionada.\nEu sou aquilo que as pessoas dizem procurar.\nEu sou aquilo que as pessoas costumam dizer que sabem.\nEu sou aquilo que não existe em totalide mesmo sendo supostamente universal.\nO que eu sou?";
        QuestionList[5][1] = "Mentira";
        QuestionList[5][2] = "Opnião";
        QuestionList[5][3] = "Verdade";
        QuestionList[5][4] = "Nenhuma das alternativas";
        QuestionList[5][5] = "Verdade";

        QuestionList[6][0] = "Posso trazer lágrimas em seu rosto, sou criado em um instante mas duro a vida toda.\nO que eu sou?";
        QuestionList[6][1] = "Emoções";
        QuestionList[6][2] = "Memórias";
        QuestionList[6][3] = "Piadas";
        QuestionList[6][4] = "Nenhuma das alternativas";
        QuestionList[6][5] = "Memórias";

        QuestionList[7][0] = "Eu falo, mas não tenho boca.\nEu ouço, mas não tenho ouvidos.\nNão tenho corpo, mas vivo com o vento.\nQuem sou eu?";
        QuestionList[7][1] = "Silêncio ";
        QuestionList[7][2] = "Eco";
        QuestionList[7][3] = "Siren Head";
        QuestionList[7][4] = "Alexa";
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
        QuestionList[11][4] = "Nenhuma das outras alternativas";
        QuestionList[11][5] = "Ancora";

        QuestionList[12][0] = "Um limpador de janelas está limpando uma janela no 25º andar de um prédio quando, por um mero descuido, ele escorrega e cai.\nEle não estava usando equipamentos de segurança e não havia nada embaixo para evitar sua queda.\nNo entanto, ele não sofre um único arranhão.\nComo isso é possível?";
        QuestionList[12][1] = "Ele se transformou no Hulk";
        QuestionList[12][2] = "Ele estava limpando a janela do lado de dentro do prédio.";
        QuestionList[12][3] = "Ele caiu em cima do colchão  ";
        QuestionList[12][4] = "Um mero importal ";
        QuestionList[12][5] = "Ele estava limpando a janela do lado de dentro do prédio.";

        QuestionList[13][0] = "Ana teve 5 filhas. A primeira chama-se Segunda!\nA segunda chama-se Terça!\nA terceira chama-se Quarta!\nA quarta chama-se Quinta!\nQual é o nome da quinta.";
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
        QuestionList[15][4] = "Nenhuma das alternativas";
        QuestionList[15][5] = "Tesoura";

        QuestionList[16][0] = "Eu posso guardar tudo dentro de mim.\nTudo o que você pode imaginar: o vento, as florestas, o mundo, o universo e até Deus.\nTudo o que vier à sua cabeça você pode encontrar dentro de mim.\nQuem sou eu?";
        QuestionList[16][1] = "Imaginação ";
        QuestionList[16][2] = "Cofre";
        QuestionList[16][3] = "Alfabeto";
        QuestionList[16][4] = "Carteira";
        QuestionList[16][5] = "Alfabeto";

        QuestionList[17][0] = "Quem me faz não diz que faz.\nQuem me tem não sabe que tem.\nE quem sabe não me quer ter de jeito nenhum.\nQuem sou eu?";
        QuestionList[17][1] = "Dinheiro Falso";
        QuestionList[17][2] = "Traição";
        QuestionList[17][3] = "Doença";
        QuestionList[17][4] = "Nenhuma das alternativas";
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
    
        
        System.out.println(QuestionList[vet[cont]][0]+"\n\tAlternativas: \n1: "+QuestionList[vet[cont]][opc[0]]+"\n2: "+QuestionList[vet[cont]][opc[1]]
        +"\n3: "+QuestionList[vet[cont]][opc[2]]+"\n4: "+QuestionList[vet[cont]][opc[3]]);
        do{
        res=sc.nextInt();
        }while(res<1 || res>4 && res!=9);
        res--;
        
                if(QuestionList[vet[cont]][opc[res]].equals(QuestionList[vet[cont]][5])){
                    System.out.println("Acertou");
                    System.out.println(QuestionList[vet[cont]][opc[res]]);
                }else{
                    System.err.println("Errou");
                    System.out.println(QuestionList[vet[cont]][opc[res]]);
                    System.out.println(QuestionList[vet[cont]][5]);
                }
                
                
                
        
    }
    
    static int[] embaralhado(){
int perg[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19}; // Vetor declarado 
int x,y;
int temp;

for(int i=0;i<=30;i++){  // Laço para criar os Numeros
x=rd.nextInt(20); // Primeiro numero de 0 a 19
y=rd.nextInt(20); // Segundo numero de 0 a 19

temp=perg[x];   // A variavel tem guarda o valor do vetor de posição x
perg[x]=perg[y]; // o vetor com posição x recebe o y
perg[y]=temp; // o y recebe o x que foi guardado
}


return perg;
}
    
static int[] option(){
int[] resp={1,2,3,4};
int tem,x,y;

for(int i=0;i<=40;i++){
x=rd.nextInt(4);
y=rd.nextInt(4);
tem=resp[x];
resp[x]=resp[y];
resp[y]=tem;
}


return resp;
}
    
    public static void main(String[] args) {
   int[]vet=embaralhado();
   int[] opc=option();
    charadas(vet,opc);
   
    
    
    }}