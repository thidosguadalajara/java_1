import java.util.ArrayList;

public class Campeonato
{
    private String nome;
    private ArrayList<Time> times;
   
    public Campeonato()
    {
        this("");// chama o outro construtor com o nome vazio;
        
    }

     public Campeonato(String nome)
    {
        this.nome = nome;
        times = new ArrayList<>();
        
    }    
    
    public ArrayList<Time> getTimes(){
       return times; 
    }
    
    public void addTime(Time time){
        if(times.size() <= 4)
        this.times.add(time);
    }
    
    public void removeTime(int posicao){
        if(posicao >= 0 && posicao < times.size()){
        times.remove(posicao);
     }
    }
    
    public Tecnico tecnicoMaiorSalario(){
        Tecnico maior = new Tecnico("",0);
        
        for(int i = 0; i < times.size(); i++){
   
            if (maior.getSalario() < times.get(i).getTecnico().getSalario())
                maior = times.get(i).getTecnico();
        
        }
        
        /* for (Time t : times){
            if (maior.getSalario() < t.getTecnico().getSalario()){
                maior = t.getTecnico();
            
            }
            
        } */
            
           return maior;
        }         
    
    
    public Jogador jogadorMaiorSalario(){
        Jogador maior = times.get(0).JogadorMaiorSalario();
        for( Time t : times){
        
        if(maior.getSalario() < t.JogadorMaiorSalario().getSalario())
            maior = t.JogadorMaiorSalario();
        }
        
        return maior;
    }
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    
     public String getNome(){
        return nome;
        
    }
}
