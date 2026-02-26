/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author Admin
 */
public class TesteRetangulo {
    public static void main(String[] args) {

        Retangulo r = new Retangulo();

        r.largura = 4;
        r.altura = 6;

        System.out.println("Largura: " + r.largura);
        System.out.println("Altura: " + r.altura);
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }

}
