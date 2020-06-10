package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String parseXML(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern opener = Pattern.compile("<\\w.+?>");
        Pattern closer = Pattern.compile("</\\w+>");
        Pattern boxBody = Pattern.compile(">.+?<");
        Pattern emptyBox = Pattern.compile("<\\w.+?/>");
        String [] lines = text.split("\n\\s*");
        for (String line : lines) {
            Matcher opened = opener.matcher(line);
            Matcher closed = closer.matcher(line);
            Matcher fileBdy = boxBody.matcher(line);
            Matcher empty = emptyBox.matcher(line);
            if (empty.find()) {
                stringBuilder.append(empty.group());
                stringBuilder.append(" Пустой тег\n");
            }
            else if (opened.find()) {
                stringBuilder.append(opened.group());
                stringBuilder.append(" Открывающий тег\n");
            }
            if (fileBdy.find()) {
                stringBuilder.append(fileBdy.group().substring(1));
                stringBuilder.append("\b Содержание тега\n");
            }
            if (closed.find()) {
                stringBuilder.append(closed.group());
                stringBuilder.append(" Закрывающий тег\n");
            }

        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String text = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String result = parseXML(text);
        System.out.println(result);
    }

}
