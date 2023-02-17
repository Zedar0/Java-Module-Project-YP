import static java.lang.Math.floor;

public class Cases {
    public static String checkCorrectCase(Double price) {
        int lastTwoNumbers = (int) (floor(price) % 100);
        if (lastTwoNumbers == 0 || (lastTwoNumbers >= 5 && lastTwoNumbers <= 19)) {
            return "рублей";
        } else {
            int lastNumber = lastTwoNumbers % 10;
            switch (lastNumber) {
                case 1:
                    return "рубль";
                case 2:
                case 3:
                case 4:
                    return "рубля";

                default:
                    return "рублей";

            }
        }
    }
}

