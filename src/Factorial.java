public class Factorial {
    public void Factorial (int n) {
        int counter = 1;
        int i = 1;
        while (i < n) {
           counter =  counter * (i + 1);
           i++;
        }
        System.out.println(n + " Factorial is " + counter);
    }
}
