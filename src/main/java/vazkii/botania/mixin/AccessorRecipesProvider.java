package vazkii.botania.mixin;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.RecipesProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.Tag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(RecipesProvider.class)
public interface AccessorRecipesProvider {
	@Invoker
	static InventoryChangedCriterion.Conditions callConditionsFromItem(ItemConvertible item) {
		throw new IllegalStateException("");
	}

	@Invoker
	static InventoryChangedCriterion.Conditions callConditionsFromTag(Tag<Item> tag) {
		throw new IllegalStateException("");
	}
}