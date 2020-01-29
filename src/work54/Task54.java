package work54;

public class Task54 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        int i = 0;
        while (i < myStr1.length()){
            boolean isUnique = true;
            int j = 0;
            while (j < myStr2.length()){
                if(myStr1.charAt(i) == myStr2.charAt(j)){
                    isUnique = false;
                    break;
                }
                j++;
            }
            if(isUnique){
                System.out.print(myStr1.charAt(i));
            }
            i++;
        }
    }
}
