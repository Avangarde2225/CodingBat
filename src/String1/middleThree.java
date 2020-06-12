package String1;

public class middleThree {
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"
public String middleThree(String str) {
   return str.substring(str.length()/2-1,str.length()/2+2);
}

    public static void main(String[] args) {
        middleThree newMid = new middleThree();
        System.out.println(newMid.middleThree("Hello"));
    }
}
