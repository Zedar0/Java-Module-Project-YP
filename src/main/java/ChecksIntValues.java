public class ChecksIntValues {


    public static boolean checkIntValueOfGuests(int intNumberOfGuests) { // метод проверки правильности введённого целого числа гостей

        if (intNumberOfGuests < 1) {
            System.out.println("Неправильное число, повторите ввод: ");
        } else if (intNumberOfGuests == 1) {
            System.out.println("Вы просите поделить счёт на одного?\nПовторите ввод:");
        } else {
            System.out.println("Ввод принят.");
            return true;

        }
        return false;
    }

    public static void checkIntValueOfPrice(double price) { // метод проверки правильности введённого числа класса double
        if (price <= 0) {
            System.out.println("Некорректная цена, введите заного:");
        } else {
            System.out.println("Ввод принят");
            System.out.println("Желаете ещё добавить блюдо?");

        }

    }
}