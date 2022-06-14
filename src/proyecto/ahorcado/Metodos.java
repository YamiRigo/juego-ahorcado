/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ahorcado;

/**
 *
 * @author yamila
 */
public class Metodos {
    private String palabraBuscar[], letra;
    private int cantLetras, cantJugadas, longPalabra; 
    
    public Metodos(){  
    }
    public Metodos(String[] palabraBuscar, String letra, int cantLetras, int cantJugadas, int longPalabra){
        
    }
    public void setPalabraBuscar(String[] palabraBuscar){
        this.palabraBuscar = palabraBuscar;
    }
    public String[] getPalabraBuscar(){
        return palabraBuscar;
    }
    public void setLetra(String letra){
        this.letra = letra;
    }
    public String getLetra(){
        return letra;
    }
    public void setCantLetras(int cantLetras){
        this.cantLetras = cantLetras;
    }
    public int getCantLetras(){
        return cantLetras;
    }
    public void setCantJugadas(int cantJugadas){
        this.cantJugadas = cantJugadas;
    }
    public int getCantJugadas(){
        return cantJugadas;
    }
    public void setLongPalabra(int longPalabra){
        this.longPalabra = longPalabra;
    }
    public int getLongPalabra(){
        return longPalabra;
    }
}
