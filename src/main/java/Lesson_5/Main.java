package Lesson_5;

public class Main {

    public static void main(String[] args) {
        System.out.println(pow(2, 6));
    }

    static int pow (int base, int power) {
        if (power == 0)
            return 1;
        return base * pow(base, power - 1);
    }

}
