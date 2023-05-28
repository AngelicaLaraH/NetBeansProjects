public class EjemploCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char caracter = 'a';
        System.out.println(caracter);
        
        caracter = 65;
        System.out.println(caracter);
        
        caracter = 65 + 1;
        char segundoCaracter = (char)(caracter + 1);
        
        System.out.println(segundoCaracter);
        
        String palabra = "Alura  cursos online";
        System.out.println(palabra);
        
        palabra = palabra + "2020";
        System.out.println(palabra);
        
    }
}
