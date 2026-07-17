import java.util.*;

class Card {

    private char symbol;
    private int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class CardSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        // TreeMap stores symbols in sorted order
        Map<Character, List<Card>> cardMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            // Create list if symbol is not already present
            if (!cardMap.containsKey(symbol)) {
                cardMap.put(symbol, new ArrayList<>());
            }

            // Add card to symbol list
            cardMap.get(symbol).add(card);
        }

        // Display distinct symbols
        System.out.print("Distinct Symbols are : ");

        for (char symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }

        System.out.println();

        // Display cards and details for each symbol
        for (Map.Entry<Character, List<Card>> entry : cardMap.entrySet()) {

            char symbol = entry.getKey();
            List<Card> cards = entry.getValue();

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;

            for (Card card : cards) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}