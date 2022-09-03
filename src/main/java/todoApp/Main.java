/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        task.setName("Task teste");
        task.setDescription("description");
        taskController.save(task);
        
    }
    
}
