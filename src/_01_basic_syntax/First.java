package _01_basic_syntax;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("=== 이름을 입력하세요 ===");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지 문자열을 읽음
        System.out.println("=== 나이를 입력하세요 ===");
        String age = scanner.next(); // 공백 이전까지 문자열을 읽음

        System.out.println("안녕하세요! " + name + "님" +  "(" +age + "세)" );

    }
}
