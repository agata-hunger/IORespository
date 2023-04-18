package com.restApiCrud.restApiCrud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

public class Car {

    private int id;
    private String marka;
    private String model;
    private LocalDate rokProdukcji;

    public Car(int id, String marka, String model, LocalDate rokProdukcji) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(LocalDate rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
