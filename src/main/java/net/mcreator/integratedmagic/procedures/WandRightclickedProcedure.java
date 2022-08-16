package net.mcreator.integratedmagic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class WandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("firstSpell")).equals("etherealDash1")) {
			EtherealDashProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("firstSpell")).equals("bolt1")) {
			BoltProcedure.execute(world, x, y, z);
		}
	}
}
