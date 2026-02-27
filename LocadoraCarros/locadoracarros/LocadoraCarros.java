/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadoracarros;

/**
 *
 * @author Admin
 */
public class LocadoraCarros {
    public static void main(String[] args) {
        
        Locadora veiculo = new Locadora();
        
        veiculo.modelo = "Toyota Corolla";
        veiculo.veiculo = "";
        veiculo.valorDiaria = 150.0;
        veiculo.dias = 5;
      

        System.out.println("Informações da Locação");
        veiculo.mostrarResumo();
    }
}
