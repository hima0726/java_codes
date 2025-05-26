package helloworld;
class Product {
 void showPrice() {
     System.out.println("The price of the product is $450.");
 }
}
class ElectronicProduct extends Product {
 void showWarranty() {
     System.out.println("The warranty period is 5 years.");
 }
}
public class OnlineStore {
 public static void main(String[] args) {
     ElectronicProduct ep = new ElectronicProduct();
     ep.showPrice();    
     ep.showWarranty();  
 }
}

