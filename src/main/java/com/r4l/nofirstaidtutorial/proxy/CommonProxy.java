package com.r4l.nofirstaidtutorial.proxy;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	public void subscribeHandler() {
		MinecraftForge.EVENT_BUS.register(this);

	}
}
