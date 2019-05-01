/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos.auxiliar;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class formulas {

    public static double MediaSimples(ArrayList<Double> lista) {
        //media simples é o somatorio de todas as medidas dividido pela 
        //quantidade de valores...
        double media = 0;
        for (int i = 0; i < lista.size(); i++) {
            media += lista.get(i);
        }
        media = media / lista.size();
        return media;
    }

    public static double Desvio(double valor, double media) {
        //O desvio padrao é o valor menos a media dos valores...
        return valor - media;
    }

    public static double Variacia(ArrayList<Double> lista) {
        //É a média aritmética dos quadrados dos valores...
        double media = MediaSimples(lista);
        double somatorio = 0;
        for (int i = 0; i < lista.size(); i++) {
            somatorio += Math.pow(Desvio(lista.get(i), media), 2);
        }
        return somatorio / lista.size();
    }

    public static double DesviuPadrao(ArrayList<Double> lista) {
        //É a raiz quadrada da variância...
        return Math.sqrt(Variacia(lista));
    }

}
