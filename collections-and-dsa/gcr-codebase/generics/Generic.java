public class Generic{
    public static void main(String[] args) {
        String[] arr1 = {"htis", "none"};
        Integer[] arr2 = {1,2,3,4,5};
        Double[] arr3 = {2.5,8.0,9.6,3.0};
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }
    public static <T> void printArray(T[] arr){
        for(T ele:arr){
            System.out.println(ele);
        }
    }
}