import java.util.Scanner;
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prueba
{
    // instance variables - replace the example below with your own
    private static final int LONGITUD_PALABRA = 6;

    /**
     * Constructor for objects of class prueba
     */
    public prueba()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellidos: ");
        String nombreCompleto = sc.nextLine();
        String[] cred = nombreCompleto.split(" ");
        System.out.println("Nombre: " + cred[0]);
        System.out.println("Primer apellido: " + cred[1]);
        System.out.println("Segundo Apellido: " + cred[2]);
    }
    
    public void verCaracteristicas()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu edad y altura: ");
        String caracteristicas = scan.nextLine();
        String[] caract = caracteristicas.split(" ");
        System.out.println("Edad: " + caract[0]);
        System.out.println("Altura: " + caract[1]);
    }
    
    public void verEdad()
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad1 = scann.nextInt();
        System.out.println("Introduce la edad de tu compañero: ");
        int edad2 = scann.nextInt();
        System.out.println("Tu edad: " + edad1);
        System.out.println("Edad de tu compañero: " + edad2);
        System.out.println("La suma de ambas es: " + (edad1 + edad2));
    }
    
    public void introducirPalabraDeSeisLetras()
    {
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Introduce una palabra de 6 letras: ");
        String palabraIntroducida = escaneo.next();
        while(palabraIntroducida.length() != LONGITUD_PALABRA){
            System.out.println("Error, la palabra introducida no tiene 6 letras.");
            System.out.println("Por favor, introduza una palabra con 6 letras: ");
            palabraIntroducida = escaneo.next();
        }
        System.out.println(palabraIntroducida.toUpperCase());
    }
}
