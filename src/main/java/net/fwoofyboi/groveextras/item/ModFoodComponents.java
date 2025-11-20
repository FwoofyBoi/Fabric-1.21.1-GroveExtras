package net.fwoofyboi.groveextras.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RED_MINERS_TREAT = new FoodComponent.Builder().alwaysEdible().nutrition(20).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 2), 1.0f).build();

    public static final FoodComponent YELLOW_MINERS_TREAT = new FoodComponent.Builder().alwaysEdible().nutrition(20).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 2), 1.0f).build();

    public static final FoodComponent GREEN_MINERS_TREAT = new FoodComponent.Builder().alwaysEdible().nutrition(20).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 2), 1.0f).build();

    public static final FoodComponent BLUE_MINERS_TREAT = new FoodComponent.Builder().alwaysEdible().nutrition(20).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2400), 1.0f).build();


    public static final FoodComponent CARAMEL = new FoodComponent.Builder().snack().nutrition(2).saturationModifier(0.3f).build();

    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final FoodComponent GARLIC_CLOVE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2f).build();
}
