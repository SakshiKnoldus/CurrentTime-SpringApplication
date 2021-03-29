package com.knoldus.springbootapplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TimeApplication implements TimeApplicationInterface.
 */
@SpringBootApplication
@RestController
public class TimeApplication implements TimeApplicationInterface {
  /**
   * This method will be called when we run the localhost/status api.
   *
   * @return gives the current time.
   */
  @GetMapping("/status")
    public String getCurrentTime() {
     Date date = new Date();
     DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
     String currentTime = dateFormat.format(date);
    return "Successfully running API : "
        .concat(currentTime);
  }
}
