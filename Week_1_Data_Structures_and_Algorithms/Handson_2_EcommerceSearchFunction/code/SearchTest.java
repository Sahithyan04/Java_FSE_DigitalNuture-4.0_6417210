package Week_1_Data_Structures_and_Algorithms.Handson_2_EcommerceSearchFunction.code;


import java.util.*;

public class SearchTest{
    public static void main(String [] args) {

            Product[] products = {
            new Product(101, "iPhone 14", "Electronics"),
            new Product(102, "T-Shirt", "Clothing"),
            new Product(103, "Galaxy S22", "Electronics"),
            new Product(104, "MacBook Air", "Electronics"),
            new Product(105, "Shoes", "Footwear"),
            new Product(106, "Watch", "Accessories"),
            new Product(107, "Refrigerator", "Home Appliances")
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a product to search: ");
        String searchName = sc.nextLine();


        // binary search for searching if we enter that product name


        int low = 0;
        int high = products.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = products[mid].getproductName();
            int compare = midName.compareToIgnoreCase(searchName); //IgnoreCase is used so that we can put any uppper or lowercase in word
            if (compare == 0) {
                System.out.println("Product Found: " + products[mid]);
                found = true;
                break;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println(searchName + " - No such item(s) found ");

        }
    }
    
}
