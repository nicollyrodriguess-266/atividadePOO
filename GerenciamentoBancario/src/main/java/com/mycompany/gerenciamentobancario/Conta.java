
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ander
 */
public class Conta {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Banco conta1 = new Banco();
        Banco conta2 = new Banco();

        conta1.nomeCliente = "Selena Gomes";
        conta1.numeroConta = 4002892;
        conta1.tipoConta = "Corrente";
        conta1.saldoConta = 1000;

        conta2.nomeCliente = "Roger Guedes";
        conta2.numeroConta = 8922402;
        conta2.tipoConta = "Poupança";
        conta2.saldoConta = 800;


        System.out.println("Informações");

        conta1.mostrarConta();
        conta2.mostrarConta();
        conta1.depositar(500);
        conta1.sacar(100);
        conta1.transferir(conta2, 200);

       

}
}
