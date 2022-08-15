package net.mcreator.integratedmagic.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntegratedmagicModVariables {
	public static double targetZ = 0;
	public static double targetY = 0;
	public static double targetX = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
