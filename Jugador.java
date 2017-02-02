import java.util.Random;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Carta[] mano;
    private int cartasEnMano;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre)
    {
        this.nombre = nombre;
        mano = new Carta[5];
        cartasEnMano = 0;
    }
    public String getNombre()
    {
        return nombre;
    
    }
    public void recibirCarta(Carta cartaRecibida){
        if(cartasEnMano < mano.length){
            mano[cartasEnMano]= cartaRecibida;
            cartasEnMano++;
        }
        else{
            System.out.println("Tu mano esta llena.");
        }
    }
    public void verManoDelJugador(){
        int index = 0;
        while(index < mano.length){
            if(mano[index] != null){
                System.out.println(mano[index]);
                index++;
            }
        }
    }
    public Carta tirarCarta(String cartaTirada)
    {
       Carta cartaEscogida = null;
       if(cartasEnMano > 0){
           boolean buscando = true;
           int contadorCartas = 0;
           while(contadorCartas < mano.length && buscando){
               cartaEscogida = mano[contadorCartas];
               if(cartaEscogida != null && cartaTirada.equals(cartaEscogida.toString())){
                   buscando = false;
                   mano[contadorCartas] = null;
                   cartasEnMano--;
                   System.out.println(nombre + " tira la carta: " + cartaEscogida);
                }
            } 
       }
       return cartaEscogida;
    }
    public Carta sacarCartaAleatoria()
    {
        Carta cartaTirada = null;
        if(cartasEnMano > 0){
            Random cartaAleatoria = new Random();
            boolean buscando = false;
            while(!buscando){
                int aleatorio = cartaAleatoria.nextInt(mano.length);
                if(mano[aleatorio] != null){
                    cartaTirada = mano[aleatorio];
                    mano[aleatorio] = null;
                    cartasEnMano--;
                    System.out.println(nombre + " tira la carta " + cartaTirada);
                    buscando = true;
                }
            }
        }
        return cartaTirada;
    }
}
