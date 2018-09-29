package Candy;

public class Cookie extends Sweet {
    private String Type;
    private String Filling;
    Cookie(String name, int weight, int sugar, String country,String type,String filling) {
        super(name, weight, sugar, country);
        this.Type = type;
        this.Filling = filling;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFilling() {
        return Filling;
    }

    public void setFilling(String filling) {
        Filling = filling;
    }

    public String toString(){
        return "{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", Sugar=" + getSugar() +
                ", Country='" + getCountry() + '\'' +
                '}';
    }
}
