package calculator_lv2;

import sun.security.mscapi.CPublicKey;

import javax.xml.ws.BindingType;
import java.util.ArrayList;
import java.util.Queue;

public class Calculator {
    // 속성
    private ArrayList<Integer> results = new ArrayList<>();


    // 기능
    public int calculator(int index, int index2, char option){
        int result = 0;

        switch (option){
            case'+':
                result = (index + index2);
                break;
            case'-':
                result = (index - index2);
                break;
            case'*':
                result = (index * index2);
                break;
            case'/':
                result = (index / index2);
                break;
            case'%':
                result = (index % index2);
                break;
            default:
                System.out.println("지원하지 않는 연산자");
        }
        return result;
    }

}
