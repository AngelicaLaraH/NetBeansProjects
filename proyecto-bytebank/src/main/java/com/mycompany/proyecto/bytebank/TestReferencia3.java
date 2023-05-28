package com.mycompany.proyecto.bytebank;

public class TestReferencia3 {

    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta();
        
        cuentaDeDiego.titular = new Cliente();
        cuentaDeDiego.titular.nombre = "Diego";
        
        //No se puede dar un null.value ...aqui se dispara una execpcion 
        System.out.println(cuentaDeDiego.titular.nombre);
    }
}
