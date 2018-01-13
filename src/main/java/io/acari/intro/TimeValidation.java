package io.acari.intro;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeValidation {

  /**
   * Check if the given string is a correct
   * time representation of the 24-hour clock.
   *
   * @param time
   * @return
   */
  boolean validTime(String time) {
    try {
      LocalTime.parse(time, DateTimeFormatter.ofPattern("kk:mm"));
      return !time.startsWith("24");
    } catch (DateTimeParseException ignored) {
      return false;
    }
  }

}
