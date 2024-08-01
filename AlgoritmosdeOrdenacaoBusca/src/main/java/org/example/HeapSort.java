package org.example;

public class HeapSort {
    private int[] array;

    public HeapSort(int size){
        array = new int[size];
        for(int i = 0; i < array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
    }

    public static void heapSort(int[] arr){
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    public static void heapify(int[] arr, int n, int i){
        int root = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left] > arr[root]){
            root = left;
        }

        if(right < n && arr[right] > arr[root]){
            root = right;
        }

        if(root!=i){
            int temp = arr[i];
            arr[i] = arr[root];
            arr[root] = temp;

            heapify(arr, n, root);
        }
    }

    //Rule = Root = i;
    //Leaf Nodes = 2*i + 1 and 2*i +2
    public static void main(String[] args) {

    }
}
