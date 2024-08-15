import java.util.*;
public class rectangle {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter Length::");
    int len = obj.nextInt();
    System.out.print("Enter Width::");
    int wid = obj.nextInt();
    double peri = 2*(len+wid);
    double area = len*wid;
    System.out.println("Perimeter of rectangle is::  "+peri);
    System.out.println("Area of rectangle is::  "+area);
  }
}
