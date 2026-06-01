//como a classe é abstract, você não pode instanciá-la diretamente, mas pode usá-la como base para classes
public abstract class Heroi{
  public abstract void classes();

  //boa prática, colocamos os atributos primeiro e métodos depois — só pra deixar o código mais organizado.
 private String nome;
 private int nivel;
 private int vida;
 private int mana;
 //Java não permite caracteres acentuados (como ç, ã, á, etc.) em nomes de variáveis, classes ou métodos.
 private int forca;
 private int inteligencia;
 private int agilidade;

  public Heroi(String nome){
   this.nome = nome;
    this.nivel = 1;
    this.vida = 1;
    this.mana = 1;
    this.forca = 1;
    this.inteligencia = 1;
    this.agilidade = 1;
 }



 public Heroi(String nome,int nivel,int vida,int mana,int forca,int inteligencia,int agilidade  ){ 

   this.nome = nome;
   this.nivel = nivel;
   this.vida = vida;
   this.mana = mana;
   this.inteligencia = inteligencia;
   this.forca = forca;
   this.agilidade = agilidade;
  
  }
   //public abstract void atacar(); poderia ser usado de forma generica para cada classe ter ser proprio ataque mas escolhi nn fazer.
   //Normalmente um ataque não precisa de um array de inteiros.
   public abstract void atacar();
   
  //vai recever dano sendo um metodo sendo a subtração da vida pela ataque
  

   public String getNome() {
        return nome;
    }
  

}