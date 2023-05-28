package com.mycompany.bytebank.heredado;

public class TestFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setDocumento("Diego");
        diego.setDocumento("444556665");
        diego.setSalario(2000);
        diego.setTipo(0);
        
        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
    
}
