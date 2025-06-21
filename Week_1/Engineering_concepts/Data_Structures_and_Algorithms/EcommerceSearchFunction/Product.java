package Week_1.Engineering_concepts.Data_Structures_and_Algorithms.EcommerceSearchFunction;

public class Product {
    int productId;
    String productName;
    String productCategory;

    public Product(int productId, String productName, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public String getproductName() {
        return productName;

    }

    @Override
    public String toString() {
        return "["+ productId + "] " + productName + "(" + productCategory + ")";
    }

    
}
