package escola;

import java.util.ArrayList;

public class Escola {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Aluno obj1 = new Aluno();
        obj1.setNome("Pelé");
        obj1.setMatricula("Aln-1364");
        obj1.setPeriodo(1);
        obj1.addNota(18);
        obj1.addNota(20);
        obj1.addNota(15);
        obj1.addNota(1);
        obj1.recebeFalta();
        obj1.recebeFalta();
        obj1.recebeFalta();
        alunos.add(obj1);

        Aluno obj2 = new Aluno();
        obj2.setNome("Zidane");
        obj2.setMatricula("Aln-2451");
        obj2.setPeriodo(5);
        obj2.addNota(25);
        obj2.addNota(30);
        obj2.addNota(27);
        obj2.recebeFalta();
        alunos.add(obj2);

        Aluno obj3 = new Aluno();
        obj3.setNome("Maradona");
        obj3.setMatricula("Aln-1009");
        obj3.setPeriodo(3);
        obj3.addNota(20);
        obj3.addNota(10);
        obj3.addNota(18);
        obj3.addNota(15);
        obj3.addNota(17);
        obj3.recebeFalta();
        obj3.recebeFalta();
        obj3.recebeFalta();
        obj3.recebeFalta();
        obj3.recebeFalta();
        obj3.recebeFalta();
        alunos.add(obj3);

        tela.ExibirMensagem("Nome do aluno :" + obj1.getNome());
        tela.ExibirMensagem("Matricula do aluno: " + obj1.getMatricula());
        tela.ExibirMensagem("Periodo do aluno: " + obj1.getPeriodo());
        for (int i = 0; i < obj1.TotalDeProva(); i++) {
            tela.ExibirMensagem("Prova " + (i + 1) + " nota :" + obj1.getNota(i));
        }
        tela.ExibirMensagem("Faltas do aluno :" + obj1.getQtdeFaltas());
        tela.ExibirMensagem("Nota final do aluno :" + obj1.calcNotaFinal());
        tela.ExibirMensagem("Media do aluno :" + obj1.calcMedia());
        if (obj1.eAprovado()) {
            tela.ExibirMensagem("APROVADO!");
        } else {
            tela.ExibirMensagem("REPROVADO!");
        }

        tela.ExibirMensagem("Nome do aluno :" + obj2.getNome());
        tela.ExibirMensagem("Matricula do aluno: " + obj2.getMatricula());
        tela.ExibirMensagem("Periodo do aluno: " + obj2.getPeriodo());
        for (int i = 0; i < obj2.TotalDeProva(); i++) {
            tela.ExibirMensagem("Prova " + (i + 1) + " nota :" + obj2.getNota(i));
        }
        tela.ExibirMensagem("Faltas do aluno :" + obj2.getQtdeFaltas());
        tela.ExibirMensagem("Nota final do aluno :" + obj2.calcNotaFinal());
        tela.ExibirMensagem("Media do aluno :" + obj2.calcMedia());
        if (obj1.eAprovado()) {
            tela.ExibirMensagem("APROVADO!");
        } else {
            tela.ExibirMensagem("REPROVADO!");
        }

        tela.ExibirMensagem("Nome do aluno :" + obj3.getNome());
        tela.ExibirMensagem("Matricula do aluno: " + obj3.getMatricula());
        tela.ExibirMensagem("Periodo do aluno: " + obj3.getPeriodo());
        for (int i = 0; i < obj3.TotalDeProva(); i++) {
            tela.ExibirMensagem("Prova " + (i + 1) + " nota :" + obj3.getNota(i));
        }
        tela.ExibirMensagem("Faltas do aluno :" + obj3.getQtdeFaltas());
        tela.ExibirMensagem("Nota final do aluno :" + obj3.calcNotaFinal());
        tela.ExibirMensagem("Media do aluno :" + obj3.calcMedia());
        if (obj1.eAprovado()) {
            tela.ExibirMensagem("APROVADO!");
        } else {
            tela.ExibirMensagem("REPROVADO!");
        }
    }

}
