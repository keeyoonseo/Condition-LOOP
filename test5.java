package test;

import java.util.Scanner; 
public class test5 { 
   public static void main(String[] args) { 
      Scanner s = new Scanner(System.in); 
      double [] �Է¹迭 = new double[5]; 
      double �� = 0.0; 
      double ��� = 0.0; 
      for(int n=0; n<�Է¹迭.length; n++) { 
         System.out.print("n���� �Ǽ��� �Է��ϼ��� : "); 
         �Է¹迭[n] = s.nextDouble(); 
      } 
      for(double n=0.0; n<�Է¹迭.length; n++) { 
         �� += �Է¹迭[5]; 
      } 
      System.out.print("�ջ���: " + ��); 
      System.out.print("���: " + (double)��/5); 
   } 
} 