package interviewTasks;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1234556;
        System.out.println(isPalindrome(3456));


    }

    static public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char [] ch = str.toCharArray();
        boolean result = false;

        for ( int i=0; i<ch.length/2; i++){
            if (ch[i] == ch[ch.length - 1]){
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

