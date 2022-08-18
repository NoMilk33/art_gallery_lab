import java.util.ArrayList;

public class Customer {

    private String name;
    private float wallet;
    private ArrayList<Artwork> artwork;
    private Gallery gallery;

    public Customer(String name, float wallet) {
        this.name = name;
        this.wallet = wallet;
        this.artwork = new ArrayList<>();
        

    }

    public float getWallet() {
        return wallet;
    }

    public void payGallery(Artwork artwork) {
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
