package Candy;

public class Candy extends Sweet {
    private String Variety;
    private String Taste;


   public Candy(String name,int weight,int sugar,String country,String variety,String taste){
    super(name,weight,sugar,country);
    this.Variety = variety;
    this.Taste = taste;
   }

   public int getSugar(){
       return super.getSugar();
   }
    public String getVariety() {
        return Variety;
    }

    public void setVariety(String variety) {
        Variety = variety;
    }

    public String getTaste() {
        return Taste;
    }

    public void setTaste(String taste) {
        Taste = taste;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", Sugar=" + getSugar() +
                ", Country='" + getCountry() + '\'' +
                '}';
    }
}
