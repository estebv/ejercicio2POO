package com.mycompany.ejercicio2;

public class Main {

    public static void main(String[] args) {

        Colibri colibri = new Colibri();
        String morirRespuesta = colibri.morir(2000, 2012, " : se lo comio una culebra");
        System.out.println(morirRespuesta);
       String otraa = colibri.reencarnar(" en un sapo");
        System.out.println(otraa);
        String canto = colibri.trinar("fifu ");
        System.out.println(canto);
        colibri.dormir();

        Vaca vaca = new Vaca();
        String morirVaca = vaca.morir(1997, 2050, " electrocutada");
        System.out.println(morirVaca);
        String otra = vaca.reencarnar(" pollo ");
        System.out.println(otra);
        vaca.beberLeche("leche");
        vaca.dormir();

    }
}
