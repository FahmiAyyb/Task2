/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author Fahmii
 */
public class Oper4 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);
        
        System.out.print ("Nilai e = "+ e); System.out.print ("\nNilai k = "+ k); i = 2;
        j = 3;
        k = ((i++>j++) ? i: j) ;

        System.out.println("\nNilai k = "+ k);


    }
}
