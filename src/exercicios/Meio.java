package exercicios;

import java.util.Scanner;
import java.util.Random;

public class Meio {
    public static void main(String[] args) {
        Random gerar = new Random();
        Scanner ler = new Scanner(System.in);

        boolean teste=true;
        int n=0;

        while(teste){
            System.out.printf("Digite um número impar para continuar:");
            n=ler.nextInt();
            if(n%2!=0){
                teste=false;

            }else System.out.printf("Número par digitado!\n");
        }
        int mat[][]=new int[n][n];
        int meio=n/2;
        int num=0;
        System.out.printf("A matriz %d x %d é\n\n",n,n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=gerar.nextInt(0,25);
                if(i==meio && j ==meio){
                    mat[i][j]=n;
                    num=mat[i][j];
                }
                System.out.printf("%02d ",mat[i][j]);
         }System.out.println();           
        }
        System.out.printf("O número no centro é %d!\n\n",num);
    }
}
