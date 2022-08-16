package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.integratedmagic.init.IntegratedmagicModParticleTypes;
import net.mcreator.integratedmagic.init.IntegratedmagicModMobEffects;

import java.util.Random;

public class EtherealDashProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (IntegratedmagicModParticleTypes.VORTEX_PARTICLE.get()), x, y, z, 40, 0.1, 0.1, 0.1, 0.1);
		if (!world.isClientSide()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:vortexconjuration")), SoundSource.NEUTRAL, 1,
							(float) Mth.nextDouble(new Random(), 0.6, 1));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:vortexconjuration")),
							SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(new Random(), 0.6, 1), false);
				}
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(IntegratedmagicModMobEffects.ETHEREAL_DASH_POTION_EFFECT.get(), 100, 0, (false), (false)));
	}
}
