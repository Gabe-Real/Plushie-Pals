package dev.gabe_real.block;

import dev.gabe_real.Content;
import dev.gabe_real.block.custom.PlushBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Plush
    public static final Block LUX_PLUSH = registerBlock("lux_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).nonOpaque().requiresTool()));

    public static final Block CHARTER_LUX_PLUSH = registerBlock("charter_lux_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).nonOpaque().requiresTool()));

    public static final Block NOX_PLUSH = registerBlock("nox_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).nonOpaque().requiresTool()));

    public static final Block TECHNO_PLUSH = registerBlock("techno_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).nonOpaque().requiresTool()));

    public static final Block DIANSU_PLUSH = registerBlock("diansu_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).nonOpaque().requiresTool()));

    public static final Block FUNDY_PLUSH = registerBlock("fundy_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).nonOpaque().requiresTool()));

    public static final Block BEN_PLUSH = registerBlock("ben_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).nonOpaque().requiresTool()));

    public static final Block MOUTHPIECE_PLUSH = registerBlock("mouthpiece_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).nonOpaque().requiresTool()));

    public static final Block MANDO_PLUSH = registerBlock("mando_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).nonOpaque().requiresTool()));

    public static final Block ALIEN_PLUSH = registerBlock("alien_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL).nonOpaque().requiresTool()));

    public static final Block YMPE_PLUSH = registerBlock("ympe_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).nonOpaque().requiresTool()));

    public static final Block CLOWN_PLUSH = registerBlock("clown_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).nonOpaque().requiresTool()));

    public static final Block WAZOU_PLUSH_TWO = registerBlock("wazou_plush_two",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).nonOpaque().requiresTool()));

    public static final Block WAZOU_PLUSH = registerBlock("wazou_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).nonOpaque().requiresTool()));

    public static final Block ARATHAIN_PLUSH = registerBlock("arathain_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).nonOpaque().requiresTool()));

    public static final Block ADMIN_MANDO_PLUSH = registerBlock("admin_mando_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).nonOpaque().requiresTool()));

    public static final Block FINNSTRANGE_PLUSH = registerBlock("finnstrange_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).nonOpaque().requiresTool()));

    public static final Block AUGUR_PLUSH = registerBlock("augur_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).nonOpaque().requiresTool()));

    public static final Block MORIYA_PLUSH = registerBlock("moriya_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).nonOpaque().requiresTool()));

    public static final Block INKLING_PLUSH = registerBlock("inkling_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).nonOpaque().requiresTool()));

    public static final Block WINSWEEP_PLUSH = registerBlock("winsweep_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).nonOpaque().requiresTool()));

    public static final Block EIGHTSIDEDSQUARE_PLUSH = registerBlock("eightsidedsquare_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).nonOpaque().requiresTool()));

    public static final Block AMY_PLUSH = registerBlock("amy_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).nonOpaque().requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Content.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Content.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Content.LOGGER.info("Registering ModBlocks for " + Content.MOD_ID);
    }
}
