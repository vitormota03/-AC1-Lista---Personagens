package ClasseAbstrata;

import Acoes.Acoes;

public abstract class Personagem implements Acoes{
    protected String nome;
    protected float vida;
    protected float xp = 10;

    public Personagem(String nome, float vida) {
        this.nome = nome;
        this.vida = vida;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

}
