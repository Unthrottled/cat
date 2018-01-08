package io.acari.intro;

public class LineEncoder {

  /**
   * Given a string, return its encoding defined as follows:
   * <p>
   * First, the string is divided into the least possible
   * number of disjoint substrings consisting of identical character
   * for example, "aabbbc" is divided into ["aa", "bbb", "c"]
   * <p>
   * Next, each substring with length greater than one is
   * replaced with a concatenation of its length and the
   * repeating character for example, substring "bbb" is
   * replaced by "3b"
   * <p>
   * Finally, all the new strings are concatenated together
   * in the same order and a new string is returned.
   *
   * @param s
   * @return
   */
  String lineEncoding(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    int currentCount = 1;
    char currentCharacter = s.charAt(0);
    int length = s.length()-1;
    for (int i = 1; i <= length; i++) {
      char nextChar = s.charAt(i);
      if(nextChar == currentCharacter){
        currentCount++;
      } else {
        process(stringBuilder, currentCount, currentCharacter);
        currentCount = 1;
      }
      currentCharacter = nextChar;
    }
    process(stringBuilder,currentCount,currentCharacter);
    return stringBuilder.toString();
  }

  private void process(StringBuilder stringBuilder, int currentCount, char currentCharacter) {
    if(currentCount > 1){
      stringBuilder.append(currentCount);
    }
    stringBuilder.append(currentCharacter);
  }

}
