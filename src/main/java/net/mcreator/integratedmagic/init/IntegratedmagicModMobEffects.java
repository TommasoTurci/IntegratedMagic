
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.integratedmagic.potion.EtherealDashPotionEffectMobEffect;
import net.mcreator.integratedmagic.IntegratedmagicMod;

public class IntegratedmagicModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, IntegratedmagicMod.MODID);
	public static final RegistryObject<MobEffect> ETHEREAL_DASH_POTION_EFFECT = REGISTRY.register("ethereal_dash_potion_effect",
			() -> new EtherealDashPotionEffectMobEffect());
}
