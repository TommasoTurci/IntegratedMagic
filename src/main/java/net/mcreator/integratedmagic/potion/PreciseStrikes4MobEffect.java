
package net.mcreator.integratedmagic.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.integratedmagic.procedures.PreciseStrikes4OnEffectActiveTickProcedure;

public class PreciseStrikes4MobEffect extends MobEffect {
	public PreciseStrikes4MobEffect() {
		super(MobEffectCategory.HARMFUL, -1438987);
	}

	@Override
	public String getDescriptionId() {
		return "effect.integratedmagic.precise_strikes_4";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PreciseStrikes4OnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
