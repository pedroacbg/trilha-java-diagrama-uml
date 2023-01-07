package src.interfaces;

public interface AparelhoTelefonico {

    void ligar();
    void atender();

    default void iniciarCorreioDeVoz() {

    }
}
