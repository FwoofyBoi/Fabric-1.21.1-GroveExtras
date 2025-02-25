package net.fwoofyboi.groveextras.component;

import net.fwoofyboi.groveextras.GroveExtras;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderUnaryOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(GroveExtras.MOD_ID, name),
                builderUnaryOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        GroveExtras.LOGGER.info("Registering Data Component Types for " + GroveExtras.MOD_ID);
    }
}
