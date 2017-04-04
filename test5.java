package test;

import java.util.Scanner; 
public class test5 { 
   public static void main(String[] args) { 
      Scanner s = new Scanner(System.in); 
      double [] 입력배열 = new double[5]; 
      double 합 = 0.0; 
      double 평균 = 0.0; 
      for(int n=0; n<입력배열.length; n++) { 
         System.out.print("n개의 실수를 입력하세요 : "); 
         입력배열[n] = s.nextDouble(); 
      } 
      for(double n=0.0; n<입력배열.length; n++) { 
         합 += 입력배열[5]; 
      } 
      System.out.print("합산결과: " + 합); 
      System.out.print("평균: " + (double)합/5); 
   } 
} 