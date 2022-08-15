
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.integratedmagic.item.WandItem;
import net.mcreator.integratedmagic.item.EtherealDashGiverItem;
import net.mcreator.integratedmagic.item.CursedKeyItem;
import net.mcreator.integratedmagic.item.BoltGiverItem;
import net.mcreator.integratedmagic.IntegratedmagicMod;

public class IntegratedmagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IntegratedmagicMod.MODID);
	public static final RegistryObject<Item> ETHEREAL_DASH_GIVER = REGISTRY.register("ethereal_dash_giver", () -> new EtherealDashGiverItem());
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());
	public static final RegistryObject<Item> CURSED_KEY = REGISTRY.register("cursed_key", () -> new CursedKeyItem());
	public static final RegistryObject<Item> BOLT_GIVER = REGISTRY.register("bolt_giver", () -> new BoltGiverItem());
}
