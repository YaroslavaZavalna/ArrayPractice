package tasks;

import java.util.ArrayList;

public class FindMistake {
    private ArrayList<String> list;

    public FindMistake(){
        list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        list.add("Four");
        System.out.println("=====FindMistake Task#2=====\nOriginal list:");
        System.out.print(list);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals("Tree")){
                list.set(i, "Three");
            }
        }
        System.out.println("\n");
        System.out.println("Changed list:");
        System.out.print(list);
    }
}
