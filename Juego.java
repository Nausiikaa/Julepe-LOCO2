import java.util.Random;
import java.util.ArrayList;
/** 
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // instance variables - replace the example below with your own
    private Jugador[] jugadoresEnPartida;
    private Mazo mazo;
    private Palo paloQuePinta;
    public Juego(int numeroDeJugadores,String nombreJugadorHumano)
    {

        mazo = new Mazo();
        jugadoresEnPartida = new Jugador[numeroDeJugadores];
        ArrayList <String> posiblesNombres = new ArrayList<String>();
        posiblesNombres.add("Nacho");
        posiblesNombres.add("Brian");
        posiblesNombres.add("Miguel");
        posiblesNombres.add("Silvia");
        posiblesNombres.add("Aitor");
        posiblesNombres.add("Oscar");
        posiblesNombres.add("Valerie");
        posiblesNombres.add("Cristian");
        posiblesNombres.add("Rebeca");
        posiblesNombres.add("Azahara");
        posiblesNombres.add("Borja");
        posiblesNombres.add("Adrian");
        posiblesNombres.add("Ethan");
        posiblesNombres.add("Sara");
        posiblesNombres.add("Benavides");
        Random aleatorio = new Random();
        Jugador jugadorHumano = new Jugador(nombreJugadorHumano);
        jugadoresEnPartida[0] = jugadorHumano;
        for(int i = 1;i < numeroDeJugadores; i++){
            int posicionNombre = aleatorio.nextInt(posiblesNombres.size());
            String nombre = posiblesNombres.get(posicionNombre);
            posiblesNombres.remove(posicionNombre);

            Jugador jugador =new Jugador(nombre);
            jugadoresEnPartida[i] = jugador;
        }
        for(int i = 0; i < numeroDeJugadores; i++){
            String nombre = jugadoresEnPartida[i].getNombre();
            System.out.println("Bienvenido " + nombre + ".");
        }
    }
    public Palo getPaloPintado(){
        return paloQuePinta;
    }
    public void repartirCartas()
    {
        mazo.barajarMazo();
        int indexLento= 0;
        int jugador = jugadoresEnPartida.length;
        while(indexLento < 5){
            int indexRapido = 0;
            while(indexRapido < jugador){
                Jugador jugadorActual = jugadoresEnPartida[indexRapido];
                Carta cartaARepartir = mazo.sacarCarta();
                jugadorActual.recibirCarta(cartaARepartir);
                if(indexLento == 4 && indexRapido == (jugadoresEnPartida.length - 1)){
                    paloQuePinta = cartaARepartir.getPalo();
                    System.out.println("Pintan " +  paloQuePinta.toString().toLowerCase());
                }
                indexRapido++;
            }
            indexLento++;
        }
        jugadoresEnPartida[0].verManoDelJugador();
    }

    public void hacerTrampasYVerCartasDelJugador(String nombre){
        int contadorJugador = 1;
        boolean buscando = true;
        while(contadorJugador < jugadoresEnPartida.length && buscando){
            if(nombre.equals(jugadoresEnPartida[contadorJugador].getNombre())){
                jugadoresEnPartida[contadorJugador].verManoDelJugador();
                buscando = false;
            }
            contadorJugador++;
        }
    }
    public void verCartasDelJugadorHumano(){
        jugadoresEnPartida[0].verManoDelJugador();
    }
}
