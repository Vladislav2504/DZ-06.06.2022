package MainTask1;

import java.util.Locale;

public class Method extends Strings {

    public Method(String str) {
        super(str);
    }

    public String number1(){
        return getStr().substring(0,5)+getStr().substring(9,13);
    }

    public static String number2(){
        return getStr().replace("abc", "***").replace("def", "***");
    }

    public static String number3(){
        return getStr().substring(5,8)+"/"+getStr().substring(14,17)+"/"+getStr().substring(19,20)+"/"
                +getStr().substring(21,22);
    }

    public static String number4(){
        return getStr().substring(5,8)+"/"+getStr().substring(14,17)+"/"
                +getStr().substring(19,20)+"/"+getStr().substring(21,22);
    }

    public static String number5(){
        String abc = "ABC";
        return String.valueOf(getStr().toUpperCase(Locale.forLanguageTag(abc)).contains(abc));
    }

    public static String number6(){
        return String.valueOf(getStr().startsWith("555",0));
    }

    public static String number7(){
        return String.valueOf(getStr().endsWith("1a2b"));
    }


}
