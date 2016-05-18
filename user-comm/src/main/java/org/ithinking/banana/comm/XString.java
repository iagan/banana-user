package org.ithinking.banana.comm;

/**
 * Created by test on 2016/5/18.
 */
public class XString {

    public static boolean isBlank(String src) {
        if (src != null) {
            int i = 0, len = src.length();
            while (i < len) {
                if (src.charAt(i++) > ' ') {
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean isBlank(String str, String str2){
        return isBlank(str) || isBlank(str2);
    }
}
