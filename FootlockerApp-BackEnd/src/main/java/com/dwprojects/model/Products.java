package com.dwprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private int product_id;
    private ProductTypes productType;
    private Brands brand;
    private double price;

}
