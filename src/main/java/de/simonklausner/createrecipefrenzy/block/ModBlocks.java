package de.simonklausner.createrecipefrenzy.block;

import de.simonklausner.createrecipefrenzy.CreateRecipeFrenzy;
import de.simonklausner.createrecipefrenzy.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CreateRecipeFrenzy.MODID);

    /* Example for Structure of adding new Blocks; add Item to creative tab via CreateRecipeFrenzy.java; add Name in lang; Blockstate and models in assets folder as in example_block.json
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock("example_block", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );*/
    public static final DeferredBlock<Block> DOLOMITE = registerBlock("dolomite", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> BLACK_MARBLE = registerBlock("black_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> BROWN_MARBLE = registerBlock("brown_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> GRAY_MARBLE = registerBlock("gray_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> GREEN_MARBLE = registerBlock("green_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> LUMINOUS_MARBLE = registerBlock("luminous_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .lightLevel(p_152686_ -> 5)
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> RED_MARBLE = registerBlock("red_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> WHITE_MARBLE = registerBlock("white_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> YELLOW_MARBLE = registerBlock("yellow_marble", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F))
        );
    public static final DeferredBlock<Block> PYRITE_BLOCK = registerBlock("pyrite_block", 
        () -> new Block (BlockBehaviour.Properties.of()
                .mapColor(MapColor.GOLD)
                .instrument(NoteBlockInstrument.BELL)
                .requiresCorrectToolForDrops()
                .strength(3.0F, 6.0F)
                .sound(SoundType.METAL))
        );
    

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){ //helper method to register block item
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
