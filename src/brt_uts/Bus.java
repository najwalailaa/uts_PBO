/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package brt_uts;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Najwa
 */
public class Bus {
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int total_penumpang;
    private int tunggunaik, tungguturun;
    private String[] list_halte = {"Pull/Kantor", "Porong", "Surabaya", "Gresik"};

    public Bus() {
        System.out.println("==>  Bus berangkat dari " + list_halte[0]);
    }
        public void pickup(String destination, int penumpangnaik) {
        for (int i = 0; i < penumpangnaik; i++) {
            Passenger newpassenger = new Passenger(destination);
            passengers.add(newpassenger);
        }
        System.out.println("    - " + penumpangnaik + " penumpang naik dengan tujuan: " + destination);
        this.total_penumpang = passengers.size();
        
    }

    public void dropoff(int penumpangturun, String Halte) {
        if (passengers.size() >= penumpangturun) {
            for (int i = 0; i <penumpangturun; i++) {
                passengers.remove(0);
            }
            System.out.println("    - " + penumpangturun + " penumpang turun di Halte " + Halte);
            this.total_penumpang = passengers.size();
            }
    }
     public void waitingpass( String destination, int penumpangnaik, int nomorhalte) {
        for (int i = 0; i < penumpangnaik; i++) {
            Passenger newpassenger = new Passenger(destination);
            passengers.add(newpassenger);
        }
        System.out.println(" Halte " + list_halte[nomorhalte] + ":  " + penumpangnaik+ " Penumpang menunggu");
        this.total_penumpang = passengers.size();
        
    }

    public void sampaiHalte(int NumOfHalte) {
        System.out.println("==>  Bus sampai di Halte " + list_halte[NumOfHalte]);
    }
    
    public int getJumlahPassengers(){
        return this.total_penumpang;
    }
}
