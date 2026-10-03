package dev.gabe_real;

import dev.gabe_real.block.ModBlocks;
import dev.gabe_real.item.ItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Content implements ModInitializer {
	public static final String MOD_ID = "content";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ItemGroups.registerItemGroups();


		LOGGER.info("Hello Fabric world!");
	}
}