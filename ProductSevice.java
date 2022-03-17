import java.util.Scanner;

/**
 * ProductSevice
 */
public class ProductSevice {

    // hàm chen thêm sản phẩm vào list đặt hàng 
    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin: ");

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter quanlity: ");
            int quanlity = sc.nextInt();

            System.out.print("Enter description: ");
            String description = sc.next();

            System.out.print("Enter price: ");
            float price = sc.nextFloat();

            Product p = new Product(id, name, quanlity, description, price);
            App.PRODUCTS.add(p);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    // hàm hiển thị những sản phẩm đã đc thêm 
    public void show(){
        System.out.println("Danh sach san pham la: ");
        for (Product p : App.PRODUCTS) {
            System.out.printf("%d \t %s \t %d \t %s \t %f", p.getId(), p.getName(), p.getQuanlity(), p.getDescription(), p.getPrice());
            System.out.println();
        }
    }

    // hàm sửa sản phẩm 
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ID: ");
        Integer id = sc.nextInt();
        try {
            for (int i = 0; i < App.PRODUCTS.size(); i++) {
                if (id.equals(App.PRODUCTS.get(i).getId())){
                    System.out.println("Moi ban nhap thong tin moi: ");
    
                    System.out.print("Enter name: ");
                    String name = sc.next();
    
                    System.out.print("Enter quanlity: ");
                    int quanlity = sc.nextInt();
    
                    System.out.print("Enter description: ");
                    String description = sc.next();
    
                    System.out.print("Enter price: ");
                    float price = sc.nextFloat();
    
                    App.PRODUCTS.get(i).setName(name);
                    App.PRODUCTS.get(i).setQuanlity(quanlity);
                    App.PRODUCTS.get(i).setDescription(description);
                    App.PRODUCTS.get(i).setPrice(price);
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
    public Product getbyId(int id){
        Product pro = new Product();
        for (Product p : App.PRODUCTS) {
            if (p.getId().equals(id)) {
                pro = p;
                break;
            }
        }
        return  pro;
    }
    // hàm xóa sản phẩm trong danh sách
    public void delete(int id){
        for (Product p : App.PRODUCTS) {
            if (p.getId().equals(id)) {
                App.PRODUCTS.remove(p);
                break;
            }
        }
    }
    

    
}