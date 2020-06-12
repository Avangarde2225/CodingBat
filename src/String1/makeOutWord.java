package String1;

public class makeOutWord {

//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"

    public String makeOutWord() {
       String out = "<<>>";
        String word="Yay";

        String firstHalf=out.substring(0,out.length()/2);
        String secondHalf=out.substring(out.length()/2);

        return firstHalf + word + secondHalf;
    }

    public static void main(String[] args) {
        makeOutWord newMake = new makeOutWord();
        System.out.println(newMake.makeOutWord());
    }
}
