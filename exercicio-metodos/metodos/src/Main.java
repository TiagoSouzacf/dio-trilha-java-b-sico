public class Main {

    public static void main(String[] args) {

        System.out.println("-----Exercicio Caculadora-----");
        Calculadora.somar(15., 3.);
        Calculadora.subtrair(15., 3.);
        Calculadora.multiplicar(15., 3.);
        Calculadora.dividir(15., 3.);

        System.out.println("\n-----Exercicio Mensagem-----");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(19);

        
        System.out.println("-----Exercicio Empréstimo-----");
        Emprestimo.solicitarEmprestimo(5000.);

    }

}
