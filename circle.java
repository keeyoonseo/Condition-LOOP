package test;



import java.util.Scanner;
public class circle {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("������ R(�Ǽ�)�� �Է��ϼ���>>");
    double r = in.nextDouble();
   
    System.out.printf("\n������ 4.5�� ���� ���� : %.3f", (r * r * 3.14));
    
  }
}