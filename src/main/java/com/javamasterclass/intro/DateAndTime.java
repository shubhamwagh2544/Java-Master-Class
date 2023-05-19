package com.javamasterclass.intro;

import java.time.*;
import java.util.Set;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);                  //2023-05-17T22:05:40.054325100
        System.out.println(localDateTime.getSecond());      //40
        System.out.println(localDateTime.getMinute());      //5
        System.out.println(localDateTime.getHour());        //22
        System.out.println(localDateTime.getDayOfWeek());   //WEDNESDAY
        System.out.println(localDateTime.getDayOfMonth());  //17
        System.out.println(localDateTime.getDayOfYear());   //137
        System.out.println(localDateTime.getMonth());       //MAY
        System.out.println(localDateTime.getYear());        //2023

        //creating own specific date
        LocalDate localDate = LocalDate.of(
                1998,
                Month.AUGUST,
                17
        );
        System.out.println(localDate);

        //get available zone Id
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        for (String zone : zoneId) {
            System.out.println(zone);
        }

        //time in diff zones
        LocalDateTime timeInEuropeOrLondon = LocalDateTime.now(ZoneId.of("Europe/London"));
        LocalDateTime timeInAustraliaOrSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));

        System.out.println(timeInEuropeOrLondon);
        System.out.println(timeInAustraliaOrSydney);

        //working with diff dates
        LocalDateTime localDateTime1 = LocalDateTime.now();     // Local Date Time
        ZonedDateTime zonedDateTime = ZonedDateTime.now();      // Zoned Date Time
        Instant instant = Instant.now();                        // moment on the timeline in UTC

        System.out.println(localDateTime1);
        System.out.println(zonedDateTime);
        System.out.println(instant);

        // Instant vs ZonedDateTime vs LocalDateTime
        /*
                Instant :
                -  moment on the timeline in UTC
                - if your business logic, data storage, and data exchange should be in UTC

                ZonedDateTime :
                - Instant with an assigned ZoneId.
                - ZonedDateTime = ( Instant + ZoneId )

                LocalDateTime :
                - not tied to any one locality or time zone.
                - They are not tied to the timeline.
                - They have no real meaning until you apply them to a locality to find a point on the timeline.
                - In business apps, the "Local" types are not often used as they represent just the general idea of
                  a possible date or time not a specific moment on the timeline
         */

    }
}
