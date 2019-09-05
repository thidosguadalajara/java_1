
import java.util.Scanner;
public class Main
{
   public static void main(String [] args){
    
       System.out.println("## Champions da Street ##");
       
       Scanner le = new Scanner(System.in);
       
       Campeonato camp = new Campeonato();
       
      System.out.println("Digite o nome do champs: ");
      camp.setNome(le.nextLine());
      
      while(true){
      
      System.out.println("##### MENU #####");
      
      System.out.println("## 1) Cadastrar  Time ");
      System.out.println("## 2) Ver Times Cadastrados ");
      System.out.println("## 3) Relatorio ");
      System.out.println("===============");
      System.out.println("## 4) Sair");
      
      int escolha = le.nextInt();
      
      if(escolha == 1){
       

        Time t = new Time ();
        System.out.println("==== Cadastrar Time ===");
        System.out.println("Nome do time: ");
        t.setNome(le.next());
        Tecnico tec = new Tecnico();
        System.out.println("Nome do treinador: ");
        tec.setNome(le.next());
        System.out.println("Salario do treinador: ");
        tec.setSalario(le.nextDouble());
        t.setTecnico(tec);
        /*Ler dados dos jogadores.... */
        for(int i = 0; i < 3; i ++){
            System.out.println("Insira os jogadores do time: ");
            System.out.println("## 1) Goleiro ");
            System.out.println("## 2) Zagueiro ");
            System.out.println("## 3) Meio-campo ");
            System.out.println("## 4) Atacante ");
            int tipoJogador = le.nextInt();
            if(tipoJogador == 1){
                            Goleiro g = new Goleiro ();
                            System.out.println("##Cadastro de Goleiro##");
                            System.out.println("Nome: ");
                                    g.setNome(le.next());
                            System.out.println("Idade: ");
                                    ((Goleiro)g).setIdade(le.nextInt());
                            System.out.println("Altura: ");        
                                    ((Goleiro)g).setAltura(le.nextDouble());
                            System.out.println("Salario: ");        
                                    ((Goleiro)g).setSalario(le.nextDouble());
                                    
                                    t.addJogador(g);

            }else if(tipoJogador == 2){
                            Zagueiro z = new Zagueiro();
            
                            System.out.println("##Cadastro de Zagueiro##");
                            System.out.println("Nome: ");
                                    z.setNome(le.next());
                            System.out.println("Idade: ");        
                                    ((Zagueiro)z).setIdade(le.nextInt());
                            System.out.println("Altura: ");        
                                    ((Zagueiro)z).setAltura(le.nextDouble());
                            System.out.println("Salario: ");        
                                    ((Zagueiro)z).setSalario(le.nextDouble());

                                    t.addJogador(z);
            
            }else if(tipoJogador == 3){
                            MeioCampo m = new MeioCampo();
            
                            System.out.println("##Cadastro de Zagueiro##");
                            System.out.println("Nome: ");
                                    m.setNome(le.next());
                            System.out.println("Idade: ");        
                                    ((MeioCampo)m).setIdade(le.nextInt());
                            System.out.println("Altura: ");        
                                    ((MeioCampo)m).setAltura(le.nextDouble());
                            System.out.println("Salario: ");        
                                    ((MeioCampo)m).setSalario(le.nextDouble());
                                    
                                    t.addJogador(m);
            
            }else{
                            Atacante a = new Atacante();
            
                            System.out.println("##Cadastro de Zagueiro##");
                            System.out.println("Nome: ");
                                    a.setNome(le.next());
                            System.out.println("Idade: ");        
                                    ((Atacante)a).setIdade(le.nextInt());
                            System.out.println("Altura: ");        
                                    ((Atacante)a).setAltura(le.nextDouble());
                            System.out.println("Salario: ");        
                                    ((Atacante)a).setSalario(le.nextDouble()); 
                                    
                                    t.addJogador(a);
            
            
            
            }
            
            
            
        
        
        }
        
        
        camp.addTime(t);
        
        }
      
      
      if(escolha == 4){
        break;
      }else{
        
        
        }
        
        
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
