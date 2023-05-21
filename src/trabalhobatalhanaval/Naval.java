package trabalhobatalhanaval;

import java.util.Scanner;
import java.util.Random;

public class Naval {
    
    public static int Alocar(int a=0,int n=0,int t=0) {
        Random gerar = new Random();
        Scanner ler = new Scanner(System.in);

        char angulo[]={'V','H'};
        n=gerar.nextInt(0,9);
        t=gerar.nextInt(0,9);
        a=gerar.nextInt(0,1);

        int i=0,j=0;
        if(a==0){
            for(i=0;i!=10;i++){
                for(j=0;j!=10;j++){
                    if(c<=mapa[j].lenght)        
                }
            }
        }
    }
    public static void main(String[] args) {
        Random gerar = new Random();
        Scanner ler = new Scanner(System.in);

        //mapa do jogo
        char mapa[][]=new char[10][10];
        char navios[][]=new char[10][10];
        //barcos
        String barco4=new String("§§§§");
        String barco3=new String("§§§");
        String barco2=new String("§§");
        String barco1=new String("§");
        //quantidade de barcos
        int b4=4 , b3=3 , b2=2 , b1=1;

        boolean iniciando=true , config=true;
        //indices
        int i=0 , j=0 , c=0 , t=0 , a=0;
        char modo;

        System.out.printf("\t+--Batalha Naval--+\n\n");

        String nick=new String();
        System.out.printf("Digite o seu nickname:");
        nick=ler.next();
        
        while(iniciando){
            for(i=0;i!=10;i++){
                 for(j=0;j!=10;j++){
                        
                }
            }
            System.out.printf("[0] Iniciar batalha naval\n");
            System.out.printf("[1] Sair do jogo\n");
            System.out.printf("Opção:");
            char op=ler.next().charAt(0);

            switch(op){
                case '0':
                    System.out.println("    A   B   C   D   E   F   G   H   I   J");
                    for(i=0;i!=10;i++){
                        System.out.printf("%d ",i);
                        for (j=0;j!=10;j++){
                            mapa[i][j]='?';
                            System.out.printf("| %c ",mapa[i][j]);
                            
                        }System.out.println("|");
                        System.out.println("  _________________________________________");
                    }     
                    iniciando=false;
                break;
                
                case '1':
                    iniciando=false;
                    config=false;
                    System.out.printf("Saindo[...]\n\n\n");
                break;

                default:
                    System.out.printf("Opção Inválida!!\n");
            }
            
            do{              
                System.out.printf("Você possui %d barco de 4 slots/destroyer\n",b4);
                System.out.printf("Você possui %d barco(s) de 3 slots/fragata(s)%n",b3);
                System.out.printf("Você possui %d barco(s) de 2 slots/navio(s)\n",b2);
                System.out.printf("Você possui %d barco(s) de 1 slot/submarino(s)%n",b1);

                System.out.printf("[ S ] = adicionar barcos de forma manual\n[ N ] = adicionar barcos de forma automática\n");
                System.out.printf("Opção:");
                modo=ler.next().charAt(0);
                if(modo=='S'){
                    System.out.println("    A   B   C   D   E   F   G   H   I   J");
                    for(i=0;i!=10;i++){
                        System.out.printf("%d ",i);
                        for (j=0;j!=10;j++){
                            t=gerar.nextInt(0,9);
                            c=gerar.nextInt(0,9);
                           
                            System.out.printf("| %c ",mapa[i][j]);
                            
                        }System.out.println("|");
                        System.out.println("  _________________________________________");
                    }     
                    Alocar(a,n,t);
                    config=false;
                }else if(modo=='N'){
                    config=false;
                }

            }while(config);
        }
    }
}