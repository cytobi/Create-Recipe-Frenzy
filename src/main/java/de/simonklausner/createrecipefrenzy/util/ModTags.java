package de.simonklausner.createrecipefrenzy.util;

import de.simonklausner.createrecipefrenzy.CreateRecipeFrenzy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> EXAMPLE_BLOCK_TAG = createTag("example_block_tag");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CreateRecipeFrenzy.MODID, name));
        }
    }

    public static class Items {
        //public static final TagKey<Item> EXAMPLE_ITEM_TAG = createTag("example_item_tag");
        public static final TagKey<Item> STONETYPE_MARBLE = createTag("stonetype_marble");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CreateRecipeFrenzy.MODID, name));
        }
    }
}
