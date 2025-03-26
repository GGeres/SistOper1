/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 25/03/25
 * Semaforo 2 - Aeroporto - Classe Aeroporto (Main Class)
 * @author FATEC ZONA LESTE - Gustavo Jorge Geres
 */
public class Airport_Main {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 12; x++){
            String track = (x % 2 == 0) ? "Norte" : "Sul";
            Plane plane = new Plane("Avião "+(x+1), track);
            plane.start();
        }
    }
}
