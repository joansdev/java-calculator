package calculator_lv2;

import java.util.Scanner;

public class AppOfLv1 {
    public static void main(String[] args) {
        // 필요 기능 정의
        Scanner sc = new Scanner(System.in);

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
                    result = (index + index2);
                    System.out.println("계산 결과: " + result);
                    break;
                case "-":
                    result = (index - index2);
                    System.out.println("계산 결과: " + result);
                    break;
                case "*":
                    result = (index * index2);
                    System.out.println("계산 결과: " + result);
                    break;
                case "/":
                    if (index2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        continue;
                    } else {
                        result = (index / index2);
                        System.out.println("계산 결과: " + result);
                    }
                    break;
                case "%":
                    result = (index % index2);
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
    }
}
