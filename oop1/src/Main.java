public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade Oranı";
        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");



        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3=new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("bilmemne3.jpg");



        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer=new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("054751122");
        individualCustomer.setCustomerNumber("84512");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiröğ");


        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("05123122312");
        corporateCustomer.setTaxNumber("123456789");
        corporateCustomer.setCustomerNumber("4745");

        Customer[] customers={individualCustomer,corporateCustomer};


    }
}