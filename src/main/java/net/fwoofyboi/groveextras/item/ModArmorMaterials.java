package net.fwoofyboi.groveextras.item;

import net.fwoofyboi.groveextras.GroveExtras;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> DAWN_STONE_ARMOR_MATERIAL = registerArmorMaterials("dawn_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "dawn_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> DUSK_STONE_ARMOR_MATERIAL = registerArmorMaterials("dusk_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "dusk_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> FIRE_STONE_ARMOR_MATERIAL = registerArmorMaterials("fire_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "fire_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> ICE_STONE_ARMOR_MATERIAL = registerArmorMaterials("ice_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "ice_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> LEAF_STONE_ARMOR_MATERIAL = registerArmorMaterials("leaf_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "leaf_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> MOON_STONE_ARMOR_MATERIAL = registerArmorMaterials("moon_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "moon_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> SHINY_STONE_ARMOR_MATERIAL = registerArmorMaterials("shiny_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "shiny_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> SUN_STONE_ARMOR_MATERIAL = registerArmorMaterials("sun_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "sun_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> THUNDER_STONE_ARMOR_MATERIAL = registerArmorMaterials("thunder_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "thunder_stone"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> WATER_STONE_ARMOR_MATERIAL = registerArmorMaterials("water_stone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 5);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DNA_STRAND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GroveExtras.MOD_ID, "water_stone"))), 0, 0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterials(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(GroveExtras.MOD_ID, name), material.get());
    }
}
