/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hexa2decimal.hexa2decimal;

import java.util.Scanner;

public class Hexa2Decimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = input.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("The decimal value is: " + decimal);
    }
}

