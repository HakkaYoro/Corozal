package corozal.block;

import corozal.Corozal;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import corozal.block.custom.MaizBlock;

public class ModBlocks {
    // Comentario util
    public static final Block MAIZ = registerBlock("maiz", new MaizBlock());

    // Método auxiliar para registrar un bloque sin BlockItem (como cultivos puros)
    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Corozal.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Corozal.LOGGER.info("Registrando Mod Blocks para " + Corozal.MOD_ID);
    }
}
