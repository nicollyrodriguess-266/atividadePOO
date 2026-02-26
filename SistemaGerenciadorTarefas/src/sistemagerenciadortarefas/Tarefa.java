/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadortarefas;

/**
 *
 * @author Admin
 */
public class Tarefa {
    String nomeTarefa;
    String descricaoTarefa;
    String prazoEntrega;
    boolean concluida;
    
    public void informacoesTarefa(){
    System.out.println("Tarefa: " + nomeTarefa + "\n" + "Descrição: " + descricaoTarefa);
    
    System.out.println("Prazo de entrega: " + prazoEntrega);
        if(concluida){
            System.out.println("Status: Concluída");
        }else{
            System.out.println("Status: Pendente");
        }
    }
    
    public void concluirTarefa(){
    concluida = true;
    }
}
