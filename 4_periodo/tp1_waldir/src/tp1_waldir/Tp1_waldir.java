/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_waldir;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Tp1_waldir {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        String VETOR = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        System.out.println("Digite o valor");
        int valor = ler.nextInt();
        System.out.println("Digite a frase");
        String frase = ler2.nextLine();
        String resultado = "";
        int aux;

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < VETOR.length(); j++) {
                if (Character.toString(frase.charAt(i)).equalsIgnoreCase(Character.toString(VETOR.charAt(j)))) {
                    if (j + valor > VETOR.length()) {
                        aux = valor + j - VETOR.length();
                    } else {
                        aux = valor + j;
                    }
                    resultado = resultado + VETOR.charAt(aux);
                    break;
                }
            }
        }
        System.out.println("valor: " + valor + "\nFrase criptografada: " + resultado);
    }

}
