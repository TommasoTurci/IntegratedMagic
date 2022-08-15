package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
