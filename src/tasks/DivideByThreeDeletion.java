package tasks;

import java.util.ArrayList;

public class DivideByThreeDeletion {

    public DivideByThreeDeletion(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);
        System.out.println("=====DivideBy3Delete Task#5=====\nArrayList: ");
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            while(list.get(i)%3==0){
                list.remove(list.get(i));
            }
        }
        System.out.println("Edited ArrayList: ");
        System.out.println(list);
    }
}
