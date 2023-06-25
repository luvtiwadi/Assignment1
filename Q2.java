package PW;

public class Q2 {
    public static void main(String[] args) {
        String s = "leetcode";
        String si="loveleetcode";
        String in="aabb";
        System.out.println(firstNonRepetingCharacter(si));
    }

    public static int firstNonRepetingCharacter(String s) {

        for (int i = 0; i < s.length(); i++) {
        String substr=s.substring(0,i)+s.substring(i+1);
        int val=substr.indexOf(s.charAt(i));
        if(val==-1)
            return i;
    }
        return -1;
}

}
