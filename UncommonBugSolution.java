public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //Check for valid index before accessing the element
        int index = 5;
        if(index >=0 && index < arr.length){
            System.out.println(arr[index]);
        }else{
            System.out.println("Invalid Index");
        }
    }
}