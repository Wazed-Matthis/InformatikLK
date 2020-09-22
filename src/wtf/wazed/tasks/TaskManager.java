package wtf.wazed.tasks;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Wazed
 * Created on 22.09.2020
 */
public class TaskManager {

    private final List<GenericTask> tasks = new ArrayList<>();

    public TaskManager(){
        Reflections reflections = new Reflections("wtf.wazed.tasks.impl");
        Set<Class<? extends GenericTask>> classSet = reflections.getSubTypesOf(GenericTask.class);
        classSet.forEach(this::addTask);
    }

    private void addTask(Class<? extends GenericTask> task){
        try {
            this.tasks.add(task.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public List<GenericTask> getTasks() {
        return tasks;
    }
}
