package io.acari.dp;

public class StringIncreasingDistance {

    public int find(String string) {
        int length = string.length();
        if (length > 2) {
            for (int j = length - 1; j > -1; --j) {
                if (reachesEnd(string.substring(0, j), string.charAt(j))) {
                    return j + 1;
                }
            }
        }
        return -1;
    }


    private boolean reachesEnd(String str, char guy) {
        if (!str.isEmpty()) {
            if (str.charAt(0) == guy) {
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
