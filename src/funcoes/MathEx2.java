package funcoes;

import java.util.Scanner;

public class MathEx2 {
    public static double calculaDelta(int a, int b, int c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }
    public static void calculaX(int a, int b, int c) {
        double delta = calculaDelta(a, b, c);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("O valor de x¹ é %.2f\nO valor de x² é %.2f\n", x1, x2);
        } else {
            System.out.println("Não é possível calcular raízes reais.");
        }
    } 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        char incognita[] = {'a', 'b', 'c'};
        int coeficiente[] = new int[3];
    
        for (int i = 0; i < coeficiente.length; i++) {
            System.out.printf("Digite o coeficiente de %c:", incognita[i]);
            coeficiente[i] = ler.nextInt();  
        }               
        double delta = calculaDelta(coeficiente[0],coeficiente[1],coeficiente[2]);

        System.out.printf("O valor de delta é %.2f\n",delta);
        calculaX(coeficiente[0], coeficiente[1], coeficiente[2]);
    }
}