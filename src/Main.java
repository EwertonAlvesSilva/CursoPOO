import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "Preto", 25, 5.5, "neutro");

        Gato gato = new Gato("Puppy", "Preto", 25, 5.5, "5");

        Passaro passaro1 = new Passaro("Piu Piu", "Branco", 5, 5, "neutro");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());
       }
    }