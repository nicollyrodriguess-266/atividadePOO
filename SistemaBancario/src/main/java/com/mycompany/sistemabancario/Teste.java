/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args) {

        SistemaBancario Banco1 = new SistemaBancario();
        SistemaBancario Banco2 = new SistemaBancario();

        Banco1.nomeCliente = "Selena Gomes";
        Banco1.numeroConta = 4002892;
        Banco1.tipoConta = "Corrente";
        Banco1.saldoConta = 1000;

        Banco2.nomeCliente = "Roger Guedes";
        Banco2.numeroConta = 8922402;
        Banco2.tipoConta = "Poupança";
        Banco2.saldoConta = 800;


        System.out.println("Informações");

        Banco1.mostrarConta();
        Banco2.mostrarConta();
        Banco1.depositar(500);
        Banco1.sacar(100);
        Banco1.transferir(Banco2, 200);
    }
}
