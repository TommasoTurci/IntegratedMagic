
package net.mcreator.integratedmagic.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.integratedmagic.procedures.PreciseStrikes3OnEffectActiveTickProcedure;

public class PreciseStrikes3MobEffect extends MobEffect {
	public PreciseStrikes3MobEffect() {
		super(MobEffectCategory.HARMFUL, -1438987);
	}

	@Override
	public String getDescriptionId() {
		return "effect.integratedmagic.precise_strikes_3";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PreciseStrikes3OnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
