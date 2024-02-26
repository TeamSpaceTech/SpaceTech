package io.github.teamspacetech.spacetech.items;

import io.github.teamspacetech.spacetech.SpaceTech;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModResourceItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SpaceTech.MODID);

    public static final DeferredItem RAW_TITANIUM_ORE = ITEMS.register("raw_tungsten_ore", () -> new Item(new Item.Properties()));
}
