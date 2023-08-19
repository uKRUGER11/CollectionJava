package ListInterface.Basic;

public class application {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Limpar a casa");
        taskList.addTask("Tirar o lixo para fora");
        taskList.addTask("Lavar as roupas sujas");
        taskList.findAllDescriptions();
        taskList.removeTasks("Limpar a casa");
        taskList.findAllDescriptions();
        taskList.removeTasks("Limpar a casa");
        taskList.findAllDescriptions();

        System.out.println("Número total de tarefas: " + taskList.findAllTasks());
    }
}
