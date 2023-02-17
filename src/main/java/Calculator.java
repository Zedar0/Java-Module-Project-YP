public class Calculator {

    public static double calculateTotalSum(double price, double totalSum) { // метод подсчёта суммы всех товаров
        totalSum = totalSum + price;
        return totalSum;
    }

    public static double splitCheck(double numberOfGuests, double totalSum) { // метод разделения суммы на количество гостей
        double priceOfGuest = totalSum / numberOfGuests;
        String result2 = String.format("%.2f", priceOfGuest);
        System.out.println("Каждый из гостей должен заплатить: " + result2 + " " + Cases.checkCorrectCase(priceOfGuest));
        return priceOfGuest;
    }

}

