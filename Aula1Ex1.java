package Aula1.Aula1;

import java.util.Scanner;

public class Aula1Ex1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        String var = entrada.next();
        System.out.println("O valor informado é: " + var);

        System.out.println("Informe outro valor: ");
        int var2 = entrada.nextInt();
        System.out.println("O outro valor informado é: " + var2);
    }
    
}
