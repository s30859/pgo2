import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Example usage:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your city (e.g., Warsaw, Krakow): ");
        String city = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Is it a weekday? (true/false): ");
        boolean isWeekday = scanner.nextBoolean();

        double ticketPrice = calculateTicketPrice(age, city, isWeekday);
        double discount = getDiscount(age, city, isWeekday);

        System.out.println("Data: " + city + ", " + age + " years old, weekday Ticket price: " + ticketPrice + " PLN");
        System.out.println("Discount: " + (discount * 100) + "%");
    }

    public static double calculateTicketPrice(int age, String city, boolean isWeekday) {
        double ticketPrice = 40.0;

        if (age < 10) {
            ticketPrice = 0.0;
        } else if (age >= 10 && age <= 18) {
            ticketPrice *= 0.5;
        }

        if (city.equalsIgnoreCase("Warsaw")) {
            ticketPrice *= 0.9;
        }

        if (isWeekday && city.equalsIgnoreCase("Warsaw")) {
            return 0.0; // Free ticket on a weekday in Warsaw
        } else if (isWeekday) {
            return 0.0; // No ticket price on weekdays for other cities
        }

        return ticketPrice;
    }

    public static double getDiscount(int age,String city  , boolean isWeekday) {
        double ticketPrice = calculateTicketPrice(age, city, isWeekday);
        return 1.0 - (ticketPrice / 40.0); // Calculate discount percentage
    }
}
