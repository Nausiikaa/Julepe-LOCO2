
/**
 * Write a description of class Baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baza
{
    // instance variables - replace the example below with your own
    private Carta[] bazaActual;
    private String[] nombresJugadores;
    private int turno;
    private Palo paloPintado;
    private Carta cartaGanadoraDeBaza;
    /**
     * Constructor for objects of class Baza
     */
    public Baza(int jugadoresJugando,Palo paloQuePinta)
    {
        bazaActual = new Carta[jugadoresJugando];
        nombresJugadores = new String[jugadoresJugando];
        turno = 0;
        paloPintado = paloQuePinta;
        cartaGanadoraDeBaza = null;
    }

    public void addCarta(Carta cartaATirar,String nombreJugadorActual){
        if(turno < bazaActual.length){
            bazaActual[turno]= cartaATirar;
            nombresJugadores[turno]=nombreJugadorActual;
            turno++;
        }
    }

    public Palo getPaloPrimeraCartaDeLaBaza()
    {
        Palo paloPrimeraCartaDeLaBaza = null;
        int index = 0;
        if(bazaActual[index] != null){
            Carta cartaExaminandose = bazaActual[index];
            paloPrimeraCartaDeLaBaza = cartaExaminandose.getPalo();
        }
        return paloPrimeraCartaDeLaBaza;
    }

    public Carta cartaQueVaGanandoLaBaza(){
        int index = 0;
        if(bazaActual[index] != null){
            cartaGanadoraDeBaza = bazaActual[index];
            index++;
            while(index < bazaActual.length){
                if(cartaGanadoraDeBaza.ganaA(bazaActual[index],paloPintado) == true){
                    cartaGanadoraDeBaza = bazaActual[index];
                    index++;
                }
                else{
                    index++;
                }
            }
        }
        return cartaGanadoraDeBaza;
    }

    public String verNombreJugadorGanador()
    {
        int posicion = 0;
        int index = 0;
        if(bazaActual[index] != null){
            cartaGanadoraDeBaza = bazaActual[index];
            posicion = index;
            index++;
            while(index < bazaActual.length){
                if(cartaGanadoraDeBaza.ganaA(bazaActual[index],paloPintado) == true){
                    cartaGanadoraDeBaza = bazaActual[index];
                    posicion = index;
                    index++;
                }
                else{
                    index++;
                }
            }
        }
        return nombresJugadores[posicion];
    }
}
