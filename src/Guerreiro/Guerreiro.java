package Guerreiro;

import ClasseAbstrata.Personagem;

public class Guerreiro extends Personagem {

    protected float forcaFisica;
    private String habilidade = "ATAQUE MUTILADOR";
    private String arma = "CUTELO NEGRO";

    public Guerreiro(String nome, float vida, float forcaFisica) {
        super(nome, vida);
        this.forcaFisica = forcaFisica;
    }

    public float getForcaFisica() {
        return forcaFisica;
    }

    public void setForcaFisica(float forcaFisica) {
        this.forcaFisica = forcaFisica;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void ataque() {
        System.out.println(this.nome + " lancou ao inimigo seu " + this.habilidade + " com seu " + this.arma);
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
        return "*GUERREIRO* \n nome:" + nome + "\n vida:" + vida + "\n experiencia:" + xp + "\n forcaFisica:"
                + forcaFisica + "\n habilidade:" + habilidade + "\n arma:" + arma + "";
    }

}
