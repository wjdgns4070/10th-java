package _01_basic_syntax;

public class DataTypes {
    public static void main(String[] args) {
    // 식별자
    char name; // 0
    int name2; //숫자 사용가능
    // int 2name; //단 맨앞숫자 불가능
    // char for ; //예약어도 불가능
    char student_ID$; // 특수기호는 _와$만 가능

    // 기본형 Primitive Type
    // - 사용되기 전에 선언 되어야 함
    // - os에 따라서 자료형 길이가 변하지 않음
    // - "비객체" 타입 -> null 값 가질 수 없음
    System.out.println("===기본형====");
    // 정수형 변수 선언
    int x = 10;
    long y = 1000000L; // long 타입은 뒤에 'L' 이나 'l' 붙여야 함
    short z = 3545;
    byte b = 123;

    // 실수형 변수 선언
        float a = 3.14f; // float 타입은 뒤에 'f' 나 'F' 붙여야함
        double c = 2.54;

    // 문자형 변수 선언
        char ch = 'a';

    // 논리형 변수 선언
        boolean bool = true;

    // 변수 출력
    System.out.println("정수형 변수 : " + x + ',' + y + ',' + z);



    ///////////////////////////////
    // 참조형 Reference Type
    // - java.lang.Object 상속 받음
    // - 기본형이 아니면 모두 참조형

    System.out.println("===참조형===");

    // String 참조 변수 선언과 초기화
    // - Java 에서 String 타입은 특별함. 참조형이지만, 기본형처럼 사용함 (불변 객체)
    // - 기본 자료형은 "==" 비교하지만, String 객체간 비교는 .equals() 메소드 사용
    String greeting = "Hello, World!";

    // 배열 (Array) 참조형 변수 선언과 초기화
        int[] nums = {1,2,3,4,5};

    // 클래스 (class) 참조형 변수 선언과 초기화
    // ??? Person person = new Person();

    // 출력
    System.out.println("String 변수 :" + greeting);

    System.out.println("배열 변수 :");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }

    }
}

// 클래스 (추후 배울 예정)
class Person {
    String name;
    int age;
    public  Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public  String getName () {
        return  name;
    }


    public  int getAge () {
        return  age;
    }

}
