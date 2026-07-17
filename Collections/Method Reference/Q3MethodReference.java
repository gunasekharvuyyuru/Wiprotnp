public class Q3MethodReference {

    public static void main(String[] args) {

        PrimeInterface p = Prime::new;

        p.check(13);
        p.check(20);
    }
}