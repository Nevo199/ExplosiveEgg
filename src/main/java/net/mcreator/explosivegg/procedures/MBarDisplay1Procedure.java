package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;
import net.mcreator.explosivegg.init.ExplosiveggModItems;

public class MBarDisplay1Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (ExplosiveggModVariables.MapVariables.get(world).MTimer == 0
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == ExplosiveggModItems.HAT_HELMET.get()
				&& ExplosiveggModVariables.MapVariables.get(world).Minion == true) {
			return true;
		}
		return false;
	}
}
