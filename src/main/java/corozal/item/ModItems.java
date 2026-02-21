package corozal.item;

import corozal.Corozal;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import corozal.item.custom.*;

public class ModItems {

    public static final Item AREPA = registerItem("arepa", new ArepaItem());

    public static final Item BOLON = registerItem("bolon", new BolonItem());
    
    public static final Item MAIZ_SEMILLA = registerItem("semilla_maiz", new SemillaMaizItem());
    
    public static final Item MAIZ = registerItem("maiz", new MaizItem());


    /**
     * Registra un item en el juego
     * @return El item registrado
     */
    private static Item registerItem(String name, Item item) {
        Item itemRegister = Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Corozal.MOD_ID, name), item);

        return itemRegister;
    }

    /**
     * Registra los Items de los mods
     */
    public static void registerModItems() {
        Corozal.LOGGER.info("Registrando Mod Items para " + Corozal.MOD_ID);
    }
}