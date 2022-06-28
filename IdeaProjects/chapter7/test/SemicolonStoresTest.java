import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stores.SemicolonStores;

import static org.junit.jupiter.api.Assertions.*;

class SemicolonStoresTest {
    SemicolonStores semicolonStores;

    @BeforeEach
    void setUp() {
        //given that I have a store
        semicolonStores = new SemicolonStores();
    }

    @Test
    void testThatCashierCanSetACustomerName() {
        String customerName = "James";                                       //given that I have a customer name
        semicolonStores.setCustomerName(customerName);                      //when cashier enters a customers name
        assertEquals("James", semicolonStores.getCustomerName());    //check that name is set
    }

    @Test
    void testThatCustomerCanBuyProduct(){
        String productName = "Chains";
        semicolonStores.setProductName(productName);
        assertEquals("Chains", semicolonStores.getProductName());
        String productName1 = "Bags";
        semicolonStores.setProductName(productName1);
        assertEquals("Bags", semicolonStores.getProductName());
    }

    @Test
    void testThatCustomerCanBuyManyPiecesOfItem(){
        int numberOfItems = 4;
        semicolonStores.setNumberOfItem(numberOfItems);
        assertEquals(4, semicolonStores.getNumberOfItem());
    }

    @Test
    void testForUnitPriceOfItems(){
        double unitPrice = 100;
        semicolonStores.setUnitPrice(unitPrice);
        assertEquals(100, semicolonStores.getUnitPrice());
    }

    @Test
    void testForCashierName(){
        String cashierName = "Oma";
        semicolonStores.setCashierName(cashierName);
        assertEquals("Oma", semicolonStores.getCashierName());
    }

    @Test
    void testForAmountIssued(){
        int amountIssued = 20000;
        semicolonStores.setAmountIssued(amountIssued);
        assertEquals(20000, semicolonStores.getAmountIssued());
    }

    @Test
    void testForDiscount(){
        double discount = 9;
        semicolonStores.discountRate(discount/100);
        assertEquals(0.09, semicolonStores.getDiscountRate());
    }

    @Test
    void testForExcessBalance(){
        double balance = 2300;
        semicolonStores.excessBalance(balance);
        assertEquals(2300, semicolonStores.getExcessBalance());
    }
//    @Test
//    void testForTotalCostOfItemsBought(){
//        double totalCost = 3000;
//        semicolonStores.setTotalPrice(totalCost);
//        assertEquals(3000, stores.SemicolonStores.getTotalPrice());
//    }

}
