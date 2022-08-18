public class Main {
    public static void main(String[] args) {


        Artwork artwork1 = new Artwork("Mona Lisa", new Artist("da vinci"), 100, 50 );
        Gallery gallery1 = new Gallery("Tate Modern", 1000, artwork1);



        Customer customer1 = new Customer("Hanqing", 300);

        customer1.payGallery(artwork1);
        System.out.println("Hanqing's wallet after buying art: "+ customer1.getWallet());

// Cannot invoke "Gallery.acceptPayment(float)" because "this.gallery" is null
//	at Customer.payGallery(Customer.java:25)
//	at Main.main(Main.java:12)


    }
}