package com.veridic.in.service;

import com.veridic.in.Dao.GassTableRequest;
import com.veridic.in.Dao.GassTableRespose;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class GassService
{


    public GassTableRespose resultService(GassTableRequest gassTableRequest)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        int GallonsFilled = gassTableRequest.getMaxGallonCapacity() - gassTableRequest.getExistingNoOfVallonsInVehicl();
        int gass = 3;
        int totalprice = GallonsFilled*gass;
        GassTableRespose gassTableRespose = new GassTableRespose();
        gassTableRespose.setPricePerGallon(gass);
        gassTableRespose.setNoOfGallonsFilled(GallonsFilled);
        gassTableRespose.setTransactionDate(dtf.format(now));
        gassTableRespose.setTotalPrice(totalprice);

        return gassTableRespose;
    }

}
