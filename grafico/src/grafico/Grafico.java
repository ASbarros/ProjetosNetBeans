/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Anderson
 */
public class Grafico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

//        dataset.addValue(10, "maximo", "1");
//        dataset.addValue(20, "maximo", "2");
//        dataset.addValue(30, "maximo", "3");
//        dataset.addValue(40, "maximo", "4");
//        dataset.addValue(70, "maximo", "5");
        for (int i = 1; i < 1001; i++) {
            float a = i*i;
            dataset.addValue(a, "maximo", String.valueOf(i));
        }

        JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico simples", "hora", "valor",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        try {
            System.out.println("criando grafico");
            try (OutputStream png = new FileOutputStream("C://Users/Anderson/Desktop/graficosimples.png")) {
                ChartUtilities.writeChartAsPNG(png, criaGrafico, 1080, 920);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
