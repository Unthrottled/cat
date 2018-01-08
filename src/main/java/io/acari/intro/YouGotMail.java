package io.acari.intro;

public class YouGotMail {

  /**
   * An email address such as "John.Smith@example.com"
   * is made up of a local part ("John.Smith"),
   * an "@" symbol, then a domain part ("example.com").
   *
   * @param address
   * @return
   */
  String findEmailDomain(String address) {
    return address.substring(address.lastIndexOf('@')+1);
  }

}
