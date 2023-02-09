package com.mycompany.ejercicio2;

public class Vaca extends Mamifero implements Muerte {

    
    @Override
    public void beberLeche() {
        System.out.println("bebe leche solo por tres dias");
    }
    @Override
    public String morir(int anioNacimiento, int anioMuerte, String causaDeMuerte) {
        int edad = (anioMuerte - anioNacimiento) * 2;
        String pareimpar;
        if (edad % 2 == 0) {
            pareimpar = edad + " es par ";
        } else {
            pareimpar = edad + "no es par";
        }
        return "la fecha de su muerte fue " + anioMuerte + " el numero es " + pareimpar + " vivio " + edad + " años " + causaDeMuerte;
    }
    @Override
    public String reencarnar(String reencarno) {
        return "reeencarno en " +reencarno + "tu puedes";
    }
    public Vaca() {
        ModeloAnimal informacionvaca = new ModeloAnimal();
        informacionvaca.setCola(true);
        informacionvaca.setNariz("grande");
        informacionvaca.setOrejas("grandes");
        informacionvaca.setPatas(4);
        informacionvaca.setSexo("hembra");
    }
}
