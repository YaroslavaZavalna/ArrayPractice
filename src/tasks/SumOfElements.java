package tasks;

public class SumOfElements {
    int sum = 0;

    Integer [] arr;
    Integer [] arr2;

    public SumOfElements(){
        arr = new Integer[]{0, 9, 0, 8, 2, -1, 1, -4};
        System.out.print("=====SumOfElements Task#3=====\nFirst array: ");
        printArr(arr);
        System.out.println("Sum might be: 20");
        System.out.print("Sum is: "+sum(arr));

        sum = 0;
        arr2 = new Integer[]{0, -9, -8, -2, -1, -4};
        System.out.println("\n");
        System.out.print("Second array: ");
        printArr(arr2);
        System.out.println("Sum might be: 0");
        System.out.println("Sum is: "+sum(arr2));
    }

    private void printArr(Integer[] array){
        for (Integer i:array) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    private Integer sum(Integer[] array){
        Integer summa = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                summa+=arr[i];
            }
        }

        return summa;
    }

}
