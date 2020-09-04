package ru.mirea.bert7438.javasem1;

public class Ball {
    private int size;
    private String sport;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Ball(int size, String sport){
        this.size = size;
        this.sport = sport;
    }

    public Ball(int size){
        this.sport = "football";
        this.size = size;
    }

    public Ball(String sport){
        this.sport = sport;
        this.size = 5;
    }

    public Ball(){
        this.sport = "football";
        this.size = 5;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", sport='" + sport + '\'' +
                '}';
    }
}
