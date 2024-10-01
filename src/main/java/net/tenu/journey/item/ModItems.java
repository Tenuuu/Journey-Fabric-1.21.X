package net.tenu.journey.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;

import java.util.List;

public class ModItems {
//    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
//    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item RING_OF_FORTITUDE = registerItem("ring_of_fortitude", new Item(new Item.Settings().maxCount(1)));
    public static final Item RING_OF_FORTITUDE_1 = registerItem("ring_of_fortitude_1", new Item(new Item.Settings().maxCount(1)));
    public static final Item RING_OF_FORTITUDE_2 = registerItem("ring_of_fortitude_2", new Item(new Item.Settings().maxCount(1)));
    public static final Item RING_OF_FORTITUDE_3 = registerItem("ring_of_fortitude_3", new Item(new Item.Settings().maxCount(1)));

    public static final Item GOLDEN_BRACER = registerItem("golden_bracer", new Item(new Item.Settings().maxCount(1)));
    public static final Item FOUR_LEAF_CLOVER = registerItem("four_leaf_clover", new Item(new Item.Settings()));
//    {
//        @Override
//        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
//        {
//            tooltip.add(Text.translatable("tooltip.journey.ring_of_fortitude.tooltip"));
//            super.appendTooltip(stack, context, tooltip, type);
//        }
//    }


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
            entries.add(RING_OF_FORTITUDE);
            entries.add(RING_OF_FORTITUDE_1);
            entries.add(RING_OF_FORTITUDE_2);
            entries.add(RING_OF_FORTITUDE_3);

            entries.add(GOLDEN_BRACER);
        });
    }
}
