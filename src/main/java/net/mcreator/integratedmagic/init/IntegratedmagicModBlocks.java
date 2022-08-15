
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.integratedmagic.block.SmallChalkBlock;
import net.mcreator.integratedmagic.block.ChalkTopBlock;
import net.mcreator.integratedmagic.block.ChalkBodyBlock;
import net.mcreator.integratedmagic.block.ChalkBlockBlock;
import net.mcreator.integratedmagic.IntegratedmagicMod;

public class IntegratedmagicModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IntegratedmagicMod.MODID);
	public static final RegistryObject<Block> CHALK_BODY = REGISTRY.register("chalk_body", () -> new ChalkBodyBlock());
	public static final RegistryObject<Block> CHALK_TOP = REGISTRY.register("chalk_top", () -> new ChalkTopBlock());
	public static final RegistryObject<Block> CHALK_BLOCK = REGISTRY.register("chalk_block", () -> new ChalkBlockBlock());
	public static final RegistryObject<Block> SMALL_CHALK = REGISTRY.register("small_chalk", () -> new SmallChalkBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ChalkBodyBlock.registerRenderLayer();
			ChalkTopBlock.registerRenderLayer();
			ChalkBlockBlock.registerRenderLayer();
			SmallChalkBlock.registerRenderLayer();
		}
	}
}
