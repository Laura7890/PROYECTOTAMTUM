/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Alejandra Vanegas
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mesesbebe, pesobebe, dosisvacuna;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor ingrese los meses que tiene el bebé");
        mesesbebe=entrada.nextInt();
        
        System.out.println("Por favor ingrese el peso del bebé");
        pesobebe=entrada.nextInt();
        
        dosisvacuna = (pesobebe+10/mesesbebe*10)*8;
        
        System.out.println("La dosis indicada de la vacuna para aplicar al bebé es:" + dosisvacuna);
        
    }
}
