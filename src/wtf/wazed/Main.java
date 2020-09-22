package wtf.wazed;

import wtf.wazed.tasks.GenericTask;
import wtf.wazed.tasks.TaskManager;

/**
 * @author Wazed
 * Created on 21.09.2020
 */
public class Main {

    private TaskManager taskManager;

    public Main(){
        this.taskManager = new TaskManager();
        this.taskManager.getTasks().forEach(GenericTask::execute);
    }

    public static void main(String[] args) {
        new Main();
    }

}
