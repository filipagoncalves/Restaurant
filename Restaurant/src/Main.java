public class Main {
    public static void main(String[] args) {

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        Client client4 = new Client();
        Client client5 = new Client();

        Client[][] clients  = {{client1, client2}, {client3, client4, client5}};


        Restaurant restaurant = new Restaurant("Comesses em casa!","Imaginary Food", clients);
        System.out.println("Hello world!");
    }
}