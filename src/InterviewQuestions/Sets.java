package InterviewQuestions;

import java.util.HashSet;

public class Sets {
    /*
    Hashset does not allow duplicates
    does not follow insertion order except Linkedhashset
    does allow null values except treeset
     */
    public static void main(String[] args) {
        HashSet<Double> set = creatingSet();
        System.out.println(sum(set));

    }
    public static HashSet<Double> creatingSet(){
        HashSet<Double> set = new HashSet<>();
        set.add(3.23);
        set.add(3.10);
        set.add(4.23);
        set.add(5.23);
        set.add(13.23);

        return set;

    }
    public static double sum(HashSet<Double> set){
        double sum = 0;

        for (Double aDouble : set) {
            sum+=aDouble;
        }
        return sum;
    }
}
