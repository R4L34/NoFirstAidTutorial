package com.r4l.nofirstaidtutorial.proxy;

import java.util.Objects;

import ichttt.mods.firstaid.api.CapabilityExtendedHealthSystem;
import ichttt.mods.firstaid.api.damagesystem.AbstractPlayerDamageModel;
import ichttt.mods.firstaid.common.CapProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
public class ClientProxy extends CommonProxy{

	
	@SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event)
    {
		EntityPlayer player = event.player;
		AbstractPlayerDamageModel damageModel = (AbstractPlayerDamageModel)Objects.<Object>requireNonNull(player.getCapability(CapabilityExtendedHealthSystem.INSTANCE, null));;
		if (!damageModel.hasTutorial) {
	        damageModel.hasTutorial = true;
	        CapProvider.tutorialDone.add(player.getName());
	      }

    }


}
