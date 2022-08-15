package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EtherealDashPotionEffectEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:vortex_dispel")), SoundSource.NEUTRAL, 1,
							(float) Mth.nextDouble(new Random(), 0.6, 1));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:vortex_dispel")),
							SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(new Random(), 0.6, 1), false);
				}
			}
		}
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE).setBaseValue(0);
	}
}
