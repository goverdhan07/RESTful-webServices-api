package net.codejava.ProductRest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Entity (is an API annotation) is used to map this domain model class (data model class means implementing real world entities into the class) to the database :)
public class Product {
    private Integer id;
    private String name;
    private float price;


    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id //indicating the member field below is the primary key of the current entity. Hence your Hibernate and spring framework as well as you can do some reflect works based on this annotation.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // info here https://www.w3schools.blog/jpa-generatedvalue-annotation
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
