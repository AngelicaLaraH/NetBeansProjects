package com.mycompany.proyecto.bytebank;

public class CrearCuenta {
    
    public static void main(String[] args) {
       //Variable           = Valor
       //Variable        ->   123FFD 
       Cuenta primeraCuenta = new Cuenta();
       primeraCuenta.saldo = 400;
       //primeraCuenta.pais = "Peru"; No compila
        System.out.println(primeraCuenta.getsaldo);
        
         Cuenta segundaCuenta = new Cuenta ();
         segundaCuenta.depositar(400);
         System.out.println(segundaCuenta.saldo);
         //System.out.println(primeraCuenta.agencia);
         
         System.out.println(primeraCuenta);
         System.out.println(segundaCuenta);
         
          if (primeraCuenta.saldo == segundaCuenta.saldo ){
            System.out.println("Son el mismo objeto");
          } else {
              System.out.println("Son diferentes");
          }
      
    }
    
}
