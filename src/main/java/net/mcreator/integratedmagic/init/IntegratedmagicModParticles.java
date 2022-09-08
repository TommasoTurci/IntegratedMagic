
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.integratedmagic.client.particle.VortexParticleParticle;
import net.mcreator.integratedmagic.client.particle.PreciseStrikesParticle4Particle;
import net.mcreator.integratedmagic.client.particle.PreciseStrikesParticle3Particle;
import net.mcreator.integratedmagic.client.particle.PreciseStrikesParticle2Particle;
import net.mcreator.integratedmagic.client.particle.PreciseStrikes1ParticleParticle;
import net.mcreator.integratedmagic.client.particle.FulgorShockParticleParticle;
import net.mcreator.integratedmagic.client.particle.FulgorParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IntegratedmagicModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.VORTEX_PARTICLE.get(),
				VortexParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.FULGOR_PARTICLE.get(),
				FulgorParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.FULGOR_SHOCK_PARTICLE.get(),
				FulgorShockParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.PRECISE_STRIKES_1_PARTICLE.get(),
				PreciseStrikes1ParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.PRECISE_STRIKES_PARTICLE_2.get(),
				PreciseStrikesParticle2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.PRECISE_STRIKES_PARTICLE_3.get(),
				PreciseStrikesParticle3Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) IntegratedmagicModParticleTypes.PRECISE_STRIKES_PARTICLE_4.get(),
				PreciseStrikesParticle4Particle::provider);
	}
}
