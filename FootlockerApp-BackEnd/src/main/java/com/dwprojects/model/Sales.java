package com.dwprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Sales {
    private int sale_id;
    private Stores store;
    private int unites;
    private double total_price;
    private Invoices invoices;
    private Products product;
    private User user;
}
