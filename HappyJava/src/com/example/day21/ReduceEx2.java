package com.example.day21;

import java.util.Arrays;
import java.util.List;

public class ReduceEx2 {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("jung", 100, Member.MALE),
                new Member("hong", 90, Member.FEMALE),
                new Member("kim", 80, Member.MALE),
                new Member("lee", 70, Member.MALE)
        );

        //Member 들의 score 총합
        int memberTotalScore = members
                .stream()
                .mapToInt(Member::getScore)
                .reduce(0, (a, b) -> a + b);

        int memberTotalScore1 = members
                .stream()
                .mapToInt(Member::getScore)
                .sum();

        int memberTotalScore2 = members
                .stream().mapToInt(Member::getScore)
                .reduce((a,b)->a+b)
                .getAsInt();

        System.out.println(memberTotalScore);
        System.out.println(memberTotalScore1);
        System.out.println(memberTotalScore2);
    }
}
