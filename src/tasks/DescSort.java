package tasks;

public class DescSort {

    public DescSort(){
        Integer [] array = new Integer[]{2,3,1,7,11};
        System.out.print("=====DescSort Task#1=====\nArray: ");
        showArr(array);
        sortDesc(array);
        System.out.println("Sorted array: ");
        showArr(array);
    }

    private void sortDesc(Integer[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private void showArr(Integer[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }
}
