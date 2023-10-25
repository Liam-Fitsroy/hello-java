import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t Добро пожаловать в калькулятор");
        System.out.print("Введите первое число: ");
        double first_num = new Scanner(System.in).nextDouble();
        System.out.print("Введите первое число: ");
        double second_num = new Scanner(System.in).nextDouble();
        System.out.print("Введите арифметическое действие: ");
        String sign = new Scanner(System.in).nextLine();
        switch (sign) {
            case "*" ->
                    System.out.println(first_num * second_num);
            case "/" ->
                    System.out.println(first_num / second_num);
            case "+" ->
                    System.out.println(first_num + second_num);
            case "-" ->
                    System.out.println(first_num - second_num);
            default -> {
                System.out.println("Не понимаю");
                System.out.println(sign);
            }
        }

    }
}
