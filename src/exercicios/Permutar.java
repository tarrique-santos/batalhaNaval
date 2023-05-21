package exercicios;

    import java.util.Random;
    import java.util.Scanner;

public class Permutar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerar = new Random();
        
        boolean encontrado=false;
        System.out.printf("Digite o número de casas para o vetorA e vetorB:");
        int n=ler.nextInt();

        int vetA[]=new int[n];
        int vetB[]=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o valor do vetorA[%d]:",i);
            vetA[i]=ler.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o valor do vetorB[%d]:",i);
            vetB[i]=ler.nextInt();
        }
        for (int i = 0; i < vetA.length; i++) {
            int verifica = vetA[i];
            for (int j = 0; j < vetB.length; j++) {
                if (verifica == vetB[j]) {
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.printf("Não é uma permutação!\n\n");
        }else{
            System.out.printf("É uma permutação!\n\n");
        }
    }
}