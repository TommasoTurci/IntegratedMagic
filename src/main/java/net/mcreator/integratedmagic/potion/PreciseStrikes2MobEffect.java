
package net.mcreator.integratedmagic.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.integratedmagic.procedures.PreciseStrikes2OnEffectActiveTickProcedure;

public class PreciseStrikes2MobEffect extends MobEffect {
	public PreciseStrikes2MobEffect() {
		super(MobEffectCategory.HARMFUL, -1438987);
	}

	@Override
	public String getDescriptionId() {
		return "effect.integratedmagic.precise_strikes_2";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PreciseStrikes2OnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
