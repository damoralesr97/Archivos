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
        File raiz = new File("c:/raiz");
        if(raiz.exists()==false){
            raiz.mkdir();
        }
        File directorio =new File("c:/raiz/directorio");
        for(int i=0;i<=1000;i++){
            
        }
    }
    
}
