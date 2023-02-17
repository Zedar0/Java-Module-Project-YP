// dev branch for Y.Practicum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        int numberOfGuests = countNumberOfGuests(); //подсчёт количества гостей
        cart.collectTotalCart(); //подсчёт количества всех блюд,их цен и общей суммы товаров
        cart.printTotalCartAndSum(); // вывод на экран всех товаров, цен и общей суммы
        Calculator.splitCheck(numberOfGuests, cart.totalSum); // подсчёт и вывод суммы к оплате на каждого гостя
    }


    public static int countNumberOfGuests() {
        Scanner scanner = new Scanner(System.in);
        int currentNumberOfGuests;
        System.out.println("Введите количество гостей:");
        while (true) { //цикл запускает проверку введённых данных, пока не получит корректные
            if (scanner.hasNextInt()) {
                currentNumberOfGuests = scanner.nextInt();
                if (ChecksIntValues.checkIntValueOfGuests(currentNumberOfGuests)) { // вызывается метод проверки на корректность целого числа
                    break;
                }
            } else {
                System.out.println("Некорректный формат ввода, повторите ввод:");
                scanner.next();
            }
        }
        System.out.println("Ок, итого вас " + currentNumberOfGuests + ".");
        return currentNumberOfGuests;
    }


}


