public class Table {

    private final int seats;
    private boolean isFree;
    private String order;

public Table (int numberOfSeats){
    this.seats = numberOfSeats;
    this.isFree = true;
    this.order = "";
}
    public static int cleanOrder(){
        return 0;
    }

    public static void getOrder(){

    }
    public void setOrder(String order){
        this.order = order;
    }

    public static boolean isFree(){
        return false;
    }


    public void occupy(){
        this.isFree = false;
    }

    public static void saveOrder(){

    }

    public void unoccupy(){

        this.isFree = true;
    }
}
