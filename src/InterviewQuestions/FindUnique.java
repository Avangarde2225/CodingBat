package InterviewQuestions;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(unique("AAAAAAAAAAAASSSSSSSSSSSDDDDDDDDDDDDDDDtgh"));
    }
    public static String unique(String str){
        String uniq = "";

        for (int i = 0; i <str.length() ; i++) {
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                if((""+str.charAt(i)).equals(""+str.charAt(j))){
                    count++;
                }
            }
            if(count == 1){
                uniq +=str.charAt(i);
            }
        }
        return uniq;
    }
}
