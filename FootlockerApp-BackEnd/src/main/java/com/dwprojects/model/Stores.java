package com.dwprojects.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stores {
    private int store_id;
    private String city;
    private String state;
}
