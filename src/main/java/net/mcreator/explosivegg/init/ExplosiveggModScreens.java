
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.explosivegg.client.gui.TradeScreen;
import net.mcreator.explosivegg.client.gui.RingProgressScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExplosiveggModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ExplosiveggModMenus.TRADE, TradeScreen::new);
			MenuScreens.register(ExplosiveggModMenus.RING_PROGRESS, RingProgressScreen::new);
		});
	}
}
