import java.lang.*;

public class UpperLowerCase {
    public void UpperLowerCase (String x) {
        int upperCounter = 0;
        int lowerCounter = 0;
        for(char c: x.toCharArray()) {
            if(Character.isUpperCase(c)){
                upperCounter++;
            }
            if(Character.isLowerCase(c)){
                lowerCounter++;
            }
        }
        System.out.println("Upper Case: " + upperCounter);
        System.out.println("Lower Case: " + lowerCounter);
    }
}
