

public abstract class Jogador extends Pessoa
{
    
    private double altura;
    private int idade;
   
    public Jogador()
    {
        super("",0);
       
    }
    
    public abstract double premiacao();
    
    
    public Jogador(String nome,double salario, int idade, double altura)
    {  
       super(nome,salario);
       this.idade = idade;
       this.altura = altura;
    }
     
   
    public void setIdade(int idade){
        if(idade > 0)
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
      
    public void setAltura(double altura){
        if(altura > 0)
        this.altura = altura;
    }
    
    public double getAltura(){
    return altura;
   }
     
      
}
