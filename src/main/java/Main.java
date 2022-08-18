public class Main {
    public static void main(String[] args) {


        Gallery gallery1 = new Gallery("Tate Modern", 1000);

        Artwork artwork1 = new Artwork("Mona Lisa", new Artist("da vinci"), 100, 50 );
        Artwork artwork2 = new Artwork("Pearl Earring", new Artist("Unknown"), 200, 40 );
        
        Customer customer1 = new Customer("Hanqing", 300);

//         customer1.buyArtwork();
        System.out.println("Hanqing's wallet after buying art: "+ customer1.getWallet());




    }
}