public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int yearToCheck = 2023; // Możesz zmienić rok do sprawdzenia
        boolean isLeap = isLeapYear(yearToCheck);
        if (isLeap) {
            System.out.println(yearToCheck + " jest rokiem przestępnym.");
        } else {
            System.out.println(yearToCheck + " nie jest rokiem przestępnym.");
        }
    }
}

