/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //crear directorio
        File raiz = new File("c:/raiz");
        if(raiz.exists()==false){
            raiz.mkdir();
        }
        
        //crear 1000 directorios
        for(int i=0;i<=1000;i++){
            File directorio = new File("c:/raiz/directorio"+i);
            directorio.mkdir();
        }
        
        //borrar 500 directorios
        for(int i=0;i<=500;i++){
            File directorio = new File("c:/raiz/directorio"+i);
            directorio.delete();
        }
        
        //cambiar de nombre a 250 directorios
        for(int i=501;i<=751;i++){
            File directorio = new File("c:/raiz/directorio"+i);
            File hola = new File("c:/raiz/hola"+i);
            directorio.renameTo(hola);
        }
    }
    
}
