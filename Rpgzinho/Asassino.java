public class Asassino extends Heroi {
 public Asassino (String nome, int nivel, int vida, int mana, int forca, int inteligencia, int agilidade) {
        super(nome, nivel, vida, mana, forca, inteligencia, agilidade);

    }
     @Override
    public void classes() {
        System.out.println("Classe: Assassino");
    }
     @Override
    public void atacar() {
        System.out.println(getNome() + " Envenenou o Alvo!");
         }
}