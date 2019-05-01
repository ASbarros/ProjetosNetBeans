/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author Anderson
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Disciplina Logica = new Disciplina("INF110-LOGICA");
        Professor Waldir = new Professor(Logica,"Waldir T.");
        Disciplina bd3 = new Disciplina("banco de dados 3");
        Waldir.addDisciplina(bd3);
        
        System.out.println("Diciplina ministrada pelo " + Waldir.getNome());
        Waldir.printDisciplina();
        
        System.out.println("Disciplina " + Logica.getNome() + " é dada por : ");
        System.out.println(Logica.getMinistrada().getNome());
    }
    
}
