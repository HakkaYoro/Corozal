package corozal;

import corozal.block.ModBlocks;
import corozal.item.ModItemGroups;
import corozal.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Corozal implements ModInitializer {
	public static final String MOD_ID = "corozal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Inicializando Corozal - ¡Sabor Latino en Fabric!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}