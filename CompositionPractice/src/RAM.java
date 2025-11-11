public class RAM {
    private int capacity;
    private String type;

    public RAM(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
        System.out.println("RAM installed " + capacity + " GB " + type);
    }

    public String getSpecifications() {
         return capacity + " GB " + type;
    }

    public void load() {
        System.out.println("Loading data into " + capacity + " GB ram");
    }
}
