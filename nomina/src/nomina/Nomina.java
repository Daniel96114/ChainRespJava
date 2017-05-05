/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Ingrese el tipo de nomina");
        nombre = sc.nextLine();
        Liquidador liquidador = new Liquidador();
        liquidador.solicitudNomina(nombre);
    }
    
}
