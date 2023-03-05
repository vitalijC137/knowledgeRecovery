package com.constructor;

public class Constructor {

   public String firstCountry;
   public String secondCountry;
   public String thirdCountry;

   public Constructor() {
    }

   public Constructor(String firstCountry) {
        this.firstCountry = firstCountry;
    }

   public Constructor(String secondCountry, String thirdCountry) {
        this.secondCountry = secondCountry;
        this.thirdCountry = thirdCountry;
    }

}
