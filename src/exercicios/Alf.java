package exercicios;

    import java.util.Random;
    import java.util.Scanner;

public class Alf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerar = new Random();

        String alf="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letra;
        int p=0,p2=0;

        System.out.printf("Digite o número de linhas do caça-palavras:");
        int l=ler.nextInt();
        
        System.out.printf("Digite o número de colunas do caça-palavras:");
        int c=ler.nextInt();

        char caca[][]=new char[l][c];

        System.out.printf("Caça-palavras:\n\n");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                p=gerar.nextInt(0,25);
                letra=alf.charAt(p);
                caca[i][j]=letra;

                System.out.printf("%c ",caca[i][j]);
            }System.out.println();
        }
        System.out.printf("Digite uma palavra para colocar no caça-palavras:");
        String palavra=ler.next().toUpperCase();

        p=gerar.nextInt(0,l);
        p2=gerar.nextInt(0,c);
        for (int i = 0; i < palavra.length(); i++) {
            caca[p][p2]=palavra.charAt(i);
            p2++;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%c ",caca[i][j]);
            }System.out.println();
        }
    }
}
