public class Guerreiro extends Heroi {
 public Guerreiro (String nome, int nivel, int vida, int mana, int forca, int inteligencia, int agilidade) {
        super(nome, nivel, vida, mana, forca, inteligencia, agilidade);

    }
     @Override
    public void classes() {
        System.out.println("Classe: Guerreiro");
    }
     @Override
    public void atacar() {
        System.out.println(getNome() + " Entrou em berserker");
         }
}