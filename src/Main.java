public class Main {
    public static void main(String[] args) {
        int celsius = 22;

        int fahrenheit = (int) (celsius * 1.8) + 32;

        System.out.println("A temperatura em celsius %d convertida para fahrenheit é %d".formatted(celsius, fahrenheit));
    }
}
