package net.fwoofyboi.groveextras.entity;

import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.entity.custom.PineconeEntity;
import net.fwoofyboi.groveextras.entity.custom.SnowBrickEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntities {

    public static final EntityType<SnowBrickEntity> SNOW_BRICK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(GroveExtras.MOD_ID, "snow_brick"),
            EntityType.Builder.<SnowBrickEntity>create(SnowBrickEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f).build());

    public static final EntityType<PineconeEntity> PINECONE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(GroveExtras.MOD_ID, "pinecone"),
            EntityType.Builder.<PineconeEntity>create(PineconeEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f).build());



    public static void registerModEntities() {
        GroveExtras.LOGGER.info("Registering Mod Entities for " + GroveExtras.MOD_ID);
    }
}
