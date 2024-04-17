import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("seja bem vindo a calculadora");
    System.out.print("Número 1: ");
    int num1 = scanner.nextInt();
    System.out.print("Número 2: ");
    int num2 = scanner.nextInt();
    System.out.print("Operação ( + - * /): ");
    char operacao = scanner.next().charAt(0);
    if (operacao == '+') {
        System.out.print("O resultado é: " + soma(num1, num2));
    } else if (operacao == '-') {
        System.out.print("O resultado é: " + subtracao(num1, num2));
    } else if (operacao == '*') {
        System.out.print("O resultado é: " + multiplicacao(num1, num2));
    } else if (operacao == '/') {
       if (num2 != 0) {
           System.out.println("O resultado é: " + divisao(num1, num2));
    } else {
           System.out.println("Erro: divisão por zero!");
           return;
    }
    }
  }
  public static int soma(int a, int b) {
    return a + b;
  }
  public static int subtracao(int a, int b) {
    return a - b;
  }
  public static int multiplicacao(int a, int b) {
    return a * b;
  }
  public static int divisao(int a, int b) {
    return a / b;
  }
}

  
Use emojis para se expressar
💖 👍 😂 🎉
Responda mais rápido aos seus e-mails e adicione um toque extra de diversão e personalidade
