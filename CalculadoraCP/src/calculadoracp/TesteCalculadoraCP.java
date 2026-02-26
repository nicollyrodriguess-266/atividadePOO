package calculadoracp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TesteCalculadoraCP {
    public static void main(String[] args) {
        CalculadoraCP calc = new CalculadoraCP();
        
        System.out.println(calc.soma(80, 45));
        System.out.println(calc.subtracao(4, 8));
        System.out.println(calc.multiplicacao(10, 55));
        System.out.println(calc.divisao(350, 80));        
    }
}
