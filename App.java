import java.util.*;


public class App {
    public static List<Product> PRODUCTS = new ArrayList<Product>();
    public static List<Order> ORDER = new ArrayList<Order>();

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Float pri = (float) (i+1);
            Product p = new Product(i+1, "Sp " + i, i+1, "description", pri);
            App.PRODUCTS.add(p);

        }
        int func = 0;
        do {
            menu();
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Chon chuc nang: ");
                func = sc.nextInt();
                ProductSevice ps = new ProductSevice();
                OrderSevice ods = new OrderSevice();
                // Switch chọn chức năng 
                switch (func) {
                    case 1:
                    // thêm một sản phẩm vào list sảm phẩm
                        ps.insert();
                        break;
                    case 2:
                    // hiển thị danh sách các sản phẩm hiện có
                        ps.show();
                        break;
                    case 3:
                    // sửa thông tin sản phẩm
                        ps.update();
                        break;
                    case 4:
                    // xóa sản phẩm trong danh dách
                        System.out.println("Moi ban nhap ID san pham muon xoa: ");
                        int delId = sc.nextInt();
                        ps.delete(delId);
                        break;
                    case 5:
                    // đặt hàng sản phẩm
                        ods.order();
                        break;
                    case 6:
                    // hiện thị danh sách các đơn hàng đã đặt
                        ods.show();
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.getMessage());
            }
        } while (func != 7);
        System.out.println("Cam on ban da su dung phan mem!! ");




    }

    public static void menu(){
        System.out.println("---------------Menu--------------");
        System.out.println("1. Them moi san pham: ");
        System.out.println("2. Hien thi san pham: ");
        System.out.println("3. Sua san pham: ");
        System.out.println("4. Xoa san pham: ");
        System.out.println("5. Mua hang: ");
        System.out.println("6. Hien thi danh sach don hang: ");
        System.out.println("7. Thoat: ");
    }
}
