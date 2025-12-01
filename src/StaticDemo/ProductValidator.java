package StaticDemo;

public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı.");
    }
    public ProductValidator() {//constructor newlenince çalışır
        System.out.println("Yapıcı blok çalıştı.");
    }

    //bir ürünü kaydederken veya güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanılır
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void birsey() {

    }
}
