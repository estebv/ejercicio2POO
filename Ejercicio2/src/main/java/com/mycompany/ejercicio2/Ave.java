package com.mycompany.ejercicio2;

public class Ave extends Animal {
    
    public String trinar(String trino) {
        return "fifu"+trino;
    }
    @Override
    public void comer() {
        System.out.println("gusanos");
    }
}
