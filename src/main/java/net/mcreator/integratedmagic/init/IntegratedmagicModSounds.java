
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.integratedmagic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntegratedmagicModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("integratedmagic", "vortexconjuration"),
				new SoundEvent(new ResourceLocation("integratedmagic", "vortexconjuration")));
		REGISTRY.put(new ResourceLocation("integratedmagic", "vortex_dispel"),
				new SoundEvent(new ResourceLocation("integratedmagic", "vortex_dispel")));
		REGISTRY.put(new ResourceLocation("integratedmagic", "fulgor_impact"),
				new SoundEvent(new ResourceLocation("integratedmagic", "fulgor_impact")));
		REGISTRY.put(new ResourceLocation("integratedmagic", "fulgor_cast"), new SoundEvent(new ResourceLocation("integratedmagic", "fulgor_cast")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
