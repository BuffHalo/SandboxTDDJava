package tdd.sandbox.com.example.tdddemo;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

//TODO added comment for commit
public class TennisCourtScore {

    public static String getScore(String scoreDeTennis) {
        if (scoreDeTennis == "0-0") {
            return "Love All";
        } else {
            return createTennisScore(scoreTennisToString(scoreDeTennis));
        }

    }

    private static List<Character> scoreTennisToString(String scoreAsString) {

        List<Character> chars = new ArrayList<>();

        for (char ch : scoreAsString.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    private final static String createTennisScore(List<Character> chars) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.size(); i++) {
            Character actual = chars.get(i);
            result.append(translateScore(actual.toString()));
        }

        return result.toString();
    }

    private static String translateScore(String string) {
        switch (string) {
            case "3":
                return "40";
            case "2":
                return "30";
            case "1":
                return "15";
            case "0":
                return "0";
            case "-":
                return "-";
        }
        throw new IllegalArgumentException("Invalid score: " + string);
    }

}
