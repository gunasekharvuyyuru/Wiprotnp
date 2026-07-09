class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Sour", "Medium");
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();

        a.eat();
        o.eat();
    }
}