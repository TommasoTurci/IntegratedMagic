package net.mcreator.integratedmagic.procedures;

import net.minecraft.world.entity.Entity;

public class BoltGiverRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("firstSpell", "bolt1");
	}
}
