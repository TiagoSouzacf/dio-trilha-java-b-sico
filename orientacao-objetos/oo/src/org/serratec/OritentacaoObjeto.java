package org.serratec;

import java.util.Scanner;

import org.serratec.model.Carro;

public class OritentacaoObjeto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();
        Carro carro1 = new Carro("Azul", "PickUp", 50);   

        carro.setCor("Vermelho");
        carro.setModelo("SUV");
        carro.setCapacidadeTanque(50);

        System.out.println("O valor para encher o tanque do carro é: " + carro.totalValorTanque(5.28));
        System.out.println("O valor para encher o tanque do carro é: " + carro1.totalValorTanque(5.78));

    }
}
