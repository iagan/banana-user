package org.ithinking.banana.comm;

/**
 * Created by test on 2016/5/18.
 */
public class XString {

    public static boolean isEmpty(String str){
        return str == null || str.trim().isEmpty();
    }

    public static boolean isEmpty(String str, String str2){
        return isEmpty(str) || isEmpty(str2);
    }
}
