package com.example.day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("jung", 100,Member.MALE),
                new Member("hong", 90,Member.FEMALE),
                new Member("kim", 80,Member.MALE),
                new Member("lee", 70,Member.FEMALE)
        );

        Map<Integer, List<Member>> mpaBySex = members.stream()
                .collect(Collectors.groupingBy(Member::getSex));

        System.out.println("남자");
        mpaBySex.get(Member.MALE).stream()
                .forEach(member -> System.out.println(member.getName()));

        System.out.println("여자");
        mpaBySex.get(Member.FEMALE).stream()
                .forEach(member -> System.out.println(member.getName()));

    }
}
