package LeetCode;

public class ReverseString {

    public static void main(String[] args) {
       String reverseString = "hello";
//       StringBuilder sb = new StringBuilder();
//        sb.append(reverseString);
//        System.out.println(sb.reverse());

        // second way

        char [] arr = reverseString.toCharArray();
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
