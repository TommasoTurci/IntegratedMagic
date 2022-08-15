
package net.mcreator.integratedmagic.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.integratedmagic.procedures.EtherealDashPotionEffectOnEffectActiveTickProcedure;
import net.mcreator.integratedmagic.procedures.EtherealDashPotionEffectEffectExpiresProcedure;

public class EtherealDashPotionEffectMobEffect extends MobEffect {
	public EtherealDashPotionEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711732);
	}

	@Override
	public String getDescriptionId() {
		return "effect.integratedmagic.ethereal_dash_potion_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EtherealDashPotionEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EtherealDashPotionEffectEffectExpiresProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
