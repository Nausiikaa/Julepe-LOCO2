
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
    private int palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor,int palo)
    {
        // Numero de carta: De 1 a 7 y de 10 a 12(sota,caballo y rey)
        this.valor = valor;
        // Valor del palo: 0 oros,1 copas,2 espadas y 3 bastos
        this.palo= palo;
    }
    public int getValor(){
        return valor;
    }
    public int getPalo(){
        return palo;
    }
    public String getPaloNombre()
    {
        String textoPalo = "";
        if(palo == 0){
            textoPalo = "oros";
        }
        if(palo == 1){
            textoPalo = "copas";
        }
        if(palo == 2){
            textoPalo = "espadas";
        }
        if(palo == 3){
            textoPalo = "bastos";
        }
        return textoPalo;
    }
    public String toString(){
        String textoADevolver = String.valueOf(valor);
        String textoPalo = "";
        if(palo == 0){
            textoPalo = " de oros";
        }
        if(palo == 1){
            textoPalo = " de copas";
        }
        if(palo == 2){
            textoPalo = " de espadas";
        }
        if(palo == 3){
            textoPalo = " de bastos";
        }
        if(valor == 1 || valor >= 10 && valor <=12){
            if(valor == 1){
                textoADevolver = "as" + textoPalo;
            }
            if(valor == 10){
                textoADevolver = "sota" + textoPalo;

            }
            if(valor == 11){
                textoADevolver = "caballo" + textoPalo;

            }
            if (valor == 12){
                textoADevolver = "rey" + textoPalo;

            }
        }
        textoADevolver = String.valueOf(valor) + textoPalo + "";
        return textoADevolver;
    }
    public boolean ganaA(Carta cartaAComparar, int paloQuePinta)
    {
        boolean gana = false;
        if (palo == cartaAComparar.getPalo()) {
            // En caso de que tengan el mismo palo...
            if (getPosicionEscalaTute() > cartaAComparar.getPosicionEscalaTute()) {
                gana = true;
            }
        }
        else {
            // En caso de que tengan distinto palo...
            if (cartaAComparar.getPalo() != paloQuePinta) {
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

