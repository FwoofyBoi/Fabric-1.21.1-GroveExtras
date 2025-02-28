package net.fwoofyboi.groveextras.sound;

import net.fwoofyboi.groveextras.GroveExtras;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent CORAL_REEF = registerSoundEvent("coral_reef");
    public static final RegistryKey<JukeboxSong> CORAL_REEF_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GroveExtras.MOD_ID, "coral_reef"));

    public static final SoundEvent WANDER = registerSoundEvent("wander");
    public static final RegistryKey<JukeboxSong> WANDER_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GroveExtras.MOD_ID, "wander"));

    public static final SoundEvent UPLOAD = registerSoundEvent("upload");
    public static final RegistryKey<JukeboxSong> UPLOAD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GroveExtras.MOD_ID, "upload"));

    public static final SoundEvent TOXIC = registerSoundEvent("toxic");
    public static final RegistryKey<JukeboxSong> TOXIC_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GroveExtras.MOD_ID, "toxic"));

    public static final SoundEvent GLACIER = registerSoundEvent("glacier");
    public static final RegistryKey<JukeboxSong> GLACIER_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GroveExtras.MOD_ID, "glacier"));

    public static final SoundEvent DUNES = registerSoundEvent("dunes");
    public static final RegistryKey<JukeboxSong> DUNES_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(GroveExtras.MOD_ID, "dunes"));



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(GroveExtras.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        GroveExtras.LOGGER.info("Registering Mod Sounds for " + GroveExtras.MOD_ID);
    }

}
