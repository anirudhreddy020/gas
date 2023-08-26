package com.veridic.in.Dao;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class GassTableRespose
{
    private int noOfGallonsFilled;
    private int pricePerGallon;
    private String transactionDate;
    private int totalPrice;

    public int getNoOfGallonsFilled() {
        return noOfGallonsFilled;
    }

    public void setNoOfGallonsFilled(int noOfGallonsFilled) {
        this.noOfGallonsFilled = noOfGallonsFilled;
    }

    public int getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(int pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "GassTableRespose{" +
                "noOfGallonsFilled=" + noOfGallonsFilled +
                ", pricePerGallon=" + pricePerGallon +
                ", transactionDate='" + transactionDate + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
