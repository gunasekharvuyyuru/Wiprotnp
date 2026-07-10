import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestAutomobile {

    public static void main(String[] args) {

        Hero hero = new Hero("Splendor","AP39AB1234","Ravi",60);

        System.out.println(hero.getModelName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getOwnerName());
        System.out.println(hero.getSpeed());
        hero.radio();

        Honda honda = new Honda("Shine","AP39CD5678","Kiran",70);

        System.out.println(honda.getModelName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getOwnerName());
        System.out.println(honda.getSpeed());
        honda.cdplayer();

        Logan logan = new Logan("Logan","TS09EF9012","Rahul",100);

        System.out.println(logan.getModelName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getOwnerName());
        System.out.println(logan.getSpeed());
        logan.gps();

        Ford ford = new Ford("EcoSport","TN07GH3456","Suresh",120);

        System.out.println(ford.getModelName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getOwnerName());
        System.out.println(ford.getSpeed());
        ford.tempControl();
    }
}