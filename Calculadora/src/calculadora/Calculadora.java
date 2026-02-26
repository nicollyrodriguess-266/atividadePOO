package calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Calculadora {
    private int x = 10;
    private int y = 20;
    
    public void soma() {
    System.out.println("A soma de x + y é " + (x+y));
    }
    public void subtracao(){
    System.out.println("A subtração de x - y é " + (x-y));
    }
    public void multiplicacao(){
    System.out.println("A multiplicação de x * y é " + (x*y));
    }
    public void divisao(){
    System.out.println("A divisão de x / y é " + (x/y));
    }
}
