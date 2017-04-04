package test;



import java.util.Scanner;
public class circle {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("반지름 R(실수)을 입력하세요>>");
    double r = in.nextDouble();
   
    System.out.printf("\n반지름 4.5인 원의 면적 : %.3f", (r * r * 3.14));
    
  }
}