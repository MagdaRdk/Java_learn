import java.util.Scanner;

public class Colours {

        enum MyColours {
            R, /*red*/
            B, /*blue*/
            P, /*pink*/
            W /*white*/
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first letter of colour:");
            String colour = scanner.nextLine().trim();
            MyColours colours = MyColours.valueOf(colour.toUpperCase());

            switch(colours) {
                case R:
                    System.out.println("Red");
                    break;
                case B:
                    System.out.println("Blue");
                    break;
                case P:
                    System.out.println("Pink");
                    break;
                case W:
                    System.out.println("White");
                    break;
                default:
            }
        }
    }

