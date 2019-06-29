package tasks;

public class AverageOfElements {

    public AverageOfElements(){
        Integer[] array = new Integer[]{0,9,7,-1,7,3,-1,0};
        System.out.print("=====AverageOfElements Task#4=====\nArray: ");
        printArr(array);
        System.out.println("\nAverage of list is: "+ avr(array));
    }

    private void printArr(Integer[] array){
        for (Integer i:array) {
            System.out.print(i+" ");
        }
    }

    private Integer avr(Integer[] array) {
        Integer sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }
}
