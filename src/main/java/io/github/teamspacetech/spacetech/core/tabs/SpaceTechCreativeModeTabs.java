package io.github.teamspacetech.spacetech.core.tabs;

// these files can be anywhere, so I'm storing them under ''Core''

import io.github.teamspacetech.spacetech.SpaceTech;
import io.github.teamspacetech.spacetech.blocks.ModResourceBlocks;
import io.github.teamspacetech.spacetech.items.ModResourceItems;
import io.github.teamspacetech.spacetech.items.ModToolsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SpaceTechCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpaceTech.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RESOURCE_CREATIVE_TAB = CREATIVE_MODE_TABS.register("resource_creative_tab", () -> {
        CreativeModeTab.Builder spacetechresource = CreativeModeTab.builder();

        spacetechresource.displayItems((itemDisplayParameters, output) -> {
            ModResourceItems.ITEMS.getEntries()
                    .stream()
                    .map(DeferredHolder::get)
                    .forEach(output::accept);
            ModResourceBlocks.BLOCKS.getEntries()
                    .stream()
                    .map(DeferredHolder::get)
                    .forEach(output::accept);
            return;
        });
        spacetechresource.icon(() -> new ItemStack(ModResourceItems.SILVER_BAR.get()));
        spacetechresource.title(Component.translatable("creative_tab_resource.spacetech"));

        return spacetechresource.build();
    });
   public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOOLS_CREATIVE_TAB = CREATIVE_MODE_TABS.register("tools_creative_tab", () -> {
       CreativeModeTab.Builder spacetechtools = CreativeModeTab.builder();
       spacetechtools.displayItems((itemDisplayParameters, output) -> {
           ModToolsItems.ITEMS.getEntries()
                   .stream()
                   .map(DeferredHolder::get)
                   .forEach(output::accept);
           return;
       });
       spacetechtools.icon(() -> new ItemStack(ModToolsItems.HANDGUN.get()));
       spacetechtools.title(Component.translatable("creative_tab_tools.spacetech"));
       return spacetechtools.build();
   });
}
