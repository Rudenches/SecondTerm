import java.util.Objects;

public class Price {
    private Integer rub;
    private Integer kopek;

    public Price(Integer rub, Integer kopek) {
        if (rub == null && kopek == null) throw new NullPointerException();
        if (rub < 0 || kopek < 0 || kopek > 99) throw new IllegalArgumentException();
        this.rub = rub;
        this.kopek = kopek;
    }

    public Integer getRub() {
        return rub;
    }

    public Integer getKopek() {
        return kopek;
    }

    public boolean equals(Price price) {
        return (rub.equals(price.rub) && kopek.equals(price.kopek));
    }

}
