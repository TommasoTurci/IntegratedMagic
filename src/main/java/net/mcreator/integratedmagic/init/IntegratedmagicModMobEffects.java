
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.integratedmagic.potion.PreciseStrikes4MobEffect;
import net.mcreator.integratedmagic.potion.PreciseStrikes3MobEffect;
import net.mcreator.integratedmagic.potion.PreciseStrikes2MobEffect;
import net.mcreator.integratedmagic.potion.PreciseStrikes1MobEffect;
import net.mcreator.integratedmagic.potion.EtherealDashPotionEffectMobEffect;
import net.mcreator.integratedmagic.IntegratedmagicMod;

public class IntegratedmagicModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, IntegratedmagicMod.MODID);
	public static final RegistryObject<MobEffect> ETHEREAL_DASH_POTION_EFFECT = REGISTRY.register("ethereal_dash_potion_effect",
			() -> new EtherealDashPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> PRECISE_STRIKES_1 = REGISTRY.register("precise_strikes_1", () -> new PreciseStrikes1MobEffect());
	public static final RegistryObject<MobEffect> PRECISE_STRIKES_2 = REGISTRY.register("precise_strikes_2", () -> new PreciseStrikes2MobEffect());
	public static final RegistryObject<MobEffect> PRECISE_STRIKES_3 = REGISTRY.register("precise_strikes_3", () -> new PreciseStrikes3MobEffect());
	public static final RegistryObject<MobEffect> PRECISE_STRIKES_4 = REGISTRY.register("precise_strikes_4", () -> new PreciseStrikes4MobEffect());
}
