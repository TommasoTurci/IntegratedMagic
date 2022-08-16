package net.mcreator.integratedmagic.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.integratedmagic.init.IntegratedmagicModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PreciseStrikesCheckerProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),
					event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(IntegratedmagicModMobEffects.PRECISE_STRIKES_1.get()) : false) {
			if (sourceentity.getPersistentData().getDouble("pStrikes") == 0) {
				if (!world.isClientSide()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")), SoundSource.NEUTRAL,
									1, (float) 0.6);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")),
									SoundSource.NEUTRAL, 1, (float) 0.6, false);
						}
					}
				}
				sourceentity.getPersistentData().putDouble("pStrikes", 1);
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(IntegratedmagicModMobEffects.PRECISE_STRIKES_2.get()) : false) {
			if (sourceentity.getPersistentData().getDouble("pStrikes") == 1) {
				if (!world.isClientSide()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")), SoundSource.NEUTRAL,
									1, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")),
									SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
				}
				sourceentity.getPersistentData().putDouble("pStrikes", 2);
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(IntegratedmagicModMobEffects.PRECISE_STRIKES_3.get()) : false) {
			if (sourceentity.getPersistentData().getDouble("pStrikes") == 2) {
				if (!world.isClientSide()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")), SoundSource.NEUTRAL,
									1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")),
									SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				sourceentity.getPersistentData().putDouble("pStrikes", 3);
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(IntegratedmagicModMobEffects.PRECISE_STRIKES_4.get()) : false) {
			if (sourceentity.getPersistentData().getDouble("pStrikes") == 3) {
				if (!world.isClientSide()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")), SoundSource.NEUTRAL,
									1, (float) 1.2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("integratedmagic:ordo_impact")),
									SoundSource.NEUTRAL, 1, (float) 1.2, false);
						}
					}
				}
				sourceentity.getPersistentData().putDouble("pStrikes", 0);
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				sourceentity.getPersistentData().putDouble("pStrikes", 0);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 100);
	}
}
