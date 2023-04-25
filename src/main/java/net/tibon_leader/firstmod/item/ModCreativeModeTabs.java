package net.tibon_leader.firstmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tibon_leader.firstmod.TibonsFirstMod;

import javax.swing.*;

@Mod.EventBusSubscriber(modid = TibonsFirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static CreativeModeTab FIRST_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        FIRST_TAB = event.registerCreativeModeTab(new ResourceLocation(TibonsFirstMod.MOD_ID, "first_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get())).title(Component.translatable("creativemodetab.first_tab")));
    }
}
