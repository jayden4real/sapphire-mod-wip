package net.jayden.modtesting1002003;

import net.fabricmc.api.ModInitializer;

import net.jayden.modtesting1002003.item.ModItemGroups;
import net.jayden.modtesting1002003.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "modtesting1002003";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}