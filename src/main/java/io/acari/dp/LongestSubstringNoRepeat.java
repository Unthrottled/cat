package io.acari.dp;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeat {

    public int find(String one){
        Set<Character> veezeted = new HashSet<>();
        int length = one.length();
        int[] counts = new int[length];
        int i1 = length - 1;
        int maxo = 0;
        for(int i = i1; i > -1; i--){
            char e = one.charAt(i);
            if(veezeted.add(e)){
                counts[i] += 1 + (i + 1 <= i1 ? counts[i + 1] : 0);
            } else {
                veezeted.clear();
                counts[i] = 1;
                veezeted.add(e);
            }

            if(counts[i] > maxo){
                maxo = counts[i];
            }
        }
        veezeted.clear();
        int maxo2 = 0;
        int[] counts2 = new int[length];
        for(int i = 0; i < length; i++){
            char e = one.charAt(i);
            if(veezeted.add(e)){
                counts2[i] += 1 + (i - 1 >= 0 ? counts2[i - 1] : 0);
            } else {
                veezeted.clear();
                counts2[i] = 1;
                veezeted.add(e);
            }

            if(counts2[i] > maxo2){
                maxo2 = counts2[i];
            }
        }

        return Math.max(maxo, maxo2);
    }
}
