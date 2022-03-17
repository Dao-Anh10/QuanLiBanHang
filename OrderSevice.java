import java.util.*;
public class OrderSevice {
    // hàm đặt hàng sản phẩm
    public void order(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon mua san pham: ");

        try {
            System.out.print("Nhap ma khach hang cua ban: ");
            int id = sc.nextInt();

            System.out.print("Ten khach hang: ");
            String name = sc.next();

            System.out.print("So dien thoai: ");
            String phone = sc.next();

            System.out.print("Email khach hang: ");
            String email = sc.next();
            // tạo đơn hàng mới 
            Order ot = new Order(id, name, phone, email);
            int productId = -1;
               do{
                    sc = new Scanner(System.in);
                    System.out.println("Nhap ma san pham muon mua: ");
                    productId = sc.nextInt();
                    System.out.println("Moi ban nhap so luong muon mua: ");
                    int quanlityProduct = sc.nextInt();

                    Product pt = null;
                    for (Product p: App.PRODUCTS) {
                        if (p.getId().equals(productId)) {
                            pt = p;
                            break;  
                        }
                    }
                    if (pt == null) {
                        System.out.println("Ma san pham ban muon mua khong ton tai: ");
                    }else{
                        System.out.println("Mua hang thanh cong!! ");
                    }
                    // nếu sản phẩm khach muốn mua có tồn tại thì mua sản phẩm ấy => lên hóa đơn chi tiết
                    OrderDetail orD = new OrderDetail();
                    orD.setId(1);
                    orD.setOrderId(ot.getId());
                    orD.setQuanlity(quanlityProduct);
                    orD.setProductId(productId);
                    orD.setPrice(pt.getPrice());

                    ot.getOrderDetail().add(orD);
                } while(productId == 0);
                App.ORDER.add(ot);
            } catch (Exception e) { 
            System.out.println(e.getMessage());
        }
    }    
    // hàm hiện thị danh sách các hàng hóa đã đặt 
    public void show(){
        System.out.println("Thong tin khach mua hang: ");
        ProductSevice prs = new ProductSevice();
        System.out.printf("%s \t %s  %10s  %10s \n", "MaKH", "TenKH", "SoDT", "Email");
        for (Order p : App.ORDER) {
            System.out.printf("%d \t %s \t %s \t %s", p.getId(), p.getCustomerName(), p.getPhone(), p.getEmail());
            System.out.println();
            System.out.println("Chi tiet don hang: ");
            int i = 1;
            for (OrderDetail of : p.getOrderDetail()) {
                Product pc = prs.getbyId(of.getProductId());
                System.out.printf("%d \t %s \t %d \t %f \n",i, pc.getName(), of.getQuanlity(), (of.getPrice() * of.getQuanlity()));
                i++;
            }
        }

    }

}
