package io.github.teamspacetech.spacetech.core.tabs;

import io.github.teamspacetech.spacetech.SpaceTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

// these files can be anywhere, so I'm storing them under ''Core''

//    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
//
// Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
//        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
//                .title(Component.translatable("itemGroup.spacetech")) //The language key for the title of your CreativeModeTab
//                .withTabsBefore(CreativeModeTabs.COMBAT)
//                .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
//                .displayItems((parameters, output) -> {
//                    output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
//                }).build());
//
//
//
