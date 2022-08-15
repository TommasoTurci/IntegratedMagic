
package net.mcreator.integratedmagic.potion;

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
		EtherealDashPotionEffectOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EtherealDashPotionEffectEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
