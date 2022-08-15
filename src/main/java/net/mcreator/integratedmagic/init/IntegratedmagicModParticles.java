
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
	}
}
