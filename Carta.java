
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // instance variables - replace the example below with your own
    private int valor;
    private Palo palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor,Palo palo)
    {
        // Numero de carta: De 1 a 7 y de 10 a 12(sota,caballo y rey)
        this.valor = valor;
        // Valor del palo: 0 oros,1 copas,2 espadas y 3 bastos
        this.palo= palo;
    }

    public int getValor(){
        return valor;
    }

    public Palo getPalo(){
        return palo;
    }

    public String getPaloNombre()
    {
        return palo.name();
    }

    public String toString(){
        String textoValor = String.valueOf(valor);
        String textoPalo = "";
        String textoADevolver = "";
        switch (palo) {
            case OROS:
            textoPalo = "de oros";
            break;
            case COPAS:
            textoPalo = "de copas";
            break;
            case ESPADAS:
            textoPalo = "de espadas";
            break;
            case BASTOS:
            textoPalo = "de bastos";
            break;
        }
        switch (valor) {
            case 1:
            textoValor = "as";
            break;
            case 10:
            textoValor = "sota";
            break;
            case 11:
            textoValor = "caballo";
            break;
            case 12:
            textoValor = "rey";
            break;
        }
        textoADevolver = textoValor + " " + textoPalo;
        return textoADevolver;
    }

    public boolean ganaA(Carta cartaACompararPreviamenteTirada, Palo paloQuePinta)
    {
        boolean gana = false;

        if (palo == cartaACompararPreviamenteTirada.getPalo()) {
            // En caso de que tengan el mismo palo...
            if (getPosicionEscalaTute() > cartaACompararPreviamenteTirada.getPosicionEscalaTute()) {
                gana = true;
            }
        }
        else {
            // En caso de que tengan distinto palo...
            if (palo == paloQuePinta) {
                gana = true;
            }
        } 

        return gana;
    }

    public int getPosicionEscalaTute() 
    {
        int posicion = valor;
        if (valor == 3) {
            posicion = 13;
        }
        else if (valor == 1) {
            posicion = 14;
        }
        return posicion;    
    }
}

