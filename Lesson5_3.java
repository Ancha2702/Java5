import java.util.Arrays;

public class Lesson5_3 {
    static void heapify(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;


        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }


        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    public static void heapSort(int[] array) {
        if (array.length == 0) return;


        int length = array.length;

        for (int i = length / 2-1; i >= 0; i--)
            heapify(array, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
     public static void main(String[] Array){
         int[] array = new int[]{15, 22, 43, 4, 0};
         heapSort(array);
         System.out.println(Arrays.toString(array));

     }
}


