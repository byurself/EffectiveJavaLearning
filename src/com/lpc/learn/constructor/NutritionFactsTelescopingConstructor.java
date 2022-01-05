package com.lpc.learn.constructor;

/**
 * 重叠构造器模式(telescoping constructor)
 *
 * @author byu_rself
 * @date 2022/1/5 21:00
 */
// 不能很好地扩展
public class NutritionFactsTelescopingConstructor {
    private final int servingSize;  // (ml)            required
    private final int servings;     // (per container) required
    private final int calories;     // (per serving)   optional
    private final int fat;          // (g/serving)     optional
    private final int sodium;       // (mg/serving)    optional
    private final int carbohydrate; // (g/serving)     optional

    public NutritionFactsTelescopingConstructor(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsTelescopingConstructor(int servingSize, int servings,
                                                int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsTelescopingConstructor(int servingSize, int servings,
                                                int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFactsTelescopingConstructor(int servingSize, int servings,
                                                int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFactsTelescopingConstructor(int servingSize, int servings,
                                                int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
