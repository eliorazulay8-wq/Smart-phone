package com.eliorazulay.reallifesmartphone.registry;

import com.eliorazulay.reallifesmartphone.RealLifeSmartphone;
import com.eliorazulay.reallifesmartphone.item.SmartphoneItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RealLifeSmartphone.MODID);
    public static final RegistryObject<Item> SMARTPHONE = ITEMS.register("smartphone", () -> new SmartphoneItem(new Item.Properties().stacksTo(1)));
    private ModItems() {}
}