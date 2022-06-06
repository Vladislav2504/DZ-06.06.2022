package MainTask1;

public class Main {

    public static void main(String[] args) {

        Method methods = new Method("1234-abc-5678-def-9g0h");
        StringBuilder sb = new StringBuilder("Letters:");

        String number1 = methods.number1();
        System.out.println(number1);

        String number2 = methods.number2();
        System.out.println(number2);

        String number3 = methods.number3();
        System.out.println(number3);

        String number4 = methods.number4();
        System.out.println(sb+number4);

        String number5 = methods.number5();
        System.out.println(number5);

        String number6 = methods.number6();
        System.out.println(number6);

        String number7 = methods.number7();
        System.out.println(number7);

    }

}
