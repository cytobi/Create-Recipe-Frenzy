package de.simonklausner.createrecipefrenzy.item;

import de.simonklausner.createrecipefrenzy.CreateRecipeFrenzy;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateRecipeFrenzy.MODID);

    /* Example for Structure of adding new Items; add Item to creative tab via CreateRecipeFrenzy.java; add Name in lang and Texture in assets as in example.json
    public static final DeferredItem<Item> EXAMPLE = ITEMS.register("example",
        () -> new Item(new Item.Properties())
        );
    */

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
