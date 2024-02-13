package _01_basic_syntax;

public class Casting {
    public static void main(String[] args) {


        double anotherBig = 20.5;
        int anotherSmall = (int)anotherBig;
        // double 을 int 로 강제 형 변환

        System.out.println("anotherSmall : " + anotherSmall);
        System.out.println("anotherBig : " + anotherBig);

        // 데이터 손실이 발생할 수 있는 경우 주의해야 함
        int largeNumber = 1000;
        byte smallByte = (byte) largeNumber;

        System.out.println("largeNumber" + largeNumber);
        System.out.println("smallByte" + smallByte);



    }
}
