import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Carta> mazo;

    /**
     * Constructor del mazo que crea todas las cartas de la baraja español
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();
        for(Palo palo : Palo.values()){
            for(int valorActual = 1; valorActual <= 12; valorActual++){
                if(valorActual != 8 && valorActual != 9){
                    mazo.add(new Carta(valorActual,palo));
                }
            }
        }
    }
    /**
     * Muestra las cartas que hay en el mazo en orden de posicion
     */
    public void verCartasDelMazo()
    {
        for(int i = 0; i < mazo.size(); i++){
            System.out.println(mazo.get(i));
        }
    }
    public void barajarMazo(){
        for(int index = 0; index < mazo.size(); index++){
            Random nuevaPosicion = new Random();
            int index2 = nuevaPosicion.nextInt(40);
            Carta carta1 = mazo.get(index);
            Carta carta2 = mazo.get(index2);
            mazo.set(index2,carta1);
            mazo.set(index,carta2);
        }
    }
	public Carta sacarCarta(){
	    Carta cartaSacada = null;
	    if(mazo.size() > 0){
	       cartaSacada = mazo.remove(0);
	    }
		return cartaSacada;
	}
}
