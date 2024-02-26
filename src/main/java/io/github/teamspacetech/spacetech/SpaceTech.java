
package io.github.teamspacetech.spacetech;
import com.mojang.logging.LogUtils;
import io.github.teamspacetech.spacetech.items.ModResourceItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;


@Mod(SpaceTech.MODID)
public class SpaceTech {

    public static final String MODID = "spacetech";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpaceTech(IEventBus modEventBus) {
        ModResourceItems.ITEMS.register(modEventBus);



    }
}