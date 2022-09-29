package Acoes;

public interface Acoes {

    /* O método ataque(), de acordo com suas armas e habilidades */
    public default void ataque() {
        System.out.println("");

    }

    /*
     * O método sofrerAtaque(float dano) que retira uma determinada porção de vida.
     */
    public default float sofrerAtaque(float dano) {

        return 0;
    }

    /*
     * O método restaurarVida(float ganho) que restaura uma determinada porção de
     * vida.
     */
    public default float restaurarVida(float ganho) {

        return 0;
    }

    /*
     * O método morrer() que é executado toda vez que a vida diminui a zero,
     * mostrando uma mensagem indicando a morte.
     */
    public default void morrer() {
        System.out.println("");
    }

    

}
