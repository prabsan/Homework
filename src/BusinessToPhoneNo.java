

public class BusinessToPhoneNo {
    public static String convertPhoneNumber(String s) {
        String newNumber = "";
        String[] arrOfStr = s.split("-");

        for (String a : arrOfStr) {
            if (checkIfNumeric(a)) {
                newNumber = newNumber + a + "-";
            }

            if (!checkIfNumeric(a)) {
                String[] arr = a.split("");
                for (String character : arr) {
                    switch (character.toLowerCase()) {
                        case "a":
                        case "b":
                        case "c":
                            newNumber += 2;
                            break;
                        case "d":
                        case "e":
                        case "f":
                            newNumber += 3;
                            break;
                        case "g":
                        case "h":
                        case "i":
                            newNumber += 4;
                            break;
                        case "j":
                        case "k":
                        case "l":
                            newNumber += 5;
                            break;
                        case "m":
                        case "n":
                        case "o":
                            newNumber += 6;
                            break;
                        case "p":
                        case "q":
                        case "r":
                        case "s":
                            newNumber += 7;
                            break;
                        case "t":
                        case "u":
                        case "v":
                            newNumber += 8;
                            break;
                        case "w":
                        case "x":
                        case "y":
                        case "z":
                            newNumber += 9;
                    }
                }
            }
        }
        return newNumber;
    }

    private static boolean checkIfNumeric (String s) {
        boolean numeric = true;
        try {
            Integer num = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            numeric = false;
        }
        if(numeric){
            return true;
        }
        return false;
    }
}
