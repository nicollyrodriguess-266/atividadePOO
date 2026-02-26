/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;

/**
 *
 * @author Admin
 */
    public class SistemaBancario {
        
    String nomeCliente;
    int numeroConta;
    String tipoConta;
    double saldoConta;

    
    public void mostrarConta() {
    System.out.println("Cliente: " + nomeCliente);
    System.out.println("Número da Conta: " + numeroConta);
    System.out.println("Tipo da Conta: " + tipoConta);
    System.out.println("Saldo: " + saldoConta);
    }    
    
    public void depositar(double valor) {
        saldoConta += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (saldoConta >= valor) {
            saldoConta -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(SistemaBancario destino, double valor) {
        if (saldoConta >= valor) {
            saldoConta -= valor;
            destino.saldoConta += valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
  
    
}
    }
