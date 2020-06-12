package String1;

public class twoChar {
//    twoChar("java", 0) → "ja"
//    twoChar("java", 2) → "va"
//    twoChar("java", 3) → "ja"
public String twoChar(String str, int index) {
    if(index + 2 > str.length() || index < 0)
        return str.substring(0, 2);

    return str.substring(index, index + 2);
}

    public static void main(String[] args) {
        twoChar newChar = new twoChar();
        System.out.println(newChar.twoChar("Java", 2));
    }

}
