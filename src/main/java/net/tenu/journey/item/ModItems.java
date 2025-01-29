package net.tenu.journey.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;
import net.tenu.journey.item.custom.ChiselItem;

import java.util.List;

public class ModItems {
    // TRINKETS

    // GADGETS

    // ITEMS
    public static final Item FOUR_LEAF_CLOVER = registerItem("four_leaf_clover", new Item(new Item.Settings()));
//    {
//        @Override
//        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
//        {
//            tooltip.add(Text.translatable("tooltip.journey.ring_of_fortitude.tooltip"));
//            super.appendTooltip(stack, context, tooltip, type);
//        }
//    }
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Journey.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Journey.LOGGER.info("Registering mod items for " + Journey.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            // TRINKETS

            // GADGETS
        });
    }
}
