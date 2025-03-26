/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semaforos1;

/**
 * 25/03/25
 * Classe Knights - Semaforo 1
 * @author FATEC ZONA LESTE - Gustavo Jorge Geres
 */
public class ClassKnights {
    int id;
    double place;
    int veloc;
    boolean FlameOn;
    boolean RockOn;
    boolean stop;
    
    public ClassKnights(int id){
        this.id = id;
        this.place = 0;
        this.veloc = (int) (Math.random() *3) + 2; //Velocidade Aleatória entre 2 e 4 metros a cada 50ms
        this.FlameOn = false;
        this.RockOn = false;  
        this.stop = false;
    }
    
    // Método para simular o movimento do Knight
    public void walk(){
        if(!stop){
            this.place += this.veloc;
            try{
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.printf("Cavaleiro %d está na posição %.2f metros\n", this.id, this.place);
        
            if(this.place >= 2000){
                this.stop = true;
                System.out.printf("Cavaleiro %d terminou a corrida e parou de se mover.\n", this.id);
            }
        }
        
    }
    
    public void CatchFlame(){
        if(this.place >= 500 && !this.FlameOn){
            this.FlameOn = true;
            this.veloc += 2; //Velocidade aumenta ao pegar a tocha
            System.out.printf("Cavaleiro %d pegou a tocha! Nova velocidade: %d m/50ms\n", this.id, this.veloc);
        }
    }
    
    //Metodo para "Pegar a Pedra Mágica"
    public void catchRock(){
        if(this.place >= 1500 && !this.RockOn && !this.FlameOn){
            this.RockOn = true;
            this.veloc += 2; //Velocidade aumenta ao pegar a pedra
            System.out.printf("Cavaleiro %d pegou a pedra! Nova velocidade: %d m/50ms\n", this.id, this.veloc);
        }
    }
    
    public boolean DungeonEnd(){
        return this.place >= 2000;
    }
    
    public boolean isStopped(){
        return this.stop;
    }
}
