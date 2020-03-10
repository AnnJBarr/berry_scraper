package com.annjbarr.sainsburys.models;

import lombok.Data;

@Data
public class Product {
    private String title;
    private double unitPrice;
    private int calsPerHundred;
    private String description;
}
