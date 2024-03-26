public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna,betty,carl,david,eva,frankie};

        int result = 0;
        double average;
        int userNumber = users.length;
        for (User user : users) {
            result = result + user.age;
        }
    average = result / users.length;

        for (User user : users) {
            if (user.age < average) {
                System.out.println(user.name);
            }else {
                System.out.println("Nobody)");
            }
        }
    }
}
