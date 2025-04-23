package calculator_lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppOfLv1 extends Calculator{
    public static void main(String[] args) {
        // 필요 기능 정의
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("첫 번째 양의 정수를 입력하세요: ");
            int index = sc.nextInt();
            System.out.println("두 번째 양의 정수를 입력하세요: ");
            int index2 = sc.nextInt();
            sc.nextLine();
            System.out.println("사칙연산 기호를 입력하세요: ");
            String option = sc.nextLine();

            int result = 0;

            switch (option) {
                case "+":
                    result = cal.calculator(index,index2,'+');
                    System.out.println("계산 결과: " + result);
                    break;
                case "-":
                    result = cal.calculator(index,index2,'-');
                    System.out.println("계산 결과: " + result);
                    break;
                case "*":
                    result = cal.calculator(index,index2,'*');
                    System.out.println("계산 결과: " + result);
                    break;
                case "/":
                    if (index2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        continue;
                    } else {
                        result = cal.calculator(index,index2,'/');
                        System.out.println("계산 결과: " + result);
                    }
                    break;
                case "%":
                    result = cal.calculator(index,index2,'%');
                    System.out.println("계산 결과: " + result);

                    break;
                default:
                    System.out.println("지원하지 않는 연산기호입니다.");
                    continue;
            }



            System.out.println("exit 입력시 계산 종료 (아무 키 입력시 계속 계산): ");
            String isExit = sc.nextLine();

            // 전체 반복문을 중단시키는 조건문을 연산 switch문 뒤에 최종 배치
            if (isExit.equals("exit")) {
                System.out.println("계산을 종료합니다");
                break;
            }
        }

        ArrayList<Integer> results2 = cal.getResults();
        System.out.println("계산 결과값 목록: " + results2);

        while (true){
            System.out.println("계산 결과값 목록을 수정하시겠습니까?");
            System.out.println("- 아무 키 입력시 수정 진행");
            System.out.println("- no 입력시 시스템 종료");

            String isDone = sc.nextLine();

            if(isDone.equals("no")){break;}
            else {
                System.out.println("수정할 인덱스 번호 입력");
                int newIndex = sc.nextInt();

                System.out.println("새로 넣을 값 입력");
                int newValue = sc.nextInt();
                sc.nextLine();

                cal.setResults(newIndex, newValue);
                System.out.println("계산 결과값 목록: " + results2);

            }
        }



    }
}
