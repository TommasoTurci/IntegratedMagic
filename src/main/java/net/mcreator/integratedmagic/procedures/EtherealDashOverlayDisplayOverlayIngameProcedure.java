package net.mcreator.integratedmagic.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.integratedmagic.init.IntegratedmagicModMobEffects;

public class EtherealDashOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(IntegratedmagicModMobEffects.ETHEREAL_DASH_POTION_EFFECT.get()) : false) {
			return true;
		}
		return false;
	}
}
