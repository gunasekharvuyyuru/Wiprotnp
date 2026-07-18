public class ThreadNames {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.setName("Scooby");
        t2.setName("Shaggy");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}