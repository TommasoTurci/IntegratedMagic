
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.integratedmagic.IntegratedmagicMod;

public class IntegratedmagicModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			IntegratedmagicMod.MODID);
	public static final RegistryObject<ParticleType<?>> VORTEX_PARTICLE = REGISTRY.register("vortex_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> FULGOR_PARTICLE = REGISTRY.register("fulgor_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> FULGOR_SHOCK_PARTICLE = REGISTRY.register("fulgor_shock_particle",
			() -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> PRECISE_STRIKES_1_PARTICLE = REGISTRY.register("precise_strikes_1_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> PRECISE_STRIKES_PARTICLE_2 = REGISTRY.register("precise_strikes_particle_2",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> PRECISE_STRIKES_PARTICLE_3 = REGISTRY.register("precise_strikes_particle_3",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> PRECISE_STRIKES_PARTICLE_4 = REGISTRY.register("precise_strikes_particle_4",
			() -> new SimpleParticleType(false));
}
