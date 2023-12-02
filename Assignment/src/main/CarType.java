package main;
public enum CarType {
    HATCHBACK {
        @Override
        public String toString() {
            return "Hatchback";
        }
    },
    SEDAN {
        @Override
        public String toString() {
            return "Sedan";
        }
    },
    SPORT {
        @Override
        public String toString() {
            return "Sport";
        }
    },
    SUV {
        @Override
        public String toString() {
            return "SUV";
        }
    };
}
