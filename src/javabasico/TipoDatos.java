/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Soporte
 */
public class TipoDatos {
    public void dato (){
        int myInteger = 10;
        String myString = "hola";
        double myDouble =0;
        short myShort = 20;
        boolean myBoolean = true;
        Object myObject = "jkjk";
        
        System.out.println("myInteger es de tipo " +((Object)myInteger).getClass().getSimpleName());
        System.out.println("myString es de  tipo" + ((Object)myString).getClass().getSimpleName());
        System.out.println("myDouble es de  tipo" + ((Object)myDouble).getClass().getSimpleName());
        System.out.println("myShort es de  tipo" + ((Object)myShort).getClass().getSimpleName());
        System.out.println("myBoolean es de  tipo" + ((Object)myBoolean).getClass().getSimpleName());
        System.out.println("myObject es de  tipo" + ((Object)myObject).getClass().getSimpleName());
        
       
        
    }
}
