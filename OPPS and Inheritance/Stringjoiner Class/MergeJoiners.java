import java.util.*;

public class MergeJoiners {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("NewYork").add("London");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Tokyo").add("Paris");

        StringJoiner copyS1 = new StringJoiner("-");
        copyS1.merge(s1);

        StringJoiner copyS2 = new StringJoiner("-");
        copyS2.merge(s2);

        System.out.println(copyS2.merge(s1));
        System.out.println(copyS1.merge(s2));
    }
}