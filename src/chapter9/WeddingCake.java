package chapter9;

public class WeddingCake extends Cake {

    protected int tiers;

    public WeddingCake() {
        super("Mint");
        setPrice(100.00);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
