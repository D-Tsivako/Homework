package com.company;

import java.io.InvalidObjectException;

public class SerializationFlow extends  Thread {
    Serializator sz;
    Bouquet bouquet;
    String file;
    public boolean serOrDeser;

    public SerializationFlow(Serializator sz, Bouquet bouquet, String file) {
        this.sz = sz;
        this.bouquet = bouquet;
        this.file = file;
        serOrDeser = true;
    }

    public void run() {
        if (serOrDeser) {
            boolean b = sz.serialization(bouquet, file);
        } else {
            try {
                bouquet = sz.deserialization(file);
            } catch (InvalidObjectException e) {
                e.printStackTrace();
            }
            if (bouquet != null)
                bouquet.show();
        }
    }
}
