public class CPU {
    private String brand;
    private double clockSpeed;
    private int cores;

    public CPU(String brand, double clockSpeed, int cores) {
        this.brand = brand;
        this.clockSpeed = clockSpeed;
        this.cores = cores;
        System.out.println("CPU created " + brand);
    }
    
    public void process() {
        System.out.println(brand + " CPU processing at " + clockSpeed + " GHz with " + cores + " cores");
    }

    public String getSpecifications() {
        return String.format("%s - %.2f GHz, %d cores", brand, clockSpeed, cores);
    }
}

