package calculator.domain;

import java.util.regex.Pattern;

public class Number {

    private static final String VALID_NUMBER_REGEX = "\\d+";
    private final String number;

    public Number(String input){
        if(!validate(input)){
            throw new IllegalArgumentException("숫자형식이 아닙니다.");
        }
        this.number = input;
    }

    private boolean validate(String number){
        return Pattern.matches(VALID_NUMBER_REGEX, number);
    }
}
