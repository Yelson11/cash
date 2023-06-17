package model;

/**
 *
 * @author Yelson Monge
 */
public class Saves {
    private String name;
    private int percent;
    private int value;

    public Saves(String name, int percent) {
        this.name = name;
        this.percent = percent;
        this.value = 0;
    }
    
    public void addValue(int value) {
        this.value = this.value + value;
    }
    
// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
