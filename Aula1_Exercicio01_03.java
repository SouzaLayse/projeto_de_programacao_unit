package Aula1.Aula1;

import java.util.Scanner;

public class Aula1_Exercicio01_03 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantidade de maçãs: ");
        int qtd = entrada.nextInt();
        while (qtd != 0) {
            float valor = 0;
            if (qtd < 0) {
                System.out.println("Entrada inválida!");
                break;
            } else {
                if (qtd < 12) {
                    valor = (float) (qtd * 0.30);
                } else {
                    if (qtd >= 12) {
                        valor = (float) (qtd * 0.25);
                    }
                }
            }
            System.out.println("Valor pago: R$" + valor);
            System.out.println("Quantidade de maçãs: ");
            entrada = new Scanner(System.in);
            qtd = entrada.nextInt();
        }
    }   
}
