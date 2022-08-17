public class Customer {

    private String name;
    private float wallet;
    private Artwork artwork;
    private Gallery gallery;

    public Customer(String name, float wallet) {
        this.name = name;
        this.wallet = wallet;

    }

    public float getWallet() {
        return wallet;
    }

    public void buyArtwork(Artwork artwork) {
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
