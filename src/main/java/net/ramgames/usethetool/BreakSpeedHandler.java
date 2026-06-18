package net.ramgames.usethetool;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UseTheTool.MOD_ID)
public class BreakSpeedHandler {

    @SubscribeEvent
    public static void onBreakSpeed(PlayerEvent.BreakSpeed event) {
        Player player = event.getPlayer();
        if (!player.hasCorrectToolForDrops(event.getState())) {
            event.setNewSpeed(0.0F);
        }
    }
}
