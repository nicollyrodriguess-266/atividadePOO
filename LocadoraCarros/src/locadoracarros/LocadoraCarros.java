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
        Veiculos carro = new Veiculos();
        carro.modelo = "Toyota Corolla";
        carro.valorDiaria = 150.0;

        Locacao locacao = new Locacao();
        locacao.veiculo = carro;
        locacao.dias = 5;

        locacao.mostrarResumo();
    }  
}
