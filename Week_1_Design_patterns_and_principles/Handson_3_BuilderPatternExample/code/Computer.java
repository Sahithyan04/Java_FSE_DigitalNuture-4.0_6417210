package Week_1_Design_patterns_and_principles.Handson_3_BuilderPatternExample.code;


public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private boolean hasWifi;
    private boolean hasBluetooth;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Nested static Builder 
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private boolean hasWifi;
        private boolean hasBluetooth;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }



        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder enableWifi() {
            this.hasWifi = true;
            return this;
        }

        public Builder enableBluetooth() {
            this.hasBluetooth = true;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
               ", WiFi=" + hasWifi + ", Bluetooth=" + hasBluetooth + "]";
    }
}
