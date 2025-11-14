/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapasdiccionario;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class MapasDiccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //mini diccionario español ingles que contenga 20 palabras utiliza un objeto hash map, el programa pedira una palabra en español y devolvera la palabra en ingles
       //escoger al azar 1 palabras en español, nos dara 5 opciones a elegir para adivinar
       Scanner scan=new Scanner(System.in);
       
       int num=(int)(Math.random()*20);
       
       HashMap <String,String> Diccionario= new HashMap<>();
       Diccionario.put("rojo","red");
       Diccionario.put("azul","blue");
       Diccionario.put("amarillo","yellow");
       Diccionario.put("verde","green");
       Diccionario.put("perro","dog");
       Diccionario.put("gato","cat");
       Diccionario.put("libro","book");
       Diccionario.put("marron","brown");
       Diccionario.put("raton","mouse");
       Diccionario.put("serpiente","snake");
       Diccionario.put("tiburon","shark");
       Diccionario.put("lagaro","lizard");
       Diccionario.put("morado","purple");
       Diccionario.put("blanco","white");
       Diccionario.put("negro","black");
       Diccionario.put("mono","monkey");
       Diccionario.put("energia","energy");
       Diccionario.put("papa","dad");
       Diccionario.put("mama","mom");
       Diccionario.put("gafas","glasses");
       
        System.out.println("Introduce una palabra en español: ");
        String palabra= scan.next();
        
        if(Diccionario.get(palabra)==null){
            System.out.println("Esa palabra no esta");
        }else{
            System.out.println("La palabra en ingles es: "+Diccionario.get(palabra));
        }
        
       //Segunda parte
        //PASAR LAS CLAVES DE UN MAPA PARA ARRAY PARA PODER PONERLAS ALEATORIAMENTE (en el archivo colecciones set hay otras maneras de hacerlo)
        Set <String> español=Diccionario.keySet();
        
        String[] arrayEspañol=español.toArray(new String[español.size()]);
        //
        System.out.println("Mostrando palabra para adivinar: ");
        String adivinar=arrayEspañol[num];
        System.out.println(adivinar);
        
        
         LinkedList<String> Claves= new LinkedList<>();
         
         //añadimos las opciones
         for(int i=0;i<4;i++){
             num=(int)(Math.random()*20);
             Claves.add(Diccionario.get(arrayEspañol[num]));
         }
             Claves.add(Diccionario.get(adivinar));
             
             //barajamos las opciones
             Collections.shuffle(Claves);
             
            System.out.println("Mostrando opciones: ");
            System.out.println(Claves);
            
            System.out.println("Introduce la traduccion: ");
            palabra=scan.next();
            
            if(Diccionario.get(adivinar).equals(palabra)){
                System.out.println("Correcto!");
            }else{
                System.out.println("Incorrecto...");
            }    
        
    }
    
}
