
public abstract class Pessoa
{
    private String nome;
    protected double salario;
    
   /* public Pessoa()
    {
        
    }*/
    
    public abstract double premiacao();
    
    public Pessoa(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
    return nome;
   }
   
   public void setSalario(double salario){
       this.salario = salario;
    }
    
   public double getSalario(){
    return salario;
   }
}
