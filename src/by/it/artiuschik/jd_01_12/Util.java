package by.it.artiuschik.jd_01_12;

public class Util {
    //поделить строку на слова
    public static String[] words(String str)
    {
        String[] result=str.split("[^a-zA-Z0-9]+");
        return result;
    }
}
