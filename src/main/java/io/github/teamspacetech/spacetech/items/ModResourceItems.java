package io.github.teamspacetech.spacetech.items;

import io.github.teamspacetech.spacetech.SpaceTech;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModResourceItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SpaceTech.MODID);

    // Resource Items | Raw Ores
    public static final DeferredItem<Item> RAW_ALUMINUM_ORE = ITEMS.register("raw_aluminium_ore", () -> new Item(new Item.Properties())); // Al-13
    public static final DeferredItem<Item> RAW_SULFUR_CRYSTAL = ITEMS.register("raw_sulfur_crystal", () -> new Item(new Item.Properties())); // S-16
    public static final DeferredItem<Item> RAW_TITANIUM_ORE = ITEMS.register("raw_titanium_ore", () -> new Item(new Item.Properties())); // Ti-22
    public static final DeferredItem<Item> RAW_SILVER_ORE = ITEMS.register("raw_silver_ore", () -> new Item(new Item.Properties())); // Ag-47
    public static final DeferredItem<Item> RAW_TUNGSTEN_ORE = ITEMS.register("raw_tungsten_ore", () -> new Item(new Item.Properties())); // W-74
    public static final DeferredItem<Item> RAW_LEAD_ORE = ITEMS.register("raw_lead_ore", () -> new Item(new Item.Properties())); // Pb-82



    // Resource Items | Smelted Ores

    public static final DeferredItem<Item> ALUMINIUM_BAR = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties())); // Al-13
    //sulfur doesnt have any smelted form?
    public static final DeferredItem<Item> TITANIUM_BAR = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties())); // Ti-22
    public static final DeferredItem<Item> SILVER_BAR = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties())); // Ag-47
    public static final DeferredItem<Item> TUNGSTEN_BAR = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties())); // W-74
    public static final DeferredItem<Item> LEAD_BAR = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties())); // Pb-82


}
