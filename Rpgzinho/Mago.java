//existe um motivo mesmo sendo uma instancia de outra classe herdando seus atributos e necessario colocas os atributos em seus parametros
public class Mago extends Heroi {
    public Mago(String nome, int nivel, int vida, int mana, int forca, int inteligencia, int agilidade) {
        super(nome, nivel, vida, mana, forca, inteligencia, agilidade);
    }

    @Override
    public void classes() {
        System.out.println("Classe: Mago");
    }
    @Override
    public void atacar() {
        System.out.println(getNome() + " lancou uma bola de fogo!");
     }
}
