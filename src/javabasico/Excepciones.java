/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Excepciones {
    public void manejoErrores(){
        Scanner sc = new Scanner (System.in);
        
        try{//intentar
            System.out.println("ingresar un numero: ");
            int num = sc.nextInt();
        }catch(Exception e){//capturar
            System.out.println("ocurrio un error: "+e.getMessage());
            
        
    }finally{//finalizar
            System.out.println("este  bloque se ejecuta siempre");
            sc.close();
        }         
        }
}
