public class Customer {

    private String name;
    private float wallet;
    private Artwork artwork;

    public Customer(String name, float wallet, Artwork artwork) {
        this.name = name;
        this.wallet = wallet;
        this.artwork = artwork;
    }

    public float getWallet() {
        return wallet;
    }

    public void buyArtwork() {
        if (this.wallet > artwork.getPrice()) {
            // wallet goes down by price value
            // initiate accept payment in gallery
        }
    }
}
