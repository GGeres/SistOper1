package semaforos1;
import java.util.ArrayList;
import java.util.Collections;
/**
 *25/03/25
 * Classe RaceKnights - Semaforo 1
 * @author FATEC ZONA LESTE - Gustavo Jorge Geres
 */
public class RaceKnights {
    private ArrayList<ClassKnights> knights;
    private ArrayList<Integer> doors;
    private boolean fireCatched;
    private boolean rockCatched;
    
    public RaceKnights(){
        knights = new ArrayList<>();
        int i;
        for(i = 1; i <= 4; i++){
            knights.add(new ClassKnights(i));
        }
        
        doors = new ArrayList<>();
        for(i = 0; i < 4; i++){
            doors.add(i);
        }
        
        fireCatched = false;
        rockCatched = false;        
    }
    
    
    public void StartRace(){
        //Inicio da Simulação da Corrida
        while(true){
            boolean AllEnded = true;
            for(ClassKnights knight : knights){
                knight.walk();
                if(!fireCatched){
                    knight.CatchFlame();
                    if(knight.FlameOn){
                        fireCatched = true;
                    }
                }
                
                if(!rockCatched && !knight.FlameOn){
                    knight.catchRock();
                    if(knight.RockOn){
                        rockCatched = true;
                    }
                }
                //Para verificar se todos Knights chegaram ao fim da Dungeon                
                if(!knight.isStopped()){
                    AllEnded = false;
                }
            }

            if(AllEnded){
                break;
            }
        }
        
        //Para determinar qual Knight escolheu a porta de saída e qual foi para
        //Dark Souls 1 ou Elder Ring
        Collections.shuffle(doors); //Embaralhador de Portas
        for(ClassKnights knight : knights){
            int selectDoor = doors.remove(0);
            if(selectDoor == 0){
                System.out.printf("Cavaleiro %d encontrou a saída!\n", knight.id);
            } else{
                System.out.printf("Cavaleiro %d YOU DIED!\n", knight.id);
            }
        }       
    }  
}
