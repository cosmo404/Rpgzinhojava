public class Bardo extends Heroi {
 public Bardo (String nome, int nivel, int vida, int mana, int forca, int inteligencia, int agilidade) {
        super(nome, nivel, vida, mana, forca, inteligencia, agilidade);

    }
     @Override
    public void classes() {
        System.out.println("Classe: Bardo");
    }
     @Override
    public void atacar() {
        System.out.println(getNome() + " Ativou a cansão de cura!");
         }
}