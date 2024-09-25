/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;
public class OperdoresLogicos {
    
    public void operador(){
        boolean esVerdadero = true ;
        boolean esFalso = false;
        
        //operadora AND (&&)
        boolean resultado = esVerdadero && esFalso;
        System.out.println("RESULTADO AND : "+ resultado);
        
    //operadora OR (||)
        boolean resultado1 = esVerdadero || esFalso;
        System.out.println("RESULTADO OR : "+ resultado1);
       
        
    //operadora NOT (!)
        boolean resultado2 = !esVerdadero  ;
        System.out.println("RESULTADO NOT : "+ resultado2);
        
        
       
    }
}
