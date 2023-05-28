package org.francomoyano.quarkus.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private Double price;
}