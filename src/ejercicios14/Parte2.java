/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Parte2 {
    private static java.util.Scanner sc;
    private static ArrayList<String> l1;
    private static ArrayList<String> l2;
    private static Set<String> ambas;
    private static Set<String> aux1;
    private static Set<String> aux2;
    private static Set<String> una;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sc = new java.util.Scanner(System.in);        
        System.out.print("Introduce la primera frase: ");
        String s1 = sc.nextLine();
        System.out.print("Introduce la segunda frase: ");
        String s2 = sc.nextLine();
        
        l1 = new ArrayList<>(Arrays.asList(s1.split(" +")));
        l2 = new ArrayList<>(Arrays.asList(s2.split(" +")));
        aux1 = new HashSet<>(l1);
        aux2 = new HashSet<>(l2);
        ambas = new HashSet<>(l1);
        una = new HashSet<>(aux1);

        aux1.removeAll(l2);
        aux2.removeAll(l1);
        una.addAll(aux1);
        una.addAll(aux2);
        ambas.removeAll(aux1);
        
        System.out.print("Las palabras que estan en ambas:" + ambas);
        System.out.print("Las palabras que estan en una:" + una);
    }

}
