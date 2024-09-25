/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.Scanner;


public class Practica {
    public void menu(){
        System.out.println("Elige una opcion");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        System.out.println("4.Extras");
        System.out.println("5.Salir");
        System.out.print("elgir opcion::");
        
        Scanner sc = new Scanner(System.in);
        int ValorQueInsertaElUsuario =sc.nextInt();
        
        switch(ValorQueInsertaElUsuario){
        case 1:
            System.out.println("Jugo depapaya");
            System.out.println("Caldo de  cabeza");
            System.out.println("Lomo Saltado");
            break;
        case 2:
            System.out.println("estofado");
            break;
        case 3:
            System.out.println("cafe tortillas");
            break;
        case 4:
            System.out.println("no hay extras");
            break;
        case 5:
            System.out.println("Vuelva pronto :V");
           
            break;
        default:
            System.out.println("");
            break;
        
    }
    }
}
