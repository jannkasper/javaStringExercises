package stringExercises;

public class StringRemover {
    public String removeText(String base, String regex) {
        if(base == null)
            return null;

//            1st Method
//        base =  base.replaceAll(regex,"");

//            2nd Method
        base =  removeTextRecurention(base, regex);

        return base;
    }

    public String removeTextRecurention(String base, String regex) {
        if(base.startsWith(regex))
            return removeTextRecurention(base.substring(regex.length()), regex);

        if(base.isEmpty() || base.length() == 1)
            return base;

            return base.charAt(0) + removeTextRecurention(base.substring(1), regex);

    }
}
