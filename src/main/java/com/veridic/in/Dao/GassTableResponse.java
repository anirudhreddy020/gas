package com.veridic.in.Dao;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime; // Import the LocalDateTime class

@Component
@Data
public class GassTableResponse {
    private double noOfGallonsFilled;
    private double pricePerGallon;
    private LocalDateTime transactionDate; // Change the type to LocalDateTime
    private double totalPrice;

    // Constructors, if needed

    @Override
    public String toString() {
        return "GassTableResponse{" +
                "noOfGallonsFilled=" + noOfGallonsFilled +
                ", pricePerGallon=" + pricePerGallon +
                ", transactionDate=" + transactionDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
