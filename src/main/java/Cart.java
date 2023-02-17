import java.util.Scanner;

public class Cart {
    String nameOfDish = "";
    double price = 0;
    String totalCart = "";
    double totalSum = 0;

    void collectTotalCart() {
        Scanner scannerDish = new Scanner(System.in);
        System.out.println("Введите название блюда:");
        while (!"завершить".equalsIgnoreCase(nameOfDish = scannerDish.nextLine())) { // в цикле происходит бесконечный ввод товаров и цен, пока пользователь не введёт "завершить"
            Scanner scannerPrice = new Scanner(System.in);
            System.out.println("Введите цену блюда:");
            while (true) { // цикл запускает проверку введённых данных, пока не получит корректные
                if (scannerPrice.hasNextDouble()) {
                    price = scannerPrice.nextDouble();
                    ChecksIntValues.checkIntValueOfPrice(price); // вызывается метод проверки на корректность double числа
                    if (price > 0) {
                        break;
                    }
                } else {
                    System.out.println("Неккоректный формат цены, введите заного:");
                    scannerPrice.next();
                }
            }
            if (totalCart.equals("")) { // в этом цикле заполняются все названия товаров и все цены в одну переменную totalCart
                totalCart = nameOfDish + "   " + price + " " + Cases.checkCorrectCase(price);
            } else {
                totalCart = totalCart + "\n" + nameOfDish + "   " + price + " " + Cases.checkCorrectCase(price);
            }
            totalSum = Calculator.calculateTotalSum(price, totalSum); // вызывается метод подсчёта стоймости всех товаров
        }

    }

    void printTotalCartAndSum() { // этот метод выводит на экран все товары, цены и общую стоймость
        System.out.println("Отлично! Итого вы заказали:\n" + totalCart);
        System.out.print("Общая стоймость: ");
        String result = String.format("%.2f", totalSum);
        System.out.println(result + " " + Cases.checkCorrectCase(totalSum));
    }

}
