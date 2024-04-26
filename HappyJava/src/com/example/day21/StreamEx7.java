package com.example.day21;

import java.util.Arrays;
import java.util.List;

public class StreamEx7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0); // 모든 숫자 양수
        boolean anyNegative = numbers.stream().anyMatch(n -> n < 0); // 어떤 숫자라도 음수
        boolean noneAboveTen = numbers.stream().noneMatch(n -> n > 10); // 모든 숫자가 10이하

        System.out.println("allPositive = " + allPositive);
        System.out.println("anyNegative = " + anyNegative);
        System.out.println("noneAboveTen = " + noneAboveTen);

        int[] intArr = {2, 4, 6, 8};
        boolean allMultipleOf3 = Arrays.stream(intArr).allMatch(n -> n % 3 == 0);
        boolean anyMultipleOf3 = Arrays.stream(intArr).anyMatch(n -> n % 3 == 0);
        boolean noneMultipleOf3 = Arrays.stream(intArr).noneMatch(n -> n % 3 == 0);

        System.out.println("모두 3배수?? : " + allMultipleOf3);
        System.out.println("하나라도 3배수?? : " + anyMultipleOf3);
        System.out.println("모두 3배수 아님?? : " + noneMultipleOf3);
    }
}
