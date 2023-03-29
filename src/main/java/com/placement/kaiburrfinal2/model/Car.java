package com.placement.kaiburrfinal2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("car")
public class Car {

    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String Name;
    @Field("brand")
    private brand carbrand;
    @Field("price")
    private BigDecimal carPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public brand getCarbrand() {
        return carbrand;
    }


    public void setCarbrand(brand carbrand) {
        this.carbrand = carbrand;
    }

    public BigDecimal getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(BigDecimal carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", carbrand=" + carbrand +
                ", carPrice=" + carPrice +
                '}';
    }
}
