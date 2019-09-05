
public class Tecnico extends Pessoa
 {
    private double bonusPorTitulo;
    private int numeroTitulo;    
     
     
    @Override
    public double premiacao(){
        return bonusPorTitulo * numeroTitulo;
    }
    
    public Tecnico(String nome, double salario){
     super(nome, salario);
     /*Assim utilizamos o construtor da classe mae, Pessoa */
    
    }
    
     public Tecnico(){
     super("",0);
     /*Assim utilizamos o construtor da classe mae, Pessoa */
    
    }
          
}
