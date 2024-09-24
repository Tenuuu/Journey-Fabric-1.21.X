package net.tenu.journey.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;

public class ModItems {
    public static final Item TEST = registerItem("test", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Journey.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Journey.LOGGER.info("Registering mod items for " + Journey.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST);
        });
    }
}
