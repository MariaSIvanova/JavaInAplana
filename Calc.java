import java.util.Scanner;

/**
 * @author Mivanova
 */
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вести первое дробное число А через запятую:");
        double A = scanner.nextDouble();
        System.out.println("Вести второе дробное число Б через запятую:");
        double B = scanner.nextDouble();
        System.out.println("Выбрать тип операции для (А ? Б) из следующих: +, -, *, /");
        String oper = scanner.next();
        double result = 0.0;
        switch (oper) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                result = A + B;
                break;
            default:
                System.out.println("Выбрали операцию не из списка");
        }
        /**
         * Вывод результата в формате 4 знака после запятой
         */
        System.out.printf("%.4f", result);
    }

}
