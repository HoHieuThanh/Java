package btth_ss16.business;

import btth_ss16.model.Product;

import java.util.*;

public class ProductRepository implements IRepository<Product>{

    ArrayList<Product> products = new ArrayList<>();
    HashMap<String, Product> productHashMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        Product findProduct = findById(item.getId());
        if (findProduct == null){
            return products.add(item);
        }
        return false;
    }

    @Override
    public boolean removeById(String id) {
        for(Product item : products){
            if(item.getId().equals(id)){
                return products.remove(item);
            }
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        for(Product item : products){
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    public void sortByPriceAsc() {
        Collections.sort(products,
                Comparator.comparingDouble(Product::getPrice));
    }

    public Map<String, Integer> countByType() {

        Map<String, Integer> map = new HashMap<>();

        for(Product p : products){

            String type = p.getClass().getSimpleName();

            map.put(type,
                    map.getOrDefault(type, 0) + 1);
        }

        return map;
    }


}
