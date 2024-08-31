
package btvn_30082024;

import java.util.Scanner;

public class BTVN_30082024 {
    public static float[] importData(float[] arrays) {
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<arrays.length;i++){
            System.out.print("Gia tri thu "+(i+1)+":");
            arrays[i]=keyboard.nextFloat();
        }
        return arrays;
    }
    public static void printData(float[] arrays) {
        System.out.print("Cac phan tu trong mang la:");
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }
    public static void findMax2(float[] arrays) {
        double max1 = 0;
        double max2 = 0;
        for(int i=0;i<arrays.length;i++){
           if(i==0){
               max1=arrays[i];
           } else if(arrays[i]>max1){
               max1=arrays[i];
           }
        }
        System.out.println("\nSo lon nhat trong mang la :"+max1);
        for(int i=0;i<5;i++){
           if(max2>arrays[i]){
               max2=arrays[i];
           }
        }
        for(int i=0;i<arrays.length;i++){
           if(arrays[i]>max2&&arrays[i]!=max1){
               max2=arrays[i];
           }
        }
        System.out.print("\nSo lon thu hai trong mang la :"+max2);
    }
    public static void deleteOddNumber(float[] arrays) {
        
        System.out.print("\nMang sau khi xoa cac phan tu le:");
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]%2!=0){
                arrays[i]=0;
            }
        }
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]!=0){
                System.out.print(arrays[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhap n:");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        float[] arrays=new float[n];
        importData(arrays);
        printData(arrays);
        findMax2(arrays);
        deleteOddNumber(arrays);
    }
}
