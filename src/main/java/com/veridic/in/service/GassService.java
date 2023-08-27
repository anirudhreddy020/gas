package com.veridic.in.service;

import com.veridic.in.Dao.GassTableRequest;
import com.veridic.in.Dao.GassTableResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;

@Service
public class GassService {
    public GassTableResponse resultService(GassTableRequest gassTableRequest) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        int gallonsFilled = gassTableRequest.getMaxGallonCapacity() - gassTableRequest.getExistingNoOfVallonsInVehicl();
        int gass = 3;
        int totalPrice = gallonsFilled * gass;

        GassTableResponse gassTableResponse = new GassTableResponse();
        gassTableResponse.setPricePerGallon(gass);
        gassTableResponse.setNoOfGallonsFilled(gallonsFilled);
        gassTableResponse.setTransactionDate(now); // Set LocalDateTime
        gassTableResponse.setTotalPrice(totalPrice);

        return gassTableResponse;
    }
}
