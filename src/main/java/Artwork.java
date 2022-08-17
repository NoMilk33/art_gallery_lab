public class Artwork {

    private String title;
    private Artist artist;
    private float price;
    private float nft;
    private Customer customer;

    public Artwork(String title, Artist artist, float price, float nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;

    }

    public void buyArtwork(){
        if(customer.getWallet() > this.price);

    }

}
