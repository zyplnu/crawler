package cn.edu.lnu.system;

/**
 * 系统文件读取路径
 */
public class SystemPath {

    //系统中所有文件的前缀，该路径+文件名构成文件绝对路径
    public static final String SYSTEM_PATH_PREFIX = System.getProperty("user.dir") + "/src/main/resources/";

}
