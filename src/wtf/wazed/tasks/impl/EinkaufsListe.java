package wtf.wazed.tasks.impl;

import javafx.concurrent.Task;
import wtf.wazed.lib.List;
import wtf.wazed.tasks.GenericTask;

/**
 * @author Wazed
 * Created on 16.12.2020
 */
public class EinkaufsListe extends GenericTask {

    private final List<String> list = new List<>();

    public void durchStreichen(){
        list.remove();
        list.next();
    }

    public void hinzufuegen(String item){
        list.append(item);
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        while(!list.hasAccess()){
            str.append(list.getContent()).append("\n");
        }
        return str.toString();
    }

    @Override
    public void execute() {
        hinzufuegen("Yes");
        hinzufuegen("DUDUDUD");
        System.out.println(toString());
    }
}
