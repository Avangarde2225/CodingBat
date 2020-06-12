package String1;

public class atFirst {
//    atFirst("hello") → "he"
//    atFirst("hi") → "hi"
//    atFirst("h") → "h@"
public String atFirst(String str) {
    if (str.length()>=2) {
        return str.substring(0, 2);
    } else if(str.length()==1){
        return str+"@";
    }else {
        return "@@";
    }
}
    public static void main(String[] args) {
        atFirst at = new atFirst();
        System.out.println(at.atFirst("h"));
    }
}
