package io.acari.dp;

public class StringIncreasingDistance {

  public int find(String string) {
    int length = string.length();
    if (length > 1 && string.charAt(0) == 'a') {
      for (int j = length - 1; j > -1; --j) {
        char guy = string.charAt(j);
        if (guy != 'a' && reachesEnd(string.substring(0, j), guy)) {
          return j + 1;
        }
      }
    }
    return -1;
  }


  private boolean reachesEnd(String str, char guy) {
    if (!str.isEmpty()) {
      char start = str.charAt(0);
      if (start == guy) {
        return true;
      } else {
        for (int i = str.length() - 1; i > -1; i--) {
          char otherGuy = str.charAt(i);
          if (otherGuy + 1 == guy) {
            return reachesEnd(str.substring(0, i + 1), otherGuy);
          }
        }
      }
    }
    return false;
  }
}
