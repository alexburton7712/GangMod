package net.alex.gangmod.event;

import net.alex.gangmod.GangMod;
import net.alex.gangmod.entity.ModEntities;
import net.alex.gangmod.entity.custom.FishyEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GangMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.FISHY.get(), FishyEntity.createAttributes().build());
    }
}
