package net.alex.gangmod.entity;

import net.alex.gangmod.GangMod;
import net.alex.gangmod.entity.custom.FishyEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GangMod.MOD_ID);

    public static final RegistryObject<EntityType<FishyEntity>> FISHY =
            ENTITY_TYPES.register("fishy", () -> EntityType.Builder.of(FishyEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("fishy"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}