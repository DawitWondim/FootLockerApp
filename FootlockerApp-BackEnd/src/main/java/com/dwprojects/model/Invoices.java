package com.dwprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoices {

    private int invoice_number;
    private Stores store;
    private double total_price;
    private Date date;
    private User user;

}
