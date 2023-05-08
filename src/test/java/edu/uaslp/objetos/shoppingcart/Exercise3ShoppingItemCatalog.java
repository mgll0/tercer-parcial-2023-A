package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise3ShoppingItemCatalog {
    private final ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        ShoppingItem item = shoppingItemCatalog.getItem("ABC3000");
        ShoppingItem item0 = new ShoppingItem("Mantel", "Articulo de adorno", "ABC3000", 34600);

        assertThat(item).isEqualTo(item0);
    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        ShoppingItem item = shoppingItemCatalog.getItem("ABC354320");
        assertThat(item).isEqualTo(null);
    }
}
