package com.codestates.seb.calculator;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");


    Scanner input = new Scanner(System.in);       
   
      System.out.println("숫자 하나를 입력하시오.");   
      double firstNum = input.nextDouble();

      System.out.println("연산자 +,-,*,/ 중에 입력하시오.");
      String key = input.next();            

      System.out.println("숫자 하나를 입력하시오.");
      double secondNum = input.nextDouble();

       switch (key){
           case  "+" :
           System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
           break;
           case  "-" :
             System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
             break;
           case  "*" :
             System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
             break;
           case  "/" :
             System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
             break;
         default :
           System.out.println("잘못된 입력입니다");
           break;
       }
       input.close();