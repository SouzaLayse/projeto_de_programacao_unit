package Aula1.Aula1;

import java.util.Scanner;

public class Aula1_Exercicio01_02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantidade de maçãs: ");
        int qtd = entrada.nextInt();
        
        do {
            float valor = 0;
            if (qtd < 12 & qtd > 0) {
                valor = (float) (qtd * 0.30);
            } else {
                if (qtd >= 12) {
                    valor = (float) (qtd * 0.25);
                }
            }
            System.out.println("Valor pago: R$" + valor);
            System.out.println("Quantidade de maçãs: ");
            entrada = new Scanner(System.in);
            qtd = entrada.nextInt();
        } while (qtd != 0);      
    }
}
