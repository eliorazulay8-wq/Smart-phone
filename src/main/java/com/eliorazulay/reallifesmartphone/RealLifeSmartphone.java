package com.eliorazulay.reallifesmartphone;

import com.eliorazulay.reallifesmartphone.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RealLifeSmartphone.MODID)
public class RealLifeSmartphone {
    public static final String MODID = "reallifesmartphone";
    public RealLifeSmartphone() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
    }
}