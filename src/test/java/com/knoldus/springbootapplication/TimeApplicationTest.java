package com.knoldus.springbootapplication;

import org.junit.jupiter.api.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class TimeApplicationTest {

    TimeApplication timeApplication = new TimeApplication();
    Date date = new Date();

    @Test
    void getCurrentTimePass() {
         String getFinalTime = timeApplication.getCurrentTime();
         DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
         String currentTime = dateFormat.format(date);
        assertEquals(getFinalTime, "Successfully running API : ".concat(currentTime));
    }
    @Test
    void getCurrentTimeFail() {
        String getFinalTime = timeApplication.getCurrentTime();
        String currentTime = String.valueOf(LocalTime.now());
        assertNotEquals(getFinalTime,("Successfully running API : ".concat(currentTime)));
    }
}
