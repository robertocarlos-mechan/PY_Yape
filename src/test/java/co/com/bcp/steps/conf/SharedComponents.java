package co.com.bcp.steps.conf;

import io.appium.java_client.AppiumDriver;

public class SharedComponents {

  private static AppiumDriver driver;

  public  static AppiumDriver getDriver() {
    return driver;
  }
  
  public void setDriver(AppiumDriver driver) {
    this.driver = driver;
  }
}
