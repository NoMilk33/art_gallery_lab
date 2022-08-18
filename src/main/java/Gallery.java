import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> artwork;

    public Gallery(String name, int till, Artwork artwork) {
    this.artwork= new ArrayList<>();
    this.name= name;
    this.till= till;
    }

    public float getTill(){
        return till;
    }
// Gallery accepts payment, till balance increases by price of artwork
    public void acceptPayment(float price) {
        till += price;
        }
}
