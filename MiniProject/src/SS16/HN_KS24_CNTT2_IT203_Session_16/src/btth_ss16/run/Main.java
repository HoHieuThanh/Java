package btth_ss16.run;

import btth_ss16.business.ProductRepository;
import btth_ss16.model.ElectronicProduct;
import btth_ss16.model.FoodProduct;
import btth_ss16.model.Product;

import java.util.Map;

public class Main {

    public static ProductRepository productRepository = new ProductRepository();

    public static void main(String[] args) {

        // a) Tao san pham
        productRepository.add(
                new ElectronicProduct("P001","Tủ lạnh",2000000,10));

        productRepository.add(
                new ElectronicProduct("P002","Máy giặt",5000000,15));

        productRepository.add(
                new FoodProduct("P003","Táo",20000,0));

        productRepository.add(
                new FoodProduct("P004","Chuối",50000,50));

        // b1) Hien thi danh sach
        System.out.println("Danh sách sản phẩm:");

        for(Product p :
                productRepository.findAll()){

            p.displayInfo();
            System.out.println(
                    "Thành tiền: "
                            + p.calculateFinalPrice());
            System.out.println("------------------");
        }

        // b2) Tim theo ID
        System.out.println("Tìm P002:");
        Product found =
                productRepository.findById("P002");

        if(found != null){
            found.displayInfo();
        }

        // b3) Sap xep
        productRepository.sortByPriceAsc();

        System.out.println("Sau khi sắp xếp:");

        for(Product p :
                productRepository.findAll()){
            p.displayInfo();
            System.out.println();
        }

        // b4) Thong ke
        System.out.println("Thống kê:");
        Map<String,Integer> map =
                productRepository.countByType();

        for(String key : map.keySet()){
            System.out.println(
                    key + ": " + map.get(key));
        }
    }
}
