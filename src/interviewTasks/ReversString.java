package interviewTasks;

public class ReversString {
    static String string = "xcjkvndsf sdcsw ascxq `12 kcm";
    static StringBuilder reversString = new StringBuilder();

    public static void main(String[] args) {

        for (int i= string.length()-1; i>=0; i--){
            reversString.append(string.charAt(i));
        }
        System.out.println(reversString);
    }
}
