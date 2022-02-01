/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios14;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Parte1 {
    private static java.util.Scanner sc;
    private static ArrayList<String> lista;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        sc = new java.util.Scanner(System.in);        
        lista = new ArrayList<String>();
        String palabra = "";
        do { 
            System.out.print("Introduce una palabra o 'final' para salir: ");
            palabra = sc.nextLine();
            if(!palabra.equals("final")){
                lista.add(palabra);
            }
            
        } while (!palabra.equals("final"));
        System.out.println(lista);
                        String seleccion = "";
        sc = new java.util.Scanner(System.in);
        String entrada;
        do {
            
            seleccion = "";
            System.out.println("****************");
            System.out.println("*1. Opción 1   *");
            System.out.println("*2. Opción 2   *");
            System.out.println("*3. Opción 3   *");
            System.out.println("*4. Opción 4   *");
            System.out.println("*5. Opción 5   *");
            System.out.println("*6. Opción 6   *");
            System.out.println("*7. Opción 7   *");
            System.out.println("*0. Salir      *");
            System.out.println("****************");
            seleccion = sc.nextLine();
            int posicion = -1;
            String s1;
            String s2;
            switch(seleccion){
                case "1":
                    System.out.print("Introduce el nombre que desea comprobar: ");
                    entrada = sc.nextLine();
                    System.out.printf("El nombre %sexiste en la lista",(lista.contains(entrada)?"":"NO "));
                    break;
                case "2":
                    System.out.print("Introduce el nombre que desea eliminar: ");
                    entrada = sc.nextLine();
                    ;
                    System.out.println(removeString(entrada)?"Eliminado con éxito":"el nombre NO existe");
                    break;
                case "3":
                    System.out.print("Introduce una cadena para eliminar las que la contengan: ");
                    CharSequence cadena = sc.nextLine();
                    for (int i = 0; i < lista.size(); i++) {
                        if(lista.get(i).contains(cadena)){
                            lista.remove(i);
                        }
                        
                    }
                    break;
                case "4":
                    do {                        
                        System.out.print("Introduce la posición: ");
                        if(sc.hasNextInt()){
                            posicion = sc.nextInt();
                        }else{
                            System.out.println("ERROR. introduce un numero entero");
                        }
                        if(posicion >= lista.size()){
                            System.out.println("ERROR. la posicion no existe");
                            posicion = -1;
                        }
                        
                    } while (posicion < 0);
                        System.out.println(lista.get(posicion));
                    break;
                case "5":
                    System.out.print("Introduce la cadena que desea remplazar: ");
                    s1 = sc.nextLine();
                    System.out.print("Introduce la cadena por la que se remplaza: ");
                    s2 = sc.nextLine();
                    if(lista.contains(s1)){
                        lista.set(lista.indexOf(s1), s2);
                    }else{
                        System.out.println("la cadena \"" + s1 + "\" no existe");
                    }
                    break;
                case "6":
                    System.out.print("Introduce la cadena que desea remplazar: ");
                    s1 = sc.nextLine();
                    System.out.print("Introduce la cadena por la que se remplaza: ");
                    s2 = sc.nextLine();
                    if(lista.contains(s1)){
                        do {                            
                            lista.set(lista.indexOf(s1), s2);

                        } while (lista.contains(s1));
                    }else{
                        System.out.println("la cadena \"" + s1 + "\" no existe");
                    }
                    
                    break;
                case "7":
                    System.out.println(lista);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    
            }
            
        } while(!seleccion.equals("0"));
        
    }
    public static boolean removeString(String s){
        int count = 0;
        while(lista.remove(s)){count++;}
        return count > 0;
    }
    
}
