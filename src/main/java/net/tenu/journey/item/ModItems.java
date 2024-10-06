package net.tenu.journey.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;

import java.util.List;

public class ModItems {
    // TRINKETS (DEPRECATED)
    // public static final Item RING_OF_FORTITUDE = registerItem("ring_of_fortitude", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_FORTITUDE_1 = registerItem("ring_of_fortitude_1", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_FORTITUDE_2 = registerItem("ring_of_fortitude_2", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_FORTITUDE_3 = registerItem("ring_of_fortitude_3", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_KNOWLEDGE = registerItem("ring_of_knowledge", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_KNOWLEDGE_1 = registerItem("ring_of_knowledge_1", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_KNOWLEDGE_2 = registerItem("ring_of_knowledge_2", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_KNOWLEDGE_3 = registerItem("ring_of_knowledge_3", new Item(new Item.Settings().maxCount(1)));
    // public static final Item GOLDEN_BRACER = registerItem("golden_bracer", new Item(new Item.Settings().maxCount(1)));
    // public static final Item RING_OF_GREED = registerItem("ring_of_greed", new Item(new Item.Settings().maxCount(1)));
    // public static final Item SYNERGY = registerItem("synergy", new Item(new Item.Settings().maxCount(1)));

    // GADGETS
    public static final Item LIGHT_FEATHER = registerItem("light_feather", new Item(new Item.Settings().maxCount(1)));
    public static final Item WIND_JUMP = registerItem("wind_jump", new Item(new Item.Settings().maxCount(1)));
    public static final Item TOTEM_OF_REGENERATION = registerItem("totem_of_regeneration", new Item(new Item.Settings().maxCount(1)));
    public static final Item GRAPPLING_HOOK = registerItem("grappling_hook", new Item(new Item.Settings().maxCount(1)));
    public static final Item GONG_OF_WEAKENING = registerItem("gong_of_weakening", new Item(new Item.Settings().maxCount(1)));
    public static final Item BOOTS_OF_SWIFTNESS = registerItem("boots_of_swiftness", new Item(new Item.Settings().maxCount(1)));
    public static final Item TOTEM_OF_SHIELDING = registerItem("totem_of_shielding", new Item(new Item.Settings().maxCount(1)));
    public static final Item WIND_HORN = registerItem("wind_horn", new Item(new Item.Settings().maxCount(1)));
    public static final Item DEATH_CAP_MUSHROOM = registerItem("death_cap_mushroom", new Item(new Item.Settings().maxCount(1)));
    public static final Item GHOST_CLOAK = registerItem("ghost_cloak", new Item(new Item.Settings().maxCount(1)));

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
//    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
//    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Journey.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Journey.LOGGER.info("Registering mod items for " + Journey.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//          entries.add(PINK_GARNET);
//          entries.add(RAW_PINK_GARNET);
            entries.add(FOUR_LEAF_CLOVER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            // TRINKETS (DEPRECATED)
            // entries.add(RING_OF_FORTITUDE);
            // entries.add(RING_OF_FORTITUDE_1);
            // entries.add(RING_OF_FORTITUDE_2);
            // entries.add(RING_OF_FORTITUDE_3);
            // entries.add(GOLDEN_BRACER);
            // entries.add(RING_OF_GREED);
            // entries.add(RING_OF_KNOWLEDGE);
            // entries.add(RING_OF_KNOWLEDGE_1);
            // entries.add(RING_OF_KNOWLEDGE_2);
            // entries.add(RING_OF_KNOWLEDGE_3);
            // entries.add(SYNERGY);

            // GADGETS
            entries.add(LIGHT_FEATHER);
            entries.add(WIND_JUMP);
            entries.add(TOTEM_OF_REGENERATION);
            entries.add(GRAPPLING_HOOK);
            entries.add(GONG_OF_WEAKENING);
            entries.add(BOOTS_OF_SWIFTNESS);
            entries.add(TOTEM_OF_SHIELDING);
            entries.add(WIND_HORN);
            entries.add(DEATH_CAP_MUSHROOM);
            entries.add(GHOST_CLOAK);
        });
    }
}
