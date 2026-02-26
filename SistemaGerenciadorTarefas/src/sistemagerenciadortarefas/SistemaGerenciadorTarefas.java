/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagerenciadortarefas;

/**
 *
 * @author Admin
 */
public class SistemaGerenciadorTarefas {

        public static void main(String[] args) {
         Tarefa Projeto = new Tarefa();
         
         Projeto.nomeTarefa = "Criar tela inicial";
         Projeto.descricaoTarefa = "Desenvolver tela inicial";
         Projeto.prazoEntrega = "28/02/2026";
         Projeto.concluida = false;
         
         System.out.println("Informações");
         Projeto.informacoesTarefa();
         Projeto.concluirTarefa();
                
        }

    
}
