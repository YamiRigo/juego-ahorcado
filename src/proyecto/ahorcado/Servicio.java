/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ahorcado;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Metodos info = new Metodos();
     
     public void crearJuego(){
         System.out.println("***** CREADOR *****");
         System.out.print("---> Ingreso de Palabra: ");
         String palabra = leer.next();
         String aux[] = new String[palabra.length()];
         for(int i=0; i < palabra.length(); i++){
             aux[i] = palabra.substring(i, i+1);
         }
         info.setPalabraBuscar(aux);
         System.out.println("---> Ingreso de la cantidad de intentos: ");
         info.setCantJugadas(leer.nextInt());
         info.setCantLetras(0);
         info.setLongPalabra(info.getPalabraBuscar().length);
         System.out.println("---> Longitud de la palabra: "+info.getLongPalabra());
     }
     public void Longitud(){
         info.setLongPalabra(info.getPalabraBuscar().length);
         System.out.println("Longitud de la palabra: "+info.getLongPalabra());
     }
     public void BuscarLetra(){
         System.out.println("<<<< JUEGO AHORCADO >>>>");
         System.out.println("Ingrese una letra: ");
         info.setLetra(leer.next());
         boolean valor = false;
         Longitud();
         String palabraBuscar[] = info.getPalabraBuscar();
         for(int i=0; i < info.getLongPalabra(); i++){
             if(palabraBuscar[i].equals(info.getLetra())){
                 valor = true;
             }
         }
         if(valor == true){
             System.out.println("La letra pertenece a la palabra");
         }else{
             System.out.println("La letra no pertenece a la palabra");
         }
     }
     public boolean Encontradas(){
         String palabraBuscar[] = info.getPalabraBuscar();
         boolean estado = false;
         for(int i=0; i < info.getLongPalabra(); i++){
             if(palabraBuscar[i].equals(info.getLetra())){
                 info.setCantLetras(info.getCantLetras()+1);
                 estado = true;
             }else{
                 estado = false;
             }
         }
         System.out.println("Número de letras(encotradas, faltantes):("+info.getCantLetras()+","+(info.getLongPalabra()-info.getCantLetras())+")"); 
         return estado;
     }
     public void Intentos(){
         int intentos = info.getCantJugadas();
         info.setCantJugadas(intentos - 1);
         System.out.println("Número de oportunidades restantes: "+info.getCantJugadas());
     }
     public void Juego(){
         crearJuego();
         do{
             BuscarLetra();
             Encontradas();
             Intentos();
         }while(info.getCantJugadas() != 0 && (info.getLongPalabra() - info.getCantLetras())!= 0);
         if(info.getCantJugadas() == 0){
             System.out.println("---> Lo sentimos, no tienes más oportunidades");
         }else{
             System.out.println("---> Ha ganado el juego!!");
         }
         
     }
     
}
