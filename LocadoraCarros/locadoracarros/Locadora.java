/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoracarros;

/**
 *
 * @author Admin
 */
public class Locadora {
    
    String modelo ;
    String veiculo;
    double valorDiaria;
    int dias;

    public double calcularTotal() {
        return dias * valorDiaria;
    }

    public void mostrarResumo() {
        System.out.println("Modelo do veículo: " + modelo);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Dias alugados: " + dias);
        System.out.println("Valor total: R$ " + calcularTotal());
     }
}
