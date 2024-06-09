import Animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "Preto", 25, 5.5, 5);

        System.out.println(cachorro1.interagir("carinho"));
        }
    }