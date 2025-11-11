public class CompositionTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer(
            "Gaming Beast 3000",
            "Intel i9", 3.8, 8,
            32, "DDR4", 
            1000, "SSD"
        );

        gamingPC.displaySpecifications();
        gamingPC.powerOn();
    }
}
