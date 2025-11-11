public class HardDrive {
    private int capacity;
    private String type;

    public HardDrive(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
        System.out.println("Hard Drive installed: " + capacity + "GB " + type);
    }

    public void readData(){
        System.out.println("Reading data from " + capacity + " GB " + type);
    }

    public void writeData(){
        System.out.println("Writing data to " + capacity + " GB " + type);
    }

    public String getSpecifications(){
        return capacity + "GB " + type;
    }
}
