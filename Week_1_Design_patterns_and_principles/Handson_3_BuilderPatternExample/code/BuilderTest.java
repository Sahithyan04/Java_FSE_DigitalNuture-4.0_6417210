package Week_1_Design_patterns_and_principles.Handson_3_BuilderPatternExample.code;

public class BuilderTest {
    public static void main(String[] args) {
        Computer gamingRig = new Computer.Builder("Intel i9", "32GB")
                                  .setStorage("2TB SSD")
                                  .enableWifi()
                                  .enableBluetooth()
                                  .build();

        Computer officePC = new Computer.Builder("Intel i5", "8GB")
                               .setStorage("512GB HDD")
                               .build();

        System.out.println("Gaming Rig: " + gamingRig);
        System.out.println("Office PC: " + officePC);
    }
}
