package main;

public enum Gear {
    AUTOMATIC {
        @Override
        public String toString() {
            return "Automatic";
        }
    },
    MANUAL {
        @Override
        public String toString() {
            return "Manual";
        }
    }
}
