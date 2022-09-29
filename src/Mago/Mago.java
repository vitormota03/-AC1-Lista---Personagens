package Mago;

import ClasseAbstrata.Personagem;
import Acoes.Acoes;

public class Mago extends Personagem {
    protected float cura;
    protected float poderMagico;
    private String habilidade = "EXPLOSAO PRIMORDIAL";
    private String arma = "CAJADO DO VAZIO";

    public Mago(String nome, float vida, float cura, float poderMagico) {
        super(nome, vida);
        this.cura = cura;
        this.poderMagico = poderMagico;

    }

    public float getCura() {
        return cura;
    }

    public void setCura(float cura) {
        this.cura = cura;
    }

    public float getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(float poderMagico) {
        this.poderMagico = poderMagico;
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

    @Override
    public void morrer() {
        System.out.println(this.nome + " foi neutralizado!");
    }

   
    public String toString() {
        return "*MAGO* \n nome:" + nome + "\n vida:" + vida + "\n experiencia:" + xp + "\n poderMagico:" + poderMagico
                + "\n cura:" + cura + "\n habilidade:" + habilidade + "\n arma:" + arma + "";
    }

}
