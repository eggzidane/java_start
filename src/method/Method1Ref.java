package method;

public class Method1Ref {

    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10); //메서드를만나면 메서드본문으로가서 수행하고 리턴값을 받아온다.
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

        add(100, 200);
    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행을 합니다!");
        int sum = a + b;
        return sum;

    }
}
