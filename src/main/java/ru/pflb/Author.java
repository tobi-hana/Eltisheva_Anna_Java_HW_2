package ru.pflb;

public class Author {
    private String name;
    private String email;
    private Gender gender;

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String email(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Gender getGender(){
        return gender;
    }
    public String toString(){
        return String.format("%s (%c) %s", name, gender.getEngChar(), email);
    }
}
