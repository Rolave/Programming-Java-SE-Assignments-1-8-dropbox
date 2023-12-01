package main;

public enum VehicleType {
    FAMILY {
        @Override
        public String toString() {
            return "Family";
        }
    },
    NOT_FOR_RACE {
        @Override
        public String toString() {
            return "Not for Race";
        }
    },
    RACE {
        @Override
        public String toString() {
            return "Race";
        }
    }
}
