public class BuilderPatternTest {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Computer: " + basicComputer);


        Computer gamingComputer = new Computer.Builder("AMD Ryzen 6", "8 GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA GTX 1650")
                .setSSD(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
