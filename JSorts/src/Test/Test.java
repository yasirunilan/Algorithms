/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Random;
import Tools.JavaSort;

/**
 *
 * @author Trevi
 */
public class Test {
    private static int numbers[];
    private static final JavaSort SORT = new JavaSort();
    
    public static void main(String[] args){


        
        setupTest(12);

        System.out.println(printArray(numbers));
        numbers = SORT.bubbleSortAscending(numbers);
        System.out.println(printArray(numbers));        
        
        
              
    }
    private static void setupTest(int size){
        numbers = new int[size];
        numbers = fillArray(numbers);
        
    }
    
    public static String printArray(int arr[]){
        StringBuilder sb = new StringBuilder();
        int type = getPrintType(arr);
        System.out.println(type);
        switch (type) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    sb.append("-----");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(i);
                    sb.append(" |");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(arr[i]);
                    sb.append(" |");
                }
                sb.append("\n");
                for(int i = 0; i < arr.length; i++){
                    sb.append("-----");
                }
                sb.append("\n\n");
                return sb.toString();
            case 2:
                for (int i = 0; i < arr.length; i++) {
                    sb.append("------");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(i);
                    sb.append("  |");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(arr[i]);
                    sb.append(" |");
                }
                sb.append("\n");
                for(int i = 0; i < arr.length; i++){
                    sb.append("------");
                }
                sb.append("\n\n");
                return sb.toString();
            case 3:
                for (int i = 0; i < arr.length; i++) {
                    sb.append("-------");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("|  ");
                    sb.append(i);
                    sb.append("  |");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(arr[i]);
                    sb.append(" |");
                }
                sb.append("\n");
                for(int i = 0; i < arr.length; i++){
                    sb.append("-------");
                }
                sb.append("\n\n");
                return sb.toString();
            case 4:
                for (int i = 0; i < arr.length; i++) {
                    sb.append("--------");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("|  ");
                    sb.append(i);
                    sb.append("   |");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(arr[i]);
                    sb.append(" |");
                }
                sb.append("\n");
                for(int i = 0; i < arr.length; i++){
                    sb.append("--------");
                }
                sb.append("\n\n");
                return sb.toString();
            default:
                for (int i = 0; i < arr.length; i++) {
                    sb.append("---------");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("|   ");
                    sb.append(i);
                    sb.append("   |");
                }
                sb.append("\n");
                for (int i = 0; i < arr.length; i++) {
                    sb.append("| ");
                    sb.append(arr[i]);
                    sb.append(" |");
                }
                sb.append("\n");
                for(int i = 0; i < arr.length; i++){
                    sb.append("---------");
                }
                sb.append("\n\n");
                return sb.toString();     
        }
        
    }    
    public static int getPrintType(int arr[]){
    
        int type = 0;


        for (int i = 0; i < arr.length; i++) {
            

            if (arr[i]>=0 && arr[i]<10 && type < 2) {
                    type = 1;
            } 
            if(arr[i]>9 && arr[i]<100 && type < 3){
                    type = 2;               
            } 
            if(arr[i]>99 && arr[i]<1000 && type < 4){
                    type = 3;                   
            } 
            if(arr[i]>999 && arr[i]<10000 && type < 5){
                    type = 4;                    
            }
        }
        return type; 
    }   
    

    
    
    
    public static int[] fillArray(int num[]){
        Random rand = new Random();
        for(int i = 0; i < num.length; i++){
            // Math.random generates a number between 0 and 1
            // Multiply 9 to get a number between 0 and 90
            // Add 10 to get a number between 0 and 100
            // Cast as int for safe measure
            num[i] = rand.nextInt(100);
        }
        return num;
    }    
    
    
}
