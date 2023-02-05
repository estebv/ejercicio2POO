package com.mycompany.ejercicio2;

public class Colibri extends Ave implements Muerte {

    @Override
    public void dormir() {
        System.out.println("duerme en flores");
    }

    @Override
    public String morir(int anioNacimineto, int anioMuerte, String causaDeMuerte) {
        int vida = (anioMuerte - anioNacimineto);
        return "la fecha de su muerte es " + anioMuerte + " vivio " + vida + " años y su causa de muerte fue " + causaDeMuerte;
    }

    @Override
    public String reencarnar(String reencarno) {
        return "reencarno " +reencarno;
    }

    public ModeloAnimal informacionGlobal;

    public Colibri() {
        ModeloAnimal informacioncolibri = new ModeloAnimal();
        informacioncolibri.setCola(false);
        informacioncolibri.setNariz("pequeña");
        informacioncolibri.setOrejas("no tiene pero si orificios auditivos");
        informacioncolibri.setPatas(2);
        informacioncolibri.setSexo("macho");

        informacionGlobal = informacioncolibri;

    }

    public Colibri(ModeloAnimal informacioncolibri) {
        informacionGlobal = informacioncolibri;

    }

}
