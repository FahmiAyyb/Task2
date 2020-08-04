/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;
import java.util.Scanner;
/**
 *
 * @author Fahmii
 */
public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;

    System.out.print ("Contoh membaca dan menulis, ketik nilai integer: ");
    masukan = new Scanner(System.in);
    a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/
    System.out.println("Nilai yang dibaca : "+ a);
    }  
}

