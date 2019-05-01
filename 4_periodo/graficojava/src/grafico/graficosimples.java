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
public class graficosimples {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(10.1, "maximo", "hora 1");
        dataset.addValue(20.1, "maximo", "hora 2");
        dataset.addValue(30.1, "maximo", "hora 3");
        dataset.addValue(40.1, "maximo", "hora 4");
        dataset.addValue(70.1, "maximo", "hora 5");
        
        JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico simples", "hora", "valor", dataset, PlotOrientation.VERTICAL,true,true,false);
        
        try {
            System.out.println("criando grafico");
            OutputStream png = new FileOutputStream("graficosimples.png");
            ChartUtilities.writeChartAsPNG(png, criaGrafico, 500, 400);
            png.close();
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }
        
    }
}
