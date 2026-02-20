package corozal.item;

import corozal.Corozal;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import corozal.item.custom.ArepaItem;

public class ModItems {
    public static final Item AREPA = registerItem("arepa", new ArepaItem(new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Corozal.MOD_ID, "arepa")))));

    // Método auxiliar para registrar un ítem normal.
    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Corozal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Corozal.LOGGER.info("Registrando Mod Items para " + Corozal.MOD_ID);

        // Aquí agregaremos todos los ítems a los Item Groups nativos o personalizados
        // más tarde.
    }
}
