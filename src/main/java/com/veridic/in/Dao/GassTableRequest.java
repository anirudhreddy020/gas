package com.veridic.in.Dao;

import org.springframework.stereotype.Component;

@Component
public class GassTableRequest
{
     private int maxGallonCapacity;
     private int existingNoOfVallonsInVehicl;

     public int getMaxGallonCapacity() {
          return maxGallonCapacity;
     }

     public void setMaxGallonCapacity(int maxGallonCapacity) {
          this.maxGallonCapacity = maxGallonCapacity;
     }

     public int getExistingNoOfVallonsInVehicl() {
          return existingNoOfVallonsInVehicl;
     }

     public void setExistingNoOfVallonsInVehicl(int existingNoOfVallonsInVehicl) {
          this.existingNoOfVallonsInVehicl = existingNoOfVallonsInVehicl;
     }

     @Override
     public String toString() {
          return "GassTableRequest{" +
                  "maxGallonCapacity=" + maxGallonCapacity +
                  ", existingNoOfVallonsInVehicl=" + existingNoOfVallonsInVehicl +
                  '}';
     }
}
