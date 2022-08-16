package net.mcreator.integratedmagic.procedures;

import net.minecraft.world.entity.Entity;

public class EtherealDashGiverRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("firstSpell", "etherealDash1");
	}
}
