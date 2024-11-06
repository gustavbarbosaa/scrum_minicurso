import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INforme o valor em C°: ");
        float celcius = scanner.nextFloat();

        if (celcius <= 0 || celcius >= 1000) {
            System.out.println("O valor precisa ser entre 1 e 999");
        } else {
            float kelvin = celcius + 273.15F;
            float fahrenheit = (celcius * 1.80F) + 32.00F;

            float[] resultado = new float[2];
            resultado[0] = kelvin;
            resultado[1] = fahrenheit;

            System.out.println("[" + resultado[0] + "," + resultado[1] + "]");
        }
        System.out.println("Encerrando programa!");
    }
}
