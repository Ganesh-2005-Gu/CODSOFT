import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.85);
        rates.put("INR", 88.6);
        rates.put("GBP", 0.82);
        rates.put("JPY", 142.0);

        
        System.out.print("Enter base currency (USD/EUR/INR/GBP/JPY): ");
        String base = sc.next().toUpperCase();

       
        System.out.print("Enter target currency (USD/EUR/INR/GBP/JPY): ");
        String target = sc.next().toUpperCase();

        
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        
        if (rates.containsKey(base) && rates.containsKey(target)) {
            double convertedAmount = amount / rates.get(base) * rates.get(target);

            System.out.printf("%.2f %s = %.2f %s\n", amount, base, convertedAmount, target);
        } else {
            System.out.println("Invalid currency input!");
        }

        sc.close();
    }
}

