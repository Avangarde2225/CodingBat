package InterviewQuestions;

public class intArrays {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {2,4,5,6};

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println("-------------------------");
//sum if odd subtract if even
        int[] arr2 = {2,6,8,7,5,2};
        int result =0;
        for (int i = 0; i < arr2.length ; i++) {
            if(arr2[i]%2==1){
                result += arr2[i];
            } else{
                result -= arr2[i];
            }

        }
        System.out.println(result);

        System.out.println("-------------------------------");
        //int value of sume up

        String s = "44335566";
        int total =0;
        char[] c= s.toCharArray();

        for (int j = 0; j <c.length ; j++) {
            total += Integer.parseInt(String.valueOf(c[j]));
        }
        System.out.println(total);
    }
}
