/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class testeFlores {
    public static void main(String[] args) {
        Flores F1 = new Flores();
        
        String compraFinalizada = "sim";
        
        System.out.println(F1.estoque(1898, 7));
        System.out.println(F1.valorUnitario(4.50));
        System.out.println(F1.quantidadeComprada(7));
        System.out.println(F1.compraFinalizada("sim"));
    }
}
