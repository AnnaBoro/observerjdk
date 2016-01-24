package lesson6_9.adapter.observerjdk;


import java.util.Date;

public abstract class Pressa {

    protected String name;
    protected Date date;

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
