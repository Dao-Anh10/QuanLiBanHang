import javax.sound.sampled.FloatControl;

/**
 * Product
 */
public class Product {
    private Integer id;
    private String name;
    private Integer quanlity;
    private String description;
    private Float price;
    public Product(){};

    public Product(Integer id, String name,Integer quanlity,String description , Float price ){
        this.id = id;
        this.name = name;
        this.quanlity = quanlity;
        this.description = description;
        this.price = price;
    }
    public void setPrice(Float price){
        this.price = price;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQuanlity(Integer quanlity){
        this.quanlity = quanlity;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Integer getQuanlity(){
        return quanlity;
    }
    public String getDescription(){
        return description;
    }
    public Float getPrice(){
        return price;
    }

    
}