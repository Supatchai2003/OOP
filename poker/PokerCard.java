package poker;

public class PokerCard implements Card {
    private String suit; // สำรับ
    private String value; // ค่าไพ่

    public PokerCard(String suit, String value) {
        this.suit = suit; 
        this.value = value;
    }

    @Override
    public void displayCard() {
        System.out.println(value + " of " + suit);
    }
}
