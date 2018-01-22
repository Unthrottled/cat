package io.acari.prac;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Forged in the flames of battle by alex.
 */
public class DishStackerTest {
  private final DishStacker dishStacker = new DishStacker();

  @Test
  public void groupingDishesOne() {
    assertArrayEquals(new String[][]
        {{"Cheese","Quesadilla","Sandwich"},
 {"Salad","Salad","Sandwich"},
 {"Sauce","Pizza","Quesadilla","Salad"},
 {"Tomato","Pizza","Salad","Sandwich"}}
        ,
        dishStacker.groupingDishes(new String[][]
            {{"Salad","Tomato","Cucumber","Salad","Sauce"},
 {"Pizza","Tomato","Sausage","Sauce","Dough"},
 {"Quesadilla","Chicken","Cheese","Sauce"},
 {"Sandwich","Salad","Bread","Tomato","Cheese"}}
        )
    );
  }

  @Test
  public void groupingDishesTwo() {
    assertArrayEquals(new String[][]
        {{"Cheese","Quesadilla","Sandwich"},
 {"Chicken","Chicken Curry","Quesadilla"},
 {"Nuts","Fried Rice","Salad"},
 {"Onions","Fried Rice","Pasta"}}
        ,
        dishStacker.groupingDishes(new String[][]
            {{"Pasta","Tomato Sauce","Onions","Garlic"},
 {"Chicken Curry","Chicken","Curry Sauce"},
 {"Fried Rice","Rice","Onions","Nuts"},
 {"Salad","Spinach","Nuts"},
 {"Sandwich","Cheese","Bread"},
 {"Quesadilla","Chicken","Cheese"}}
        )
    );
  }

  @Test
  public void groupingDishesThree() {
    assertArrayEquals(new String[][]{}
        ,
        dishStacker.groupingDishes(new String[][]
            {{"Pasta","Tomato Sauce","Onions","Garlic"}, 
 {"Chicken Curry","Chicken","Curry Sauce"}, 
 {"Fried Rice","Rice","Onion","Nuts"}, 
 {"Salad","Spinach","Nut"}, 
 {"Sandwich","Cheese","Bread"}, 
 {"Quesadilla","Chickens","Cheeseeee"}}
        )
    );
  }
}