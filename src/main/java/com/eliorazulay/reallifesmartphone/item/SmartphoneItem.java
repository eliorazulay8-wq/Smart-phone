package com.eliorazulay.reallifesmartphone.item;

import com.eliorazulay.reallifesmartphone.client.PhoneScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SmartphoneItem extends Item {
    public SmartphoneItem(Properties properties) { super(properties); }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (level.isClientSide) Minecraft.getInstance().setScreen(new PhoneScreen());
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}