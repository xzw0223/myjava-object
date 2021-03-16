package xzw.shuai.framework.utils;

/**
 * @author DELL
 */
public class StringUtils {
    private StringUtils() {
    }

    public static String getSetterMethodByFiledName(String filedName) {
        //转换 filedName :  userDao  == > UserDao  == > setUserDao

       return  "set" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
    }

}
