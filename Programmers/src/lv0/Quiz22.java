package lv0;

import java.util.Arrays;

public class Quiz22 {
    public static void main(String[] args) {
        String answer = "";
        String str = "3x + 7 + x";
        int xNum = 0;
        int num = 0;
        String str1 = str.replaceAll("\\s","");
        String[] strArr = str1.split("");
        int[] x = new int[strArr.length]; // 상수


        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("x")){
                if(!strArr[i-1].equals("+")){
                    xNum += Integer.parseInt(strArr[i-1]);
                } if(strArr[i-1].equals("+")) xNum +=1;
            }else {
                if (!strArr[i].equals("x") && !strArr[i].equals("+") && !strArr[i+1].equals("x")) {
                    x[i] = Integer.parseInt(strArr[i]);
                }
            }
        }
        for (int i = 0; i < x.length; i++) { // 상수 합
            num+=x[i];
        }
        answer = xNum + "x" +"+"+ num;

        System.out.println(Arrays.toString(x));
        System.out.println(answer);

    }
}
