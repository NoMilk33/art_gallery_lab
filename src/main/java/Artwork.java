public class Artwork {
 // First we define the properties for our class- and repeat this step for all classes.
 
    private String title;
    private Artist artist;
    private float price;
    private float nft;

 //Next we add a Constructor, containing all of our properties as parameters
 
    public Artwork(String title, Artist artist, float price, float nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;

    }
// Here we have to create a getter for our price. If we enter this getPrice at any time
// it will return the current price.
    public float getPrice() {
        return price;
    }



 }


