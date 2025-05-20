package net.tenu.journey.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;
import net.tenu.journey.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup JOURNEY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Journey.MOD_ID, "journey_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.journey.journey_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.FOUR_LEAF_CLOVER);
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.STARLIGHT_ASHES);
                        entries.add(ModItems.SPLENDID_ROBE_CHESTPLATE);
                        entries.add(ModItems.CITY_DEFENDER_HELMET);
                        entries.add(ModItems.CITY_DEFENDER_CHESTPLATE);
                        entries.add(ModItems.CITY_DEFENDER_LEGGINGS);
                    }).build());

    public static final ItemGroup JOURNEY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Journey.MOD_ID, "journey_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.journey.journey_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Journey.LOGGER.info("Registering item groups for " + Journey.MOD_ID);
    }
}
