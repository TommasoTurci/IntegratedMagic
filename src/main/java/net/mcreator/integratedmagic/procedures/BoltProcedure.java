package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.integratedmagic.init.IntegratedmagicModParticleTypes;

import java.util.Random;
import java.util.Comparator;

public class BoltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Entity targetedmob = null;
		targetedmob = (Entity) world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream()
				.sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null);
		if (targetedmob instanceof Mob) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:fulgor_cast")), SoundSource.MASTER, 1,
							(float) Mth.nextDouble(new Random(), 0.6, 1));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:fulgor_cast")),
							SoundSource.MASTER, 1, (float) Mth.nextDouble(new Random(), 0.6, 1), false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IntegratedmagicModParticleTypes.FULGOR_SHOCK_PARTICLE.get()), (targetedmob.getX()),
						(targetedmob.getY()), (targetedmob.getZ()), 10, 0.1, 0.2, 0.1, 0.01);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IntegratedmagicModParticleTypes.FULGOR_PARTICLE.get()), (targetedmob.getX()),
						(targetedmob.getY()), (targetedmob.getZ()), 15, 0.1, 0.2, 0.1, 0.05);
			targetedmob.hurt(DamageSource.LIGHTNING_BOLT, 6);
			if (!world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(targetedmob.getX(), targetedmob.getY(), targetedmob.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:fulgor_impact")), SoundSource.MASTER, 1,
								(float) Mth.nextDouble(new Random(), 0.6, 1));
					} else {
						_level.playLocalSound((targetedmob.getX()), (targetedmob.getY()), (targetedmob.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:fulgor_impact")), SoundSource.MASTER, 1,
								(float) Mth.nextDouble(new Random(), 0.6, 1), false);
					}
				}
			}
		}
	}
}
