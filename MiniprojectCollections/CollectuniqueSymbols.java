import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Card implements Comparable<Card> {

    private char symbol;
    private int number;

    public Card() {
    }

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Compare cards based on symbol to maintain unique symbols
    @Override
    public int compareTo(Card other) {
        return Character.compare(this.symbol, other.symbol);
    }
}

public class CollectuniqueSymbols {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Card> cardSet = new TreeSet<>();

        int totalCardsEntered = 0;

        // Collect cards until 4 unique symbols are found
        while (cardSet.size() < 4) {

            System.out.println("Enter a card : ");

            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();

            totalCardsEntered++;

            Card newCard = new Card(symbol, number);

            cardSet.add(newCard);
        }

        System.out.println("Four symbols gathered in " 
                + totalCardsEntered + " cards.");

        System.out.println("Cards in Set are :");

        for (Card card : cardSet) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        scanner.close();
    }
}