public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Conversor de fahrenheitº para Celcius");

        System.out.print("Digite quantos graus Fº: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        double f = (num1 - 32) * 5.0 / 9.0;
        
        System.out.println("parece que a temperatura é de "+ f +" Cº");

    }
}
