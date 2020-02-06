/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 07-12s18042 Indah Sibarani
 * @author 07-12s18049 Natasya Sitorus
 */
    //Tugas 4//
public class Main {
    public static void main(String[] _args) {
        System.out.println("Hello, world!");
        
     //Tugas 5//   
    int gear = 1;
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    gear++;
    result = !result;
    capitalC += 4;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    int hexVal = 0x1a;
    int binVal = 0b11010;
    
    System.out.println(hexVal + ", " + binVal);
    
    //Tugas 6//
    String name = "Wiro Sableng";
    Short gearObject = 1;
    Boolean resultObj = true;
    
    System.out.println(name + ", " + gearObject + ", " + resultObj);
    
    name = name.toUpperCase();
    gearObject++;
    resultObj = (result == false) || !resultObj;
    
    System.out.println(name + ", " + gearObject + ", " + resultObj);
    
    //Tugas 7//
    int[] [] numbers = new int[10][10];
    
    for (int i = 0; i < numbers.length; ++i) {
        for (int j = 0; j < numbers[i].length; ++j) {
            numbers[i][j] = i + j;
        }
    }
    
    for (int i = 0; i < numbers.length; ++i) {
        for (int j = 0; j < numbers[i].length; ++j) {
            System.out.print(numbers[i][j] + " ");
        }
        System.out.println();
    }
    }
}   
