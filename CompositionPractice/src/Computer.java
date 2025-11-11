public class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;
    private String model;

    public Computer(String model, String cpuBrand, double cpuSpeed, int cpuCores,
                    int ramCapacity, String ramType,
                    int hdCapacity, String hdType) {
        this.model = model;

        System.out.println("\n=== Building Computer: " + model + " ===");

        this.cpu = new CPU(cpuBrand, cpuSpeed, cpuCores);
        this.ram = new RAM(ramCapacity, ramType);
        this.hardDrive = new HardDrive(hdCapacity, hdType);

        System.out.println("Computer assembly complete!\n");
    }
      
    public void powerOn() {
        System.out.println("=== Powering on " + model + " ===");
        cpu.process();
        ram.load();
        hardDrive.readData();
        System.out.println("System ready!");
    }

    public void displaySpecifications() {
        System.out.println("=== " + model + " Specifications ===");
        System.out.println("CPU: " + cpu.getSpecifications());
        System.out.println("RAM: " + ram.getSpecifications());
        System.out.println("Storage: " + hardDrive.getSpecifications());
    }
}
