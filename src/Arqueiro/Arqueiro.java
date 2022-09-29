package Arqueiro;

import ClasseAbstrata.Personagem;

public class Arqueiro extends Personagem {
    protected float velocidadeAtaque;
    private String habilidade = "FLECHA PERFURANTE";
    private String arma = "ARCO CELESTE";

    public Arqueiro(String nome, float vida, float velocidadeAtaque) {
        super(nome, vida);
        this.velocidadeAtaque = velocidadeAtaque;
    }

    public float getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(float velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    @Override
    public void ataque() {
        System.out.println(this.nome + " lancou ao inimigo sua " + this.habilidade + " com seu " + this.arma);
        this.xp += 1;

    }

    @Override
    public float sofrerAtaque(float dano) {

        this.vida -= dano;

        return vida;
    }

    @Override
    public float restaurarVida(float ganho) {

        this.vida += ganho;

        return vida;
    }

    public void morrer() {
        System.out.println(this.nome + " foi neutralizado!");
    }

    public String toString() {
        return "*GUERREIRO* \n nome:" + nome + "\n vida:" + vida + "\n experiencia:" + xp + "\n velocidadeAtaque:"
                + velocidadeAtaque + "\n habilidade:" + habilidade + "\n arma:" + arma + "";
    }

}
