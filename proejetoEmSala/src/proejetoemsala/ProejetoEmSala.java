/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proejetoemsala;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class ProejetoEmSala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao ;
        int codigo;
        String nome;
        String cargo;
        String descriçao;
        int complexidade;
        int indice = -1,indice2 = -1,indice3 = -1;
        String Procura;
        
        ArrayList<Categoria> MinhasCategorias = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        do{
        opcao = Tela.Menu("1) Cadastrar categoria\n2) Cadastrar pessoa\n3) Cadastrar projeto\n4) Listar projetos de uma categoria\n5) Listar projetos de uma pessoa\n6) Listar detalhes de um projeto\n7) Adicionar uma pessoa a um projeto\n8) Adicionar um projeto a uma pessoa\n9) Sair");
            switch(opcao){
                case 1://cadastrando uma categoria...
                    codigo = Tela.LerInteiro("Digite o codigo da categoria");
                    nome = Tela.LerMensagem("Digite o nome da categoria");
                    MinhasCategorias.add(new Categoria(codigo, nome));
                    break;
                case 3://cadastrando um projeto em uma categoria...
                    //verifica se a lista de categorias esta vazia...
                    if(MinhasCategorias.isEmpty()){
                        Tela.ExibirMensagem("É necessaria a criação de uma categoria");
                        break;
                    }
                    nome = Tela.LerMensagem("Digite o nome da categoria");
                    //vai pegar a categoria que se deseja cadastrar o projeto...
                    /*for(int i=0;i<MinhasCategorias.size();i++){
                        if(nome.equals(MinhasCategorias.get(i).getNome())){
                           indice = i; 
                        }
                    }
                    */
                    indice = Auxiliar.VerificaC(nome, MinhasCategorias);
                    
                    codigo = Tela.LerInteiro("Digite o codigo do projeto");
                    nome = Tela.LerMensagem("Digite o nome do projeto");
                    descriçao = Tela.LerMensagem("Digite a descrição do projeto");
                    complexidade = Tela.LerInteiro("Escolha a complexidade do projeto:\n1) Baixa\n2) Media\n3) Alta");
                    
                    MinhasCategorias.get(indice).AddProjeto(new Projeto(codigo, nome, descriçao, complexidade, MinhasCategorias.get(indice)));
                    
                    break;
                case 2:
                    boolean existe = false;//verifica se a pessoa, a ser cadastrada, já não foi
                    nome = Tela.LerMensagem("Digite o nome da pessoa");
                    for(int i=0;i<pessoas.size();i++){
                        if(nome.equals(pessoas.get(i).getNome())){
                            Tela.ExibirMensagem("Esta pessoa já está cadastrada");
                            existe = true;
                        }
                    }
                    if(existe == true)
                        break;
                    codigo = Tela.LerInteiro("Digite o codigo da pessoa");
                    cargo = Tela.LerMensagem("Digite o cargo da pessoa");
                    pessoas.add(new Pessoa(codigo, nome, cargo));
                    break;
                case 4:
                    nome = Tela.LerMensagem("Digite o nome da categoria");
                    //procurando a categoria...
                    for(int i=0;i<MinhasCategorias.size();i++){
                        if(nome.equals(MinhasCategorias.get(i).getNome())){
                            indice = i;
                            break;
                        }
                    }
                    MinhasCategorias.get(indice).ListarProjetos(MinhasCategorias.get(indice));
                    break;
                case 5:
                    nome = Tela.LerMensagem("Digite o nome da pessoa");
                    //procurando a pessoa...
                    for (int i = 0; i < pessoas.size(); i++) {
                        if(nome.equals(pessoas.get(i).getNome())){
                            indice = i;
                            break;
                        }
                    }
                    pessoas.get(indice).ListarProjeto(pessoas.get(indice));
                    break;
                case 6:
                    nome = Tela.LerMensagem("Digite o nome da categoria");
                    //procurando a categoria...
                    for(int i = 0;i < MinhasCategorias.size();i++){
                        if(nome.equals(MinhasCategorias.get(i).getNome())){
                            Tela.ExibirMensagem("Categoria encontrada");
                            indice = i;
                            break;
                        }
                    }
                    nome = Tela.LerMensagem("Digite o nome do projeto");
                    //procurando o projeto...
                    for (int i = 0; i < MinhasCategorias.get(indice).getAgrupa().size(); i++) {
                        if(nome.equals(MinhasCategorias.get(indice).getAgrupa().get(i).getNome())){
                            Tela.ExibirMensagem("Projeto encontrado");
                            indice2 = i;
                            break;
                        }
                    }
                    MinhasCategorias.get(indice).getAgrupa().get(indice2).ImprimirProjeto(MinhasCategorias.get(indice).getAgrupa().get(indice2));
                    break;
                case 7: 
                    nome = Tela.LerMensagem("Digite o nome da gategoria");
                    //procurando a categoria...
                    for (int i = 0; i < MinhasCategorias.size(); i++) {
                        if(nome.equals(MinhasCategorias.get(i).getNome())){
                            Tela.ExibirMensagem("Categoria encontrada");
                            indice = i;
                            break;
                        }
                    }
                    cargo = Tela.LerMensagem("Digite o nome do projeto");
                    //procurando o projeto...
                    for(int i = 0; i<MinhasCategorias.get(indice).getAgrupa().size(); i++){
                        if(cargo.equals(MinhasCategorias.get(indice).getAgrupa().get(i).getNome())){
                            Tela.ExibirMensagem("Projeto encontrado");
                            indice2 = i;
                            break;
                        }
                    }
                    Procura = Tela.LerMensagem("Digite o nome da pessoa");
                    //procurando a pessoa...
                    for(int i = 0; i < pessoas.size(); i++){
                        if(Procura.equals(pessoas.get(i).getNome())){
                            Tela.ExibirMensagem("Pessoa encontrada");
                            indice3 = i;
                            break;
                        }
                    }
                    
                    MinhasCategorias.get(indice).getAgrupa().get(indice2).AddPessoa(pessoas.get(indice3));
                    break;
                case 8:
                    nome = Tela.LerMensagem("Digite o nome da pessoa");
                    //procurando a pessoa...
                    for(int i = 0;i < pessoas.size(); i++){
                        if(nome.equals(pessoas.get(i).getNome())){
                            Tela.ExibirMensagem("Pessoa encotrada");
                            indice = i;
                            break;
                        }
                    }
                    nome = Tela.LerMensagem("Digite o nome da categoria");
                    //procurando a categoria...
                    for(int i = 0;i < MinhasCategorias.size(); i++){
                        if(nome.equals(MinhasCategorias.get(i).getNome())){
                            Tela.ExibirMensagem("Categoria encotrada");
                            indice2 = i;
                            break;
                        }
                    }
                    nome = Tela.LerMensagem("Digite o nome do projeto");
                    //procurando o projeto...
                    for(int i = 0;i < MinhasCategorias.get(indice2).getAgrupa().size(); i++){
                        if(nome.equals(MinhasCategorias.get(indice2).getAgrupa().get(i).getNome())){
                            Tela.ExibirMensagem("Projeto encotrado");
                            indice3 = i;
                            break;
                        }
                    }
                    pessoas.get(indice).AddProjeto(MinhasCategorias.get(indice2).getAgrupa().get(indice3));
                    break;
                    
                case 9:
                    Tela.ExibirMensagem("Obrigado por usar o programa  :)");
                    break;
                    
                default:
                    Tela.ExibirMensagem("Opção invalida!Tente novamente");
                    break;
            }
        }while(opcao != 9);
    }
    
}
