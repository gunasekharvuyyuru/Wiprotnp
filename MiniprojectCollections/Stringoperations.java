import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performOperations(String S1, String S2) {

        ArrayList<String> result = new ArrayList<>();

        // 1. Replace characters at alternate indexes (0,2,4...) of S1 with S2
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < S1.length(); i++) {

            if (i % 2 == 0) {
                sb1.append(S2);
            } else {
                sb1.append(S1.charAt(i));
            }
        }

        result.add(sb1.toString());


        // Count occurrences of S2 in S1
        int count = 0;
        int index = 0;

        while ((index = S1.indexOf(S2, index)) != -1) {

            count++;
            index += S2.length();
        }


        // 2. Replace last occurrence of S2 with reverse of S2
        if (count > 1) {

            int lastIndex = S1.lastIndexOf(S2);

            String reverseS2 = 
                    new StringBuilder(S2).reverse().toString();

            String output2 = 
                    S1.substring(0, lastIndex)
                    + reverseS2
                    + S1.substring(lastIndex + S2.length());

            result.add(output2);

        } else {

            result.add(S1 + S2);
        }



        // 3. Delete first occurrence of S2
        if (count > 1) {

            int firstIndex = S1.indexOf(S2);

            String output3 =
                    S1.substring(0, firstIndex)
                    + S1.substring(firstIndex + S2.length());

            result.add(output3);

        } else {

            result.add(S1);
        }



        // 4. Divide S2 into two halves and insert S1 in middle
        int length = S2.length();

        int split = (length % 2 == 0)
                ? length / 2
                : (length / 2) + 1;


        String firstHalf = S2.substring(0, split);
        String secondHalf = S2.substring(split);

        result.add(firstHalf + S1 + secondHalf);



        // 5. Replace characters of S1 that exist in S2 with *
        StringBuilder sb5 = new StringBuilder();

        for (int i = 0; i < S1.length(); i++) {

            char ch = S1.charAt(i);

            if (S2.indexOf(ch) != -1) {
                sb5.append('*');
            } else {
                sb5.append(ch);
            }
        }

        result.add(sb5.toString());


        return result;
    }


    public static void main(String[] args) {

        String S1 = "JAVAJAVA";
        String S2 = "VA";

        ArrayList<String> output = performOperations(S1, S2);

        System.out.println(output);
    }
}