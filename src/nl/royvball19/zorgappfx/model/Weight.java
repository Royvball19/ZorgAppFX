package nl.royvball19.zorgappfx.model;

import java.time.LocalDate;

public class Weight
{

    // Attributes
    private LocalDate date;
    private String time;
    private double weight;

    // Constructor Measurementdata
    public Weight(LocalDate date, String time, double weight)
    {

        this.date = date;
        this.time = time;
        this.weight = weight;
    }

    // Getters
    public LocalDate getDate()
    {
        return date;
    }

    public String getTime()
    {
        return time;
    }

    public double getWeight()
    {
        return weight;
    }

    // Setters
    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public void setWeight(double Weight)
    {
        this.weight = weight;
    }

}