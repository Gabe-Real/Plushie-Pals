package dev.gabe_real.sound;

import dev.gabe_real.Content;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static SoundEvent PLUSH_HONK_1 = registerSoundEvent("plush_honk_1");
    public static SoundEvent PLUSH_HONK_2 = registerSoundEvent("plush_honk_2");
    public static SoundEvent PLUSH_HONK_3 = registerSoundEvent("plush_honk_3");
    public static SoundEvent RUBBER_DUCK = registerSoundEvent("rubber_duck");
    public static SoundEvent WINSWEEP_PLUSH_HONKS = registerSoundEvent("winsweep_plush_honks");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Content.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Content.LOGGER.info("Registering Sounds for " + Content.MOD_ID);
    }
}