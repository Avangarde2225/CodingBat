package String1;

public class comboString {
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"
public String nTwice(String str, int n) {
    return str.substring(0,n) + str.substring( str.length()-n);
}

    public static void main(String[] args) {
        comboString newCo = new comboString();
        System.out.println(newCo.nTwice("Java",1));
    }

}
