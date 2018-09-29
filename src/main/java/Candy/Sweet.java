package Candy;

public class Sweet {
    private String name;
    private int weight;
    private int Sugar;
    private String Country;
    private int Allweight;

    Sweet(String name,int weight,int sugar,String country){
        this.name = name;
        this.weight = weight;
        this.Sugar = sugar;
        this.Country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugar() {
        return Sugar;
    }

    public void setSugar(int sugar) {
        Sugar = sugar;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getAllweight() {
        return Allweight;
    }

    public void setAllweight(int allweight) {
        Allweight = allweight;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", Sugar=" + Sugar +
                ", Country='" + Country + '\'' +
                ", Allweight=" + Allweight +
                '}';
    }
}
