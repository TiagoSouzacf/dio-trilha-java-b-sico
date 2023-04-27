public class Calculadora {

    public static void somar(Double num1, Double num2) {
        
        Double resultado = num1 + num2;
        System.out.println("O Resultado da soma é: " + resultado);

    }

    public static void subtrair(Double num1, Double num2) {
        Double resultado = num1 - num2;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public static void multiplicar(Double num1, Double num2) {
        Double resultado = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public static void dividir(Double num1, Double num2) {
        Double resultado = num1 / num2;
        System.out.println("O resultado da divisão é: " + resultado);
    }

}
