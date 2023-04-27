import java.util.Scanner;

public class Emprestimo {

    public static Double solicitarEmprestimo(Double valor) {
        Scanner scan = new Scanner(System.in);
        Double taxaEmprestimo = 0.;
        Double valorFinal = 0.;
        int parcela = 0;
        Double valorParcela = 0.;

        System.out.println("Solicite um valor para empréstimo: ");        
        valor = scan.nextDouble();
        System.out.println("Solicite a quantidade de parcelas: ");        
        parcela = scan.nextInt();

        if(valor >= 5000 && parcela < 4){
            taxaEmprestimo = 0.05;
            int emprestimo = 5;            
            valorFinal = valor + (valor * taxaEmprestimo);
            valorParcela = valorFinal / parcela;
            System.out.println("Valor solicitado: " + valor + "\nTaxa Emprestimo: "+ emprestimo + "%"+ "\nNúmero de parcelas: " + parcela + "\nValor final: " + valorFinal + "\nValor da parcela: " + valorParcela);    

        }else if(valor >= 5000 && parcela > 3 && parcela < 13){
            taxaEmprestimo = 0.1;
            int emprestimo = 10;            
            valorFinal = valor + (valor * taxaEmprestimo);
            valorParcela = valorFinal / parcela;
            System.out.println("Valor solicitado: " + valor + "\nTaxa Emprestimo: "+ emprestimo + "%"+ "\nNúmero de parcelas: " + parcela + "\nValor final: " + valorFinal + "\nValor da parcela: " + valorParcela);    

        }else if(valor < 5000 && parcela < 4){
            taxaEmprestimo = 0.15;
            int emprestimo = 15;            
            valorFinal = valor + (valor * taxaEmprestimo);
            valorParcela = valorFinal / parcela;
            System.out.println("Valor solicitado: " + valor + "\nTaxa Emprestimo: "+ emprestimo + "%"+ "\nNúmero de parcelas: " + parcela + "\nValor final: " + valorFinal + "\nValor da parcela: " + valorParcela);    

        }
        else if(valor < 5000 && parcela > 3 && parcela < 13){
            taxaEmprestimo = 0.2;
            int emprestimo = 20;            
            valorFinal = valor + (valor * taxaEmprestimo);
            valorParcela = valorFinal / parcela;
            System.out.println("Valor solicitado: " + valor + "\nTaxa Emprestimo: "+ emprestimo + "%"+ "\nNúmero de parcelas: " + parcela + "\nValor final: " + valorFinal + "\nValor da parcela: " + valorParcela);    

        }else{
            System.out.println("Você não está disponível para receber o empréstimo! ");
        }


        return valor;
    }

}
