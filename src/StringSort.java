public class StringSort {
    public static void sortSelection(String[] arr){
        int pos;
        String temp;

        for(int i = 0; i < arr.length; i++){
            pos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[pos]) < 0){
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void sortBubble(String[] arr){
        String temp;
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;

            for(int i = 0; i < arr.length-1; i++){
                if(arr[i].compareTo(arr[i+1]) > 0){
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }



    }
    public static void sortInsertion(String[] arr){
        for(int i = 1; i < arr.length; i++){
            String currElement = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey].compareTo(currElement) > 0){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElement;
                prevKey--;
            }
        }
    }
    public static void display(String[] arr){
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args){

        String[] arr = new String[]{"Woganov", "Bubnov", "Lomonosov", "Schwarz", "Andreev", "Allahov"};
        String[] arr1 = new String[]{"Woganov", "Bubnov", "Lomonosov", "Schwarz", "Andreev", "Allahov"};
        String[] arr2 = new String[]{"Woganov", "Bubnov", "Lomonosov", "Schwarz", "Andreev", "Allahov"};

        System.out.println();
        System.out.println();
        System.out.println("Selection sort: ");
        System.out.println();
        display(arr);
        sortSelection(arr);
        display(arr);
        System.out.println();

        System.out.println("Bubble sort: ");
        System.out.println();
        display(arr1);
        sortBubble(arr1);
        display(arr1);
        System.out.println();

        System.out.println("Insertion sort: ");
        System.out.println();
        display(arr2);
        sortInsertion(arr2);
        display(arr2);
        System.out.println();
    }
}
