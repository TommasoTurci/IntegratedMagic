package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
