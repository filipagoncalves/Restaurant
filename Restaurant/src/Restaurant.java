public class Restaurant {

    private Client[][] c;
    private Table[] tables;
    private boolean fullCapacity;
    private int numberOfOccupiedTables;
    private int RestaurantCount;

    private String name;
    private String kindOfFood;

    public Restaurant(String name, String kindOfFood, Client[][] clients){

        this.name = name;
        this.kindOfFood = kindOfFood;

        Table table1 = new Table(2);
        Table table2 = new Table(4);


        Table[] existingTables= {table1, table2};
        this.tables = existingTables;
        this.c = clients;
    }

    public void findTable(){

        for (int i = 0; i < this.tables.length; i++){

            if (this.tables[i].isFree == true) {
                if(this.tables[i].seats <= c[i].length) {
                    numberOfOccupiedTables++;
                    occupyTable(i);
                    break;
                }
            }
        }
    }

    public boolean freeTable(){


        return true;
    }

    public int getRestaurantCount() {
        return 0;
    }

    public void receiveOrder() {

    }

    private boolean checkIfTableCanBeFree() {
        Rtes
        return true;
    }

    private void occupyTable(int numberOfTable){
        this.tables[numberOfTable].isFree = false;
    }
}
