package net.tenu.journey.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;
import net.tenu.journey.item.armor.BaseArmorItem;

public class ModItems {

    // ARMOR
    public static final Item SPLENDID_ROBE_CHESTPLATE = registerItem("splendid_robe_chestplate",
            new BaseArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Settings(), "splendid_robe"));

    public static final Item CITY_DEFENDER_HELMET = registerItem("city_defender_helmet",
            new BaseArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Settings(), "city_defender"));
    public static final Item CITY_DEFENDER_CHESTPLATE = registerItem("city_defender_chestplate",
            new BaseArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Settings(), "city_defender"));
    public static final Item CITY_DEFENDER_LEGGINGS = registerItem("city_defender_leggings",
            new BaseArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Settings(), "city_defender"));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Journey.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Journey.LOGGER.info("Registering mod items for " + Journey.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

        });
    }
}
