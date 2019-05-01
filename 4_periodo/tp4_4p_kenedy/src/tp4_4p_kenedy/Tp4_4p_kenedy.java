/*
 * Programa para calcular a Formula Interpolatoria de Newton
 * Feito por: ANDERSON DOS SANTOS DE BARROS
 * 12:55 21/11/2018
 */
package tp4_4p_kenedy;

import Package1.Leitura;
import Package1.MethodNewton;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Tp4_4p_kenedy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float[][] MatrixMain = new float[2][MethodNewton.getTAM() + 1];
        float[][] MatrixFinal;
        double x;
        int opcao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de X:");
        x = Double.parseDouble(ler.next().trim());
        System.out.println("Escolha:\n1) Digitar a matriz\n2) Ler a matriz do arquivo");
        opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                MethodNewton.Fill(MatrixMain);
                break;
            case 2:
                Leitura.Leitura("dados.txt", MatrixMain);
                break;
        }
        MatrixFinal = MethodNewton.Calc(MatrixMain);
        System.out.println("\n\nO resultado é: " + MethodNewton.Formula(MatrixFinal, MatrixMain, x));
    }

}
