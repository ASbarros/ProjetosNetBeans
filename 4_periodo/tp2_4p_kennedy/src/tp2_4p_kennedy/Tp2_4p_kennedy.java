package tp2_4p_kennedy;

/*
 *FEITO POR: ANDERSON DOS SANTOS DE BARROS
 *PROGRAMA PARA CAOCULAR O VOLUME MAXIMO DE UMA CAIXA FEITA A PARTIR DE UMA FOLHA
 *FOLHA 1: 60cm X 75cm
 *FOLHA 2: 90cm X 120cm
 */
public class Tp2_4p_kennedy{
    final static double ERRO = 0.001;

    public static double DerivadaFolha1(double x){
        return (12*Math.pow(x, 2) - 540*x + 4500);
    }
    public static double DerivadaFolha2(double x){
        return (12*Math.pow(x, 2) - 840*x + 10800);
    }
    public static double Volume1(double x){
        return 4*Math.pow(x, 3) - 270*Math.pow(x, 2) + 4500*x;
    }
    
    public static double Volume2(double x){
        return 4*Math.pow(x, 3) - 420*Math.pow(x, 2) + 10800*x;
    }
    public static void bisseccao(int folha){
        double a = 0, b = 20;
        if(folha == 1){
            double media = (a + b)/2;
            double mediaanterior = media;//para segurar o valor anterior da media...
            if(Math.abs(DerivadaFolha1(media)) <= ERRO){
                        System.out.println("Valor de X = "+media);
                        System.out.println("Volume maximo = "+Volume1(media));
                        System.out.println("\n\n");
                return;
            }
            else{
                for(int i = 0; ; i++){
                    if((DerivadaFolha1(a) * DerivadaFolha1(media)) < 0)
                        b = media;
                    else
                        a = media;
                    mediaanterior = media;
                    media = (a + b)/2;//atualizando a media...
                    
                    if(Math.abs(DerivadaFolha1(media)) <= ERRO || (Math.abs(media - mediaanterior)/Math.abs(media))<=ERRO){
                        System.out.println("numero de iteração: "+i);
                        System.out.println("Valor de X = "+media);
                        System.out.println("Volume maximo = "+Volume1(media));
                        System.out.println("\n\n");
                        return;
                    }
                    System.out.println("numero de iteração: "+i);
                        System.out.println("Valor de X = "+media);
                        System.out.println("Volume maximo = "+Volume1(media));
                        System.out.println("\n\n");
                }
            }
        }
        if(folha == 2){
        double media = (a + b)/2;
        double mediaanterior = media;
            if(Math.abs(DerivadaFolha2(media)) <= ERRO){
                        System.out.println("Valor de X = "+media);
                        System.out.println("Volume maximo = "+Volume2(media));
                        System.out.println("\n\n");
                return;
            }
            else{
                for(int i = 0; ; i++){
                    if(DerivadaFolha2(a) * DerivadaFolha2(media) < 0)
                        b = media;
                    else
                        a = media;
                    mediaanterior = media;
                    media = (a + b)/2;//atualizando a media...
                    
                    if(Math.abs(DerivadaFolha2(media)) <= ERRO|| (Math.abs(media - mediaanterior)/Math.abs(media))<=ERRO){
                        System.out.println("numero de iteração: "+i);
                        System.out.println("Valor de X = "+media);
                        System.out.println("Volume maximo = "+Volume2(media));
                        System.out.println("\n\n");
                        return;
                    }
                    System.out.println("numero de iteração: "+i);
                        System.out.println("Valor de X = "+media);
                        System.out.println("Volume maximo = "+Volume2(media));
                        System.out.println("\n\n");
                }
            }
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int escolha = 0;
        while(escolha != 3){
            escolha = tela.LerInteiro("1)Para uma folha de 60cm X 75cm\n2)Para uma folha de 90cm X 120cm\n3)Para sair\n");
            bisseccao(escolha);
        }
        
        
    }
    
}
