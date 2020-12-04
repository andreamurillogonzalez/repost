/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados.kelvin;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class GradosKelvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        char resp;
        do {
            System.out.println("Introduce los grados: ");
            int grados = teclado.nextInt();
            int kelvin = grados + 273;
            System.out.println("Grados kelvin: "+kelvin);
            System.out.println("Desea continuar? S/N");
            resp = teclado.next().charAt(0);

        }while(resp=='S' || resp=='s');
    }

}
