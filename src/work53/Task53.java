package work53;

public class Task53 {
    public static void main(String[] args) {
        String s = "An information system is designed to collect, process, store and distribute information";
        System.out.println(s.substring(s.lastIndexOf(" ")+1) +
                s.substring(s.indexOf(" ") ,s.lastIndexOf(" ")+1) +
                s.substring(0, s.indexOf(" ")));
    }
}
