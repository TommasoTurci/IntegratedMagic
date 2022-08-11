
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.integratedmagic.item.TestItemItem;
import net.mcreator.integratedmagic.IntegratedmagicMod;

public class IntegratedmagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IntegratedmagicMod.MODID);
	public static final RegistryObject<Item> TEST_ITEM = REGISTRY.register("test_item", () -> new TestItemItem());
}
