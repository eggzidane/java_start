package method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5; // num1 = 변수
        System.out.println("1. changeNumber 호출 전, num1: " + num1); //5
        num1 = changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); //5

        //자바는 항상 변수의 값을 복사해서 대입한다. 여기서는 리턴을받아와서 num1에 대입을하였기에 10이나온다.
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
