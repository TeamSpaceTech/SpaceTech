package io.github.teamspacetech.spacetech.items;

import io.github.teamspacetech.spacetech.SpaceTech;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModToolsItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SpaceTech.MODID);

    // Tool Items | Weapons > Guns
    public static final DeferredItem<Item> HANDGUN = ITEMS.register("handgun", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> HANDGUN_MAG = ITEMS.register("handgun_mag_standard", () -> new Item(new Item.Properties().stacksTo(1)));

}
