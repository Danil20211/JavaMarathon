package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher1 {
    public static void main(String[] args) {
        String text = "hello broker@vtb.ru ddda as@yandex.ru";
        Pattern email =Pattern.compile("(\\w+)@(vtb|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }
}
