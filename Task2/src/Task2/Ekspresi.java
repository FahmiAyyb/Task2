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
public class Ekspresi {
    public static void main(String[] args) {
        int x = 1; int y = 2;

        System.out.print("x = "+ x + "\n");
        System.out.print("y = "+ y + "\n");
        System.out.print("hasil ekspresi = (x<y) ? (x:y) = "+ ((x < y) ? x : y));
    }
}
