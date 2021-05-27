package pi;
import java.util.Scanner;
import java.util.Random;
public class PI {
static Scanner sc=new Scanner(System.in);
static Random rd=new Random();
    
// Vetor Embaralhado para as Perguntas    
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

for(int i=0;i<perg.length;i++){   // System.out.printf Usado apenas para teste
    System.out.printf("Vetor Posição [%d]: %d \n",(i+1),perg[i]);
}
return perg;
}
    
static int[] option(){
int[] resp={1,2,3,4};
int tem,x,y;

for(int i=0;i<=40;i++){
x=rd.nextInt(4)+1;
y=rd.nextInt(4)+1;
tem=resp[x];
resp[x]=resp[y];
resp[y]=tem;
}
return resp;
}

    
     
    public static void main(String[] args) {
    embaralhado();
    
    }}