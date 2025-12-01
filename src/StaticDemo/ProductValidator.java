package StaticDemo;

public class ProductValidator {
    //bir ürünü kaydederken veya güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanılır
    public boolean isValid(Product product) {
        if(product.price > 0 && !product.name.isEmpty() ){
            return true;
        }
        else{
            return false;
        }

    }
}
