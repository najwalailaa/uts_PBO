/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package brt_uts;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Najwa
 */
public class Brt_uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("================================================================");
        Bus bus = new Bus();
        bus.pickup("Porong", 3);
        bus.pickup("Surabaya", 2);
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPassengers() + " penumpang");
        System.out.println("================================================================");
        bus.waitingpass("Surabaya", 2, 1);
        bus.sampaiHalte(1);
        bus.dropoff(3, "Porong");
        bus.pickup("Surabaya", 1);
        bus.pickup("Gresik", 1);
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPassengers());
        System.out.println("================================================================");
        bus.waitingpass("Gresik", 5, 2);
        bus.sampaiHalte(2);
        bus.dropoff(1, "Surabaya");
        bus.pickup("Gresik", 5);
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPassengers());
        System.out.println("================================================================");
        
}}
