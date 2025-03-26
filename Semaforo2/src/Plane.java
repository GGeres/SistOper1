

/**
 * 25/03/25
 * Semaforo 2 - Aeroporto - Classe Avião
 * @author FATEC ZONA LESTE - Gustavo Jorge Geres
 */
public class Plane extends Thread{
    private final String name;
    private final String track;
    private final DepartureControlArea controlArea;
    
    
    public Plane(String name, String track){
        this.name = name;
        this.track = track;
        this.controlArea = DepartureControlArea.getInstance();
    }
    
    @Override
    public void run(){
        try{
            taxiar();
            decolar();
            manobra();
            afastamento();
            fimDecolagem();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    private void taxiar() throws InterruptedException{
        
    }
}
