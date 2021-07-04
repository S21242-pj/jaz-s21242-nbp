package pl.edu.pjatk.jazs21242nbp.model;

import java.io.IOException;

public enum Table {
    A;

    public static Table forValue(String value) throws IOException {
        if (value.equals("A")) return A;
        throw new IOException("Cannot deserialize Table");
    }

    public String toValue() {
        switch (this) {
            case A:
                return "A";
        }
        return null;
    }
}