package com.codestates.seb.calculator;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");


    Scanner input = new Scanner(System.in);       // 스캐너 공부 다시 스캐너 이름 input
   
      System.out.println("숫자 하나를 입력하시오.");    //3번 입력 숫자 , 연산자 , 숫자 형식
      double firstNum = input.nextDouble();

      System.out.println("연산자 +,-,*,/ 중에 입력하시오.");
      String sign = input.next();              //들어오는 문자열이고 혹은 char sign = input.next().chatAt(0);

      System.out.println("숫자 하나를 입력하시오.");
      double secondNum = input.nextDouble();

       switch (sign){
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

       /*

            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
              -숫자 + 연산자 + 숫자
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
              -double 타입으로~
            4. 연산 결과를 콘솔에 출력합니다.
             -출력

        */
    // TODO ... 다른 방법으로 계산기 만들어보기

//     this.sum = new Array();

//     onkeydown(key){

//     if(key.num == '/'|key.num == '*'||key.num == '+'||key.num == '-'|)  
//       this.sum.push(this.led.text);
//       this.sum.text='';
//       this.sum.push(key.num);
//   }else if(key.num == '='){
//       this.sum.push(this.led.text);
//       var sumtext='';
//       this.sum,forEach(element => {
//           sumtext+=element;
//       }); 
//       this.led.text=eval(sumtext);
//       this.sum = new Array(); 
//   }else if(key.num == 'C'){
//       this.led.text='';
//       this.sum = new Array();  
//   }else{
//       this.led.text+=key.num;
//   }
// }