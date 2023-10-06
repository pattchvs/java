package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculadora");

        System.out.print("Digite o primeiro número: ");
        double num1 = s.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = s.next();

        System.out.print("Digite o segundo número: ");
        double num2 = s.nextDouble();

        double resultado = 0;
        switch(operador){
            case "+":
                resultado = new Soma().somar(num1,num2);
                break;
            case "-":
                resultado = new Subtracao().subtrair(num1,num2);
                break;
            case "*":
                resultado = new Multiplicacao().multiplicar(num1, num2);
                break;
            case "/":
                resultado = new Divisao().dividir(num1, num2);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.println("O resultado é: " + resultado);
    }
}
