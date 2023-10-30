package com.javamasterclass.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Chair implements Serializable {
    private String color;
    private long price;
    private String brandName;

    @Serial
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(color);
        out.writeLong(price);
        out.writeObject(brandName);
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        color = (String) in.readObject();
        price = in.readLong();
        brandName = (String) in.readObject();
    }
}
public class SerializationMoreControl {
    public static void main(String[] args) {

    }
}
