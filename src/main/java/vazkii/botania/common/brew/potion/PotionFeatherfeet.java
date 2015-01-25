/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Nov 3, 2014, 12:12:04 AM (GMT)]
 */
package vazkii.botania.common.brew.potion;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import vazkii.botania.common.lib.LibPotionNames;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PotionFeatherfeet extends PotionMod {

	public PotionFeatherfeet() {
		super(LibPotionNames.FEATHER_FEET, false, 0x26ADFF, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		EntityLivingBase e = event.entityLiving;
		if(hasEffect(e))
			e.fallDistance = 0F;
	}

}
