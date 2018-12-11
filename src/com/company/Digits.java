package com.company;

import java.util.ArrayList;

public class Digits {
    private ArrayList digitList;
    public Digits(int num) {
        String numStr = Integer.toString(num);
        String[] arrNum = numStr.split("");
        for(int i = 0; i < arrNum.length; i++) {
            digitList.add(Integer.valueOf(arrNum[i]));
        }
        for(int i = 0; i < digitList.size(); i++){
            System.out.println(digitList);
        }
    }
}
