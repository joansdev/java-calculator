package calculator_lv2;

import java.util.ArrayList;

public class Calculator {

    // 속성
    private ArrayList<Integer> results = new ArrayList<>();


    // 기능
    public int calculator(int index, int index2, char option) {
        int result = 0;

        switch (option) {
            case '+':
                result = (index + index2);
                break;
            case '-':
                result = (index - index2);
                break;
            case '*':
                result = (index * index2);
                break;
            case '/':
                result = (index / index2);
                break;
            case '%':
                result = (index % index2);
                break;
            default:
                System.out.println("지원하지 않는 연산자");
        }
        results.add(result);
        return result;
    }

    // 게터
    public ArrayList<Integer> getResults() {
        return this.results;
    }

    // 세터
    public void setResults(int idx, int setValue) {
        this.results.set(idx, setValue);
    }
}
