/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrocliente;

/**
 *
 * @author Admin
 */
public class CadastroCliente {

    
    String nomeCliente;
    String emailCliente;
    String telefoneCliente;
    int quantidade;
    double valorFinal;
    
    public void informacoesCliente(){
    System.out.println
        ("Cliente: " + nomeCliente + "\n" + "E-mail: " + emailCliente + "\n" + "Telefone: " + telefoneCliente);
    }
    
    public void somaDaCompra(){
        System.out.println
        ("O valor final da sua compra foi: " + valorFinal);
    }
    
    public void informacaoDaCompra(){
        System.out.println
        ("O " + nomeCliente + "realizou a compra de " + quantidade + " produtos. O valor final foi " + valorFinal);
}
}
