package fr.lleroy.mrchibrax;

import fr.lleroy.mrchibrax.item.ModItemGroups;
import fr.lleroy.mrchibrax.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MrChibrax implements ModInitializer {
	public static final String MOD_ID = "mrchibrax";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}