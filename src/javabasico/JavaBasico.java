/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.Scanner;


public class JavaBasico {

    public void  principal(){
        System.out.println("bienvenido java  basico");
        System.out.println("1. operadores logicos");
        System.out.println("2. tipos de datos");
        System.out.println("3. estructuras de control");
        System.out.println("4. excepciones");
        System.out.println("5. estructuras de datos");
    
    
      System.out.print("elgir opcion::");
        
        Scanner sc = new Scanner(System.in);
        int data =sc.nextInt();
        
         switch(data){
        case 1:
            OperdoresLogicos ol = new OperdoresLogicos();
            ol.operador();
            
            break;
        case 2:
            TipoDatos dt = new TipoDatos();
            dt.dato();
            
            break;
        case 3:
            EstructuraControl ec = new EstructuraControl(80);
           // ec.estructura();
           ec.tablaDeMultiplicar(50);
            //ec.setEdad(15);
            //System.out.println(ec.getEdad());
            
            break;
        case 4: 
            Excepciones ex =new Excepciones();
            ex.manejoErrores();
    }
    }
    public static void main(String[] args) {
       //awitch case
       //Practica pt = new Practica();
      // pt.menu();
       JavaBasico jb = new JavaBasico();
       jb.principal();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
