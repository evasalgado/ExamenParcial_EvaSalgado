/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenparcial_evasalgado;

import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class ExamenParcial_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int resp = 1;
        int opcion = 0;

        while (resp != 0 && opcion != 2) { //menu
            System.out.println("----MENU----");
            System.out.println("1. Ejercicio de Palabras");
            System.out.println("2. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: //ejercicios de palabras
                    System.out.println("Has elegido: Ejercicios de 2 palabras");
                    
                    String cadena1 = " ", cadena2 = " ";
                    System.out.println("Ingrese una cadena: ");
                    cadena1 = leer.nextLine();
                    cadena1 = leer.nextLine();
                    System.out.println("Ingrese otra cadena: ");
                    cadena2=leer.nextLine();
                    
                    
                    EjerciciodePalabra(cadena1,cadena2);
                    System.out.println("Desea ingresar otra opcion?[1/0]: ");
                    resp = leer.nextInt();
                    break;
                case 2: //salir
                    System.out.println("Gracias por usar mi programa");
                    break;
                default: //numero ingresado es diferente a los disponibles
                    System.out.println("Numero ingresado no valido");
                    System.out.println("Ingrese otro numero");

                    break;
            }
        }
    }
    
    public static void EjerciciodePalabra (String cadena1, String cadena2){
        
        String cadenanueva = " ";
        if(cadena1.equals(cadena2)){ //cadenas iguales
            String cadena2edit = " "; //cadena2 editada
            for(int j=cadena2.length()-1;j>=0;j--){
                char letras = cadena2.charAt(j); 
                cadena2edit+=letras;
            } 
            System.out.print(cadena1+cadena2edit);
            System.out.println("");
        } else if(!cadena1.equalsIgnoreCase(cadena2)){ //cadenas iguales en largo
            for(int i=0;i<cadena1.length();i++){
                String letras1 = cadena1.charAt(i)+"";
                String letras2 = cadena2.charAt(i)+"";
                cadenanueva += letras1+letras2;
            } 
            System.out.println(cadenanueva);
        } else { //cadenas diferentes en largo
            String letter1 = " ";
            String letter2 = " ";
            for(int i=0;i<cadena1.length();i++){
                letter1 = cadena1.charAt(i)+ "";
            } 
            for(int j=0;j<cadena2.length();j++){
                letter2 = cadena2.charAt(j)+" ";
            } 
            cadenanueva += letter1 + letter2;
            System.out.println(cadenanueva);
        } 
    }

} //fin del programa
