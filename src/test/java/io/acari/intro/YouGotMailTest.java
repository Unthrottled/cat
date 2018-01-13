package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class YouGotMailTest {
  private final YouGotMail youGotMail = new YouGotMail();

  @Test
  public void findEmailDomainOne() throws Exception {
    assertEquals("example.com", youGotMail.findEmailDomain("prettyandsimple@example.com"));
  }

  @Test
  public void findEmailDomainTwo() throws Exception {
    assertEquals("example.org", youGotMail.findEmailDomain("<>[]:,;@\\\"!#$%&*+-/=?^_{}| ~.a\\\"@example.org"));
  }

  @Test
  public void findEmailDomainThree() throws Exception {
    assertEquals("yandex.ru", youGotMail.findEmailDomain("someaddress@yandex.ru"));
  }

  @Test
  public void findEmailDomainFour() throws Exception {
    assertEquals("xample.org", youGotMail.findEmailDomain("\\\" \\\"@xample.org"));
  }

}