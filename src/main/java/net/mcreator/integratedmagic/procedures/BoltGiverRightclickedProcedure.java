package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BoltGiverRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("firstSpell", "bolt1");
	}
}
