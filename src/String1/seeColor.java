package String1;

public class seeColor {

    /**
     * Given a string, if the string begins with "red" or "blue"
     * return that color string, otherwise return the empty string.
     * <p>
     * <p>
     * seeColor("redxx") → "red"
     * seeColor("xxred") → ""
     * seeColor("blueTimes") → "blue"
     *
     * @param
     * @return
     */
    public static void main(String[] args) {
        seeColor sc = new seeColor();
        System.out.println(sc.seeColor("re"));
    }

    public String seeColor(String str) {
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else {
            return "";
        }
    }
}
