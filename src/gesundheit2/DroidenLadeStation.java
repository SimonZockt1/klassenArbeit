package gesundheit2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WeckSim30
 */
public class DroidenLadeStation {
    private String name;
    private AppDroide droideOnBoard;
    private boolean belegt;

    public DroidenLadeStation(String name) {
        this.name = name;
        this.belegt = false;
    }

    public void droidenEinsetzen(AppDroide droide) {
        if (!istBelegt()) {
            this.droideOnBoard = droide;
            this.belegt = true;
        }
    }

    public boolean istBelegt() {
        return this.belegt;
    }

    public static void main(String[] args) {
        DroidenLadeStation station = new DroidenLadeStation("Station Alpha");
        System.out.println("Ladestation erstellt: " + station.name);
    }
}

