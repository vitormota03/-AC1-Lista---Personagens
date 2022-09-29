
package ClassePrincipal;

import Mago.Mago;
import Guerreiro.Guerreiro;
import Arqueiro.Arqueiro;
import Batalha.Pvp;

public class Main {
    public static void main(String[] args) {
        Mago veigar = new Mago("Veigar", 50, 3, 100);
        Guerreiro darius = new Guerreiro("Darius", 100, 100);
        Arqueiro varus = new Arqueiro("Varus", 75, 30);

        Pvp pvp = new Pvp();
        pvp.iniciarPvp();
        

    }
}