package com.knoldus.springbootapplication;

import org.springframework.boot.SpringApplication;

/**
 * Application class contains main and runs the spring boot application.
 */
public final class Application {
  private Application() { }
  /**
   * main method run the application.
   *
   * @param args String array.
   */

  public static void main(final String[] args) {
    SpringApplication.run(TimeApplication.class, args);
  }
}
