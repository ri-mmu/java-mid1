package enumeration.ex2_1;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
