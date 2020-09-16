package csc241;

public class Holiday {
    private String month;
    private String name;
    private int day;

    public Holiday(String month, int day, String name){
        this.month = month;
        this.day = day;
        this.name = name;
    }

    public String toString(){
        return month + ", " + day + "-" + name;
    }

}
