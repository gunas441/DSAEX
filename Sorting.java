public class Sorting {
    public static void main(String[] args) {
        int[] arr={3,5,7,8,2,1};
        int n = arr.length;
        System.out.println("Before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        selectionSort(arr,n);
//        bubbleSort(arr,n);
        insertionSort(arr,n);
    }

    // Seletion Sort
    public static void selectionSort(int[] arr,int n){
        for (int i = 0; i < n-1; i++) {
            int mini = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Bubble Sort
    public static void bubbleSort(int[] arr,int n){
        for (int i = n-1; i >= 0; i--) {
            int didswap = 0;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
        }
        System.out.println("After the sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // Insertion Sort
    public static void insertionSort(int[] arr,int n){
        for (int i = 0; i <= n-1; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
