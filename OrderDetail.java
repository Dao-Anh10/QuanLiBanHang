public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private Integer quanlity;
    private Float price;

    public void setId(Integer id){
        this.id = id;
    }
    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }
    public void setProductId(Integer productId){
        this.productId = productId;
    }
    public void setQuanlity(Integer quanlity){
        this.quanlity = quanlity;
    }
    public void setPrice(Float price){
        this.price = price;
    }
    public Integer getId(){
        return id;
    }
    public Integer getOrderId(){
        return orderId;
    }
    public Integer getProductId(){
        return productId;
    }
    public Integer getQuanlity(){
        return quanlity;
    }
    public Float getPrice(){
        return price;
    }
    
}
