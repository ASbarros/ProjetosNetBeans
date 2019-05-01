/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import calculos.auxiliar.formulas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String linha;
        String[] vetor_string;
        ArrayList<Double> lista_double = new ArrayList<>();

        System.out.println("Digite todos os elementos separando-os por espaço!\n");
        linha = scan.nextLine();
        vetor_string = linha.split(" ");

        for (String vetor_string1 : vetor_string) {
            try {
                lista_double.add(Double.valueOf(vetor_string1.trim()));
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        }

        System.out.println("Media: " + formulas.MediaSimples(lista_double));
        System.out.println("Variância: " + formulas.Variacia(lista_double));
        System.out.println("Desvio padrão: " + formulas.DesviuPadrao(lista_double));

    }

}
