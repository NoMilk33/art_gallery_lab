public class Customer {

    private String name;
    private float wallet;
    private Artwork artwork;
    private Gallery gallery;

    public Customer(String name, float wallet, Artwork artwork, Gallery gallery) {
        this.name = name;
        this.wallet = wallet;
        this.artwork = artwork;
        this.gallery = gallery;
    }

    public float getWallet() {
        return wallet;
    }

    public void buyArtwork() {
        if (this.wallet >= artwork.getPrice()) {
            // wallet goes down by price value
            wallet -= artwork.getPrice();
            // initiate accept payment in gallery
            gallery.acceptPayment(artwork.getPrice());
        } else {
            System.out.println("Can't afford!");
        }

    }
}
