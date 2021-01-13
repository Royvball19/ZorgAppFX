package nl.royvball19.zorgappfx;

public class Medicine
{

    // Attributes
    private int ID;
    private String name;
    private String description;
    private String type;
    private int dose;

    // Constructor
    public Medicine(int ID, String name, String description, String type, int dose)
    {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.type = type;
        this.dose = dose;
    }

    // Getters
    public int getID()
    {
        return this.ID;
    }

    public String getName()
    {
        return this.name;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String getType()
    {
        return this.type;
    }

    public int getDose()
    {
        return this.dose;
    }

    // Setters
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setDose(int dose)
    {
        this.dose = dose;
    }
}

