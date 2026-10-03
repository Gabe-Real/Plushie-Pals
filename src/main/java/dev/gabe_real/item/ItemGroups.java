package dev.gabe_real.item;

import dev.gabe_real.Content;
import dev.gabe_real.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


    public class ItemGroups {
        public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(Content.MOD_ID, "ruby"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.plushies"))
                        .icon(() -> new ItemStack(ModBlocks.LUX_PLUSH)).entries((displayContext, entries) -> {

                            entries.add(ModBlocks.ALIEN_PLUSH);
                            entries.add(ModBlocks.ADMIN_MANDO_PLUSH);
                            entries.add(ModBlocks.AMY_PLUSH);
                            entries.add(ModBlocks.LUX_PLUSH);
                            entries.add(ModBlocks.ARATHAIN_PLUSH);
                            entries.add(ModBlocks.AUGUR_PLUSH);
                            entries.add(ModBlocks.BEN_PLUSH);
                            entries.add(ModBlocks.CHARTER_LUX_PLUSH);
                            entries.add(ModBlocks.CLOWN_PLUSH);
                            entries.add(ModBlocks.DIANSU_PLUSH);
                            entries.add(ModBlocks.EIGHTSIDEDSQUARE_PLUSH);
                            entries.add(ModBlocks.FINNSTRANGE_PLUSH);
                            entries.add(ModBlocks.FUNDY_PLUSH);
                            entries.add(ModBlocks.INKLING_PLUSH);
                            entries.add(ModBlocks.MANDO_PLUSH);
                            entries.add(ModBlocks.MORIYA_PLUSH);
                            entries.add(ModBlocks.MOUTHPIECE_PLUSH);
                            entries.add(ModBlocks.NOX_PLUSH);
                            entries.add(ModBlocks.TECHNO_PLUSH);
                            entries.add(ModBlocks.WAZOU_PLUSH);
                            entries.add(ModBlocks.WAZOU_PLUSH_TWO);
                            entries.add(ModBlocks.WINSWEEP_PLUSH);
                            entries.add(ModBlocks.YMPE_PLUSH);



                        }).build());


        public static void registerItemGroups() {
            Content.LOGGER.info("Registering Item Groups for " + Content.MOD_ID);
        }
    }

