public class ComputerTest {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setBluetoothEnabled(true)
                .build();


        Computer laptop = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB HDD")
                .setBluetoothEnabled(true)
                .build();

        System.out.println();
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Laptop: " + laptop);
    }
}
