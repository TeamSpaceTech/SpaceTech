package io.github.teamspacetech.spacetech.blocks;
import io.github.teamspacetech.spacetech.SpaceTech;
import io.github.teamspacetech.spacetech.items.ModResourceItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModResourceBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SpaceTech.MODID);

    // Resource Blocks | Ores
    public static final DeferredBlock<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SULFUR_ORE = registerBlock("sulfur_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TITANIUM_ORE = registerBlock("titanium_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(6f).requiresCorrectToolForDrops()));


    //stupid function to make the blocks work
    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ModResourceItems.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }
}


