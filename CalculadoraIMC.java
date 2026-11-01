import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		double peso, altura, valorImc;

		// Pedindo os valores
		System.out.println("=== Calculadora IMC ===");

		System.out.print("Digite o seu peso (kg): ");
		peso = scanner.nextDouble(); // Atribuindo o valor

		System.out.print("Informe a sua altura (ex: 1.75): ");
		altura = scanner.nextDouble(); // Atribuindo o valor

		// Cálculo IMC
		valorImc = peso / (altura * altura);

		// Mostrando o resultado
		System.out.printf("\nSeu IMC: %.2f\n", valorImc);
		System.out.print("Classificação: ");

		// Estrutura condicional para classificação
		if (valorImc < 18.5) {
			System.out.println("Magreza / Abaixo do peso");
		} else if (valorImc >= 18.5 && valorImc <= 24.9) {
			System.out.println("Peso Normal (Eutrófico)");
		} else if (valorImc >= 25.0 && valorImc <= 29.9) {
			System.out.println("Sobrepeso (Pré-obesidade)");
		} else if (valorImc >= 30.0 && valorImc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (valorImc >= 35.0 && valorImc <= 39.9) {
			System.out.println("Obesidade Grau II");
		} else {
			System.out.println("Obesidade Grau III (Grave)");
		}

		scanner.close();
	}
}