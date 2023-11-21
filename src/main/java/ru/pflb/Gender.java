package ru.pflb;

public enum Gender {
    // я не поняла в задании то 'м' то 'm' написано
    MALE('м', 'm'), FEMALE('ж', 'f');
    private char rusChar;
    private char engChar;
    Gender(char rusChar, char engChar) {
        this.rusChar = rusChar;
        this.engChar = engChar;
    }
    public char getRusChar(){
        return rusChar;
    }
    public char getEngChar(){
        return engChar;
    }
}
