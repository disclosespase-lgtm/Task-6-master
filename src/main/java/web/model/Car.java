package web.model;

import lombok.Data;

@Data
public class Car {
    private String model;

    public String color;

    private int serial;

    public Car() {
    }

    public Car(String model, int serial, String color) {
        this.model = model;
        this.serial = serial;
        this.color = color;
    }
}
