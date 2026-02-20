package corozal.item;

import corozal.Corozal;
import corozal.item.custom.ArepaItem;
import corozal.item.custom.BolonItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item AREPA = registerItem("arepa", new ArepaItem());
    public static final Item BOLON = registerItem("bolon", new BolonItem());

    private static Item registerItem(String name, Item item) {
        Item itemRegister = Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Corozal.MOD_ID, name), item);

        return itemRegister;
    }

    public static void registerModItems() {
        Corozal.LOGGER.info("Registrando Mod Items para " + Corozal.MOD_ID);
    }
}