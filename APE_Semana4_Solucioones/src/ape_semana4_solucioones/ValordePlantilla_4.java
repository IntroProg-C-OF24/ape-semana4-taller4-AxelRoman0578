package ape_semana4_solucioones;
import java.util.Scanner;
public class ValordePlantilla_4 {
    public static void main(String[] args) {
        double costoMinutos;
        double minutosConsumidos;
        double costoPlantilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo de minutos");
        costoMinutos = teclado.nextDouble();
        System.out.println("Ingrese los minutos consumidos");
        minutosConsumidos = teclado.nextDouble();
        costoPlantilla = (costoMinutos * minutosConsumidos);
        System.out.println("El costo de la plantilla es: " + costoPlantilla);
    }
}