/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahospedagem;

/**
 *
 * @author Admin
 */
public class Reserva {
    String nomeHospede;
    String telefoneHospede;
    String emailHospede;
    int diasHospedagem;
    double valorDiaria;
    
    public void informacoesHospede(){
     System.out.println
        ("Hospede: " + nomeHospede + "\n" + "Telefone: " + telefoneHospede + "\n" + "E-mail: " + emailHospede );
    }
    
    public void valorTotal(){
        double total = diasHospedagem * valorDiaria;
        System.out.println("O valor da total da estadia foi R$" + total);
}
}
