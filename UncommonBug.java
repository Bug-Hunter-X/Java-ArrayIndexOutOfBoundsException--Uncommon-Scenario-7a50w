public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //Potential error: Accessing array element beyond bounds
        System.out.println(arr[5]); 
    }
}