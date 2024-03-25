public class SimpleArray {
    public static void main(String[] args) {

               String[] dogs = new String[5];
                dogs[0] = "German Shephard";
                dogs[1] = "Daschund";
                dogs[2] = "Pomenranian";
                dogs[3] = "rottweiller";
                dogs[4] = "Great Dane";

                String dog = dogs[0];
                System.out.println(dog);

                int numberOfElements = dogs.length;
                System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
        }
    }

