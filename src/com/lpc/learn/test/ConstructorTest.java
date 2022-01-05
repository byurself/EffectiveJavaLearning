package com.lpc.learn.test;

import com.lpc.learn.constructor.*;

/**
 * @author byu_rself
 * @date 2022/1/5 21:10
 */

public class ConstructorTest {

    public static void main(String[] args) {
        // 创建实例
        NutritionFactsTelescopingConstructor nutritionFactsTelescopingConstructor =
                new NutritionFactsTelescopingConstructor(240, 8, 100, 0, 35, 27);

        // 创建实例
//        NutritionFactsJavaBeans cocaCola = new NutritionFactsJavaBeans();
//        cocaCola.setServingSize(240);
//        cocaCola.setServings(8);
//        cocaCola.setCalories(100);
//        cocaCola.setSodium(35);
//        cocaCola.setCarbohydrate(27);

        // 创建实例
        NutritionFactsBuilder cocaCola = new NutritionFactsBuilder.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        // 创建实例
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
    }

}
