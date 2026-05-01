public class Main {
    public static void main(String[] args) {

        System.out.println("Counting Numbers");
        System.out.println("----------------");

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);

            total = total + i;
        }

        System.out.println("----------------");
        System.out.println("Total Sum = " + total);

        if (total > 10) {
            System.out.println("The sum is greater than 10");
        } else {
            System.out.println("The sum is 10 or less");
        }
    }
}
