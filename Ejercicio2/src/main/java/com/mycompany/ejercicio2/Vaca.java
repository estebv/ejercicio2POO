
package com.mycompany.ejercicio2;


public class Vaca extends Mamifero implements Muerte{

    @Override
    public void beberLeche(String leche) {
        System.out.println("bebe leche solo por tres dias");
    }
    
    @Override
    public String morir(int anioNacimiento, int anioMuerte, String causaDeMuerte) {
        
     
        
         int edad = (anioMuerte - anioNacimiento)*2;
         
         if (edad % 2 == 0) {
             System.out.println(edad+"es par");  
         }else{
             System.out.println(edad+"no es par");
         }
        return null;
    }


    @Override
    public String reencarnar(String reencarno) {
        return reencarno+"tu puedes";
    }
    
    public Vaca(){
        ModeloAnimal informacionvaca = new ModeloAnimal();
        informacionvaca.setCola(true);
        informacionvaca.setNariz("grande");
        informacionvaca.setOrejas("grandes");
        informacionvaca.setPatas(4);
        informacionvaca.setSexo("hembra");  
    }
}
