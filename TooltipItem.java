package com.silicontent.tutorialmod.item;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public class TooltipItem extends Item {
    // key that points to the simple item's tooltip in a lang file
    public final String tooltipKey;

    public TooltipItem(Settings settings, String tooltipKey) {
        super(settings);
        // store the lang file key
        this.tooltipKey = tooltipKey;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        // add the lang file key specified in the constructor
        tooltip.add(Text.translatable(this.tooltipKey));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
