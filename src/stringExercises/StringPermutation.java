package stringExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPermutation {
    public String permutation (String text) {
        return (text == null || text.isEmpty()) ? null : Arrays.toString(permutation("", text).toArray());
    }

    public ArrayList<String> permutation(String perm, String text){
        ArrayList<String> arrayList = new ArrayList<>();
        if (text.isEmpty()) {
            arrayList.add(perm);
        } else {
            for (int i = 0; i<text.length(); i++){
                arrayList.addAll(permutation(perm+text.charAt(i), text.substring(0,i)+text.substring(i+1,text.length())));
            }
        }
        return arrayList;

    }
}
