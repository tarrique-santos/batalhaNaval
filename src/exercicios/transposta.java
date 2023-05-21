package exercicios;

import java.util.Random;
import java.util.Scanner;

public class transposta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerar = new Random();

        System.out.printf("Digite o número de linhas da matriz:");
        int l=ler.nextInt();

        System.out.printf("Digite o número de colunas da matriz:");
        int c=ler.nextInt();

        int mat[][]=new int[l][c];
        int inv[][]=new int[c][l];

        System.out.printf("Matriz:\n\n");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=gerar.nextInt(1,99);
                System.out.printf("%02d ",mat[i][j]);
                }System.out.println();
            }System.out.printf("Matriz transposta:\n\n");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < l; j++) {
                    inv[i][j]=mat[j][i];
                    System.out.printf("%02d ",inv[i][j]);
                }System.out.println();        
            }
    }
}
