package work52;

public class Task52 {
    public static void main(String[] args) {
        String s = "National Aviation Universit";
        System.out.print(s.charAt(0) + "" + s.charAt(s.indexOf(" ")+1) + "" + s.charAt(s.lastIndexOf(" ")+1));
    }
}
