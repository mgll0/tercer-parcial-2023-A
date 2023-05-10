package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3ShoppingItemCatalog {
    private final ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        ShoppingItem item = shoppingItemCatalog.getItem("ABC3000");

        assertThat(item).isNotNull();

    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        ShoppingItem item = shoppingItemCatalog.getItem("ABC354320");
        assertThat(item).isEqualTo(null);
    }
}
