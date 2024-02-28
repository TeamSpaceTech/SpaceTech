
package io.github.teamspacetech.spacetech;
import com.mojang.logging.LogUtils;
import io.github.teamspacetech.spacetech.blocks.ModResourceBlocks;
import io.github.teamspacetech.spacetech.core.tabs.SpaceTechCreativeModeTabs;
import io.github.teamspacetech.spacetech.items.ModResourceItems;
import io.github.teamspacetech.spacetech.items.ModToolsItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;


@Mod(SpaceTech.MODID)
public class SpaceTech {

    public static final String MODID = "spacetech";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpaceTech(IEventBus modEventBus) {
        SpaceTechCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        ModResourceBlocks.BLOCKS.register(modEventBus);
        ModResourceItems.ITEMS.register(modEventBus);
        ModToolsItems.ITEMS.register(modEventBus);






    }
}