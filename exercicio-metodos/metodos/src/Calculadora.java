public class Calculadora {

    public static void somar(Double num1, Double num2) {
        
        Double resultado = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é: "  + resultado);

    }

    public static void subtrair(Double num1, Double num2) {
        Double resultado = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " + num2 + " é: "  + resultado);
    }

    public static void multiplicar(Double num1, Double num2) {
        Double resultado = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é: "  + resultado);
    }

    public static void dividir(Double num1, Double num2) {
        Double resultado = num1 / num2;
        System.out.println("A divisão de " + num1 + " / " + num2 + " é: "  + resultado);
    }

}
