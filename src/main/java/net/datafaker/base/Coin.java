package net.datafaker.base;

/**
 * @since 0.8.0
 */
public class Coin extends AbstractProvider<BaseProviders> {

    protected Coin(BaseFaker faker) {
        super(faker);
    }

    /**
     * @return coin side e.g. "Heads", "Tails".
     */
    public String flip() {
        return resolve("coin.flip");
    }
}