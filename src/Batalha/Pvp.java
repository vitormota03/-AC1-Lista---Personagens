package Batalha;

import java.util.Scanner;
import Mago.Mago;
import Guerreiro.Guerreiro;
import Arqueiro.Arqueiro;
import ClasseAbstrata.Personagem;
import java.util.Random;

public class Pvp {
    Scanner ler = new Scanner(System.in);
    int classeEscolha;
    int campeaoEscolha;

    Mago veigar = new Mago("Veigar", 50, 3, 100);
    Guerreiro darius = new Guerreiro("Darius", 100, 100);
    Arqueiro varus = new Arqueiro("Varus", 75, 30);

    Random aleatorio = new Random(); 
    int campeaoAleatorio = aleatorio.nextInt(3)+1;


  

    public void iniciarPvp() {
        System.out.print("Escolha uma classe* \n1.Arqueiro\n2.Guerreiro\n3.Mago\n\nESCOLHA: ");
        classeEscolha = ler.nextInt();

        if (classeEscolha == 1) {

            System.out.print("*Escolha um Campeao* \n1.Varus\n\nESCOLHA: ");
            campeaoEscolha = ler.nextInt();

            if (campeaoEscolha == 1) {
                System.out.println("Varus: A FLECHA DA VINGANÇA - escolhido! \n\n" + varus.toString());
                

            } else {
                System.out.println("Campeao invalido!");
            }
        }

        else if (classeEscolha == 2) {

            System.out.print("*Escolha um Campeao* \n1.Darius\n\nESCOLHA: ");
            campeaoEscolha = ler.nextInt();

            if (campeaoEscolha == 1) {
                System.out.println("Darius: A MAO DE NOXUS - escolhido! \n\n" + darius.toString());

            } else {
                System.out.println("Campeao invalido!");
            }
        }

        else if (classeEscolha == 3) {

            System.out.print("*Escolha um Campeao* \n1.Veigar\n\nESCOLHA: ");
            campeaoEscolha = ler.nextInt();

            if (campeaoEscolha == 1) {
                System.out.println("Veigar: O PEQUENO MESTRE DO MAL - escolhido! \n\n" + veigar.toString());

                    

            } else {
                System.out.println("Campeao invalido!");
            }

        }

        else {
            System.out.println("Classe invalida!");
        }

       

    
       
            
        
      
      
       
           

    }
}