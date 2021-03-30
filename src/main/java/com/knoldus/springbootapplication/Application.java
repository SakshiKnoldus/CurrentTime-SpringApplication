package com.knoldus.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application class contains main and runs the spring boot application.
 */
@SpringBootApplication
public class Application {
  /**
   * main method run the application.
   *
   * @param args String array.
   */

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
