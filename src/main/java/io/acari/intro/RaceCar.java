package io.acari.intro;

public class RaceCar {

  /**
   * Given a string, find the shortest possible
   * string which can be achieved by adding characters
   * to the end of initial string to make it a palindrome.
   *
   * @param st
   * @return
   */
  String buildPalindrome(String st) {
    if (st.length() == 1 || isPalindrome(st))
      return st;

    String reversed = reverse(st);
    for (int i = 0; i < st.length(); i++) {
      if(reversed.charAt(0) == st.charAt(i)){
        String maybePal = st.substring(0, i) + reversed;
        if(isPalindrome(maybePal)){
          return maybePal;//isPal!
        }
      }
    }
    return st;
  }

  private boolean isPalindrome(String st) {
    int length = st.length() - 1;
    double v = length / 2d;
    int half = (int) ((length + 1) % 2 == 0 ? v : Math.ceil(v));
    for (int i = length; i >= half; --i) {
      char left = st.charAt(length - i);
      char right = st.charAt(i);
      if (left != right) {
        return false;
      }
    }
    return true;
  }

  private String reverse(String substring) {
    return new StringBuilder(substring).reverse().toString();
  }
}
