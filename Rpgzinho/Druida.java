public class Druida extends Heroi {
    public Druida(String nome, int nivel, int vida, int mana, int forca, int inteligencia, int agilidade) {
        super(nome, nivel, vida, mana, forca, inteligencia, agilidade);
    }

    @Override
    public void classes() {
        System.out.println("Classe: Druida");
    }
     @Override
    public void atacar() {
        System.out.println(getNome() + " invocou raizes da natureza!");
         }
}
