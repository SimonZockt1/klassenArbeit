package gesundheit2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WeckSim30
 */
public class AppDroide {
    private double gewicht;
    private String farbe;

    public AppDroide(double gewicht, String farbe) {
        this.gewicht = gewicht;
        this.farbe = farbe;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "AppDroide{" +
               "gewicht=" + gewicht +
               ", farbe='" + farbe + '\'' +
               '}';
    }

    public static void main(String[] args) {
        AppDroide droide1 = new AppDroide(372, "mehrfarbig");
        AppDroide droide2 = new AppDroide(222, "schwarz");
        System.out.println(droide1);
        System.out.println(droide2);
    }
}
