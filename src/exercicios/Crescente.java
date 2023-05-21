package exercicios;

import java.util.Scanner;
import java.util.Random;

public class Crescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerar = new Random();

        int vet[]={18, 7, 12, 3, 15, 20, 6, 11, 5, 19, 2, 9, 17, 10, 4, 8, 14, 1, 16, 13,-96};

        System.out.printf("Digite:\n[ X ] = para iniciar o vetor com valores prontos\n");
        System.out.printf("[ 2 ] = para digitar manualmente\nOpção:");
        char opVet=ler.next().charAt(0);

        int c=0, i=0,j=0;

        if(opVet=='2'){
            for(i=0;i!=20;i++){
                System.out.printf("Digite o valor do vetor[%d]:",i); 
                vet[i]=ler.nextInt();       
        }
        }
            for(i=0;i!=20;i++){
                for(j=0;j!=20;j++){
                    if (vet[j] > vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
            }
            for(i=0;i!=20;i++){
                if(vet[i]!=-96){
                    System.out.printf("%d ",vet[i]);
                }  
            }
        }
    }