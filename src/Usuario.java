package src;

public class Usuario {

    public static void main(String[] args){
        Iphone iphone = new Iphone();
        System.out.println("-----Iniciando Chamada------");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        System.out.println("-----Chamada Finalizada------");

        System.out.println("-----Iniciando Navegação-------");
        iphone.exibirPagina();
        iphone.exibirNovaPagina();
        iphone.atualizarPagina();
        System.out.println("------Navegação Finalizada-------");

        System.out.println("-------Iniciando Reprodução Musical-----");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
        System.out.println("-------Finalizando Reprodução Musical-----");
    }

}
