/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo2_er22;

/**
 *
 * @author yurid
 */
public class Trabajo2_ER22 {

    public static void main(String[] args) {
    Planeta planeta1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,tipoPlaneta.TERRESTRE,true);
    planeta1.imprimir();
    System.out.println("Densidad del planeta = " + planeta1.calcularDensidad());
    System.out.println("Es planeta exterior = " + planeta1.esPlanetaExterior());
    System.out.println();
    
    Planeta planeta2 = new Planeta("Júpiter",79,1.899E27,1.4313E15,139820,750000000,tipoPlaneta.GASEOSO,true);
    planeta2.imprimir();
    System.out.println("Densidad del planeta = " + planeta2.calcularDensidad());
    System.out.println("Es planeta exterior = " + planeta2.esPlanetaExterior());
    }
}