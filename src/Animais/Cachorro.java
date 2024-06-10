package Animais;

public class Cachorro extends Animal{
    static int numeroDeCachorros;
    private int tamanhoDoRabo;


    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }

    public String getNome(){
        return  this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }


    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }



    public String pegar(){

        return "bolinha";
    }

    @Override
    public void soar() {
        System.out.println("Au au");
    }

    public String interagir(String acao){
//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        }else if(acao.equals("vai dormir")){
//            this.estadoDeEspirito = "Bravo";
//        }else {
//            this.estadoDeEspirito = "neutro";
//        }
//
//        return estadoDeEspirito;

        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro";

        }
        return estadoDeEspirito;


    }
}
