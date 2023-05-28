
public class TipoVariable {
    //Hola mundo para entender la estrutura basica de redacción de Java//
    public static void main (String[] args){
        System.out.println( "Hola mundo!!!");
        
        // Variable int para numeros enteros//
        int edad = 28;
        System.out.println(edad);
        
        edad = 47;
        System.out.println(edad);
        
        edad = 46 + 88;
        System.out.println("Mi edad es "+ edad);
        
        //Variable tipo double  para uso de numeros decimales... Al ejecutarse solo retornara 1250.5 pues el 0 "teoricamente no tiene valor"//
        
        double salario = 1250.50;
        System.out.println(salario);
        
        salario = 1250.56;
        System.out.println(salario);
        
        double edadDos = 28;
        System.out.println(salario);
                
        double salarioMitad = salario / 2;
        System.out.println(salarioMitad);
        
        int division = 1250 / 3;
        System.out.println(division);
        
        //ejercio operaciones entre numeros"
        
        double peso = 4.0;
        int cantidad = 10;
        System.out.println(peso * cantidad);
        
        
        
        double precio = 5.5;
        int tickets = 4;
        System.out.println(precio * tickets);
        
        int dia = 4;
        int otroDia = 4 + dia;
        System.out.println(otroDia);
        
        //Conversiones
        
        double variable1 = 230.89;
        int variable1Entero = (int) variable1; //Cast
        
        System.out.println(variable1Entero);
       
        //long prueba = 1222222222222222222L;
        //short numeroPequeno = 13555;
        //byte numeroAunManPqueno = 15;
        //float numeroDecimalPequeno = 2.5F;
        int resultado = (int) variable1 + variable1Entero; 
        System.out.println(resultado);
    }
    
}
