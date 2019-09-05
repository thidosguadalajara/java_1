
import java.util.ArrayList;
public class Time
{   
    private String nome;
    private ArrayList<Jogador> jogadores;
    private Tecnico tecnico;
    public Time()
    {
    }
    
    public Time(String nome, Tecnico tecnico){
        jogadores = new ArrayList<>();
        this.nome = nome;
        
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
    
    public Tecnico getTecnico(){
        return tecnico;
    }
    
    public void addJogador(Jogador jogador){
        if(jogadores.size() <= 11)
        this.jogadores.add(jogador);
    }
    
    public void removeJogador(int posicao){
            if( posicao >= 0 &&
                posicao < jogadores.size()){
            this.jogadores.remove(posicao);
        }
        
    }
        
    
    public ArrayList<Jogador> getJogadores(){
       return jogadores; 
    }
    
    public double mediaIdade(){
        int somaIdade = 0;
        for(int i = 0; i < jogadores.size(); i++){
            somaIdade += jogadores.get(i).getIdade();
        }
        /*for each:
        for (Jogador j : jogadores){
            somaIdade += j.getIdade();
        }   
        */
        
        return somaIdade / jogadores.size();
        
    }
    
    public double mediaAlturas(){
        int somaAltura = 0;
        for(Jogador j : jogadores){
            somaAltura += j.getAltura();
        }
        /*for each:
        for (Jogador j : jogadores){
            somaIdade += j.getIdade();
        }   
        */
        
        return somaAltura / jogadores.size();
        
    }
    
    public double folhaPagamento(){
        double totalFolha = 0;
        for( Jogador j : jogadores){
            totalFolha += j.getSalario();
        }
        return totalFolha + tecnico.getSalario();
    }
    
    public Jogador JogadorMaiorSalario(){
        Jogador maior = jogadores.get(0);
        for (Jogador j : jogadores){
            if(j.getSalario() > maior.getSalario()){
            
                maior = j;
            }
        
        }
        return maior;
    
    }
    
  
     
    
    
    
    
    
}
