package io.codeforall.kernelfc;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String model;
    private int year;


    @Version
    private Integer version;

    @CreationTimestamp
    private Date creationTime;

    @UpdateTimestamp
    private Date updateTime;

    @Embedded
    private Engine engine;

    @Embedded
    private Customer customer;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", customer=" + customer +
                '}';
    }
}