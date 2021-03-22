package com.dwprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brands {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brand_id;
    private String name;

}
