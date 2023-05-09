package com.satishit.java8.dateandtimeapi;

import java.io.Serializable;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class RepresentZoneId {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone); //Asia/Calcutta

        //We can create ZoneId for a particular zone as follows
        try {
            ZoneId la = ZoneId.of("America/Los_Angles");
            ZonedDateTime zt = ZonedDateTime.now(la);
            System.out.println(zt);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
