//Francisco Vazquez
//7.17.25
//Recursive and JUnit assignment
public class Main {

    public static int count8(int n) {
        if (n==0) return 0;
        if(n% 10 == 8){
            if ((n/10)%10 ==8){
                return 2 +count8(n/10);
            }else {
                return 1+ count8(n/10);
            }
        } 
        return count8(n/10);
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.length() >= 3 && str.charAt(0) == 'x' && str.substring(1,3).equals("hi")){
            return countHi2(str.substring(3));
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }
    
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    public static String stringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }
}
