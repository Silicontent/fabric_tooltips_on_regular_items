# Tooltips on Simple Items - Fabric (Minecraft 1.20.6)
This repo contains a Java class called "TooltipItem." This class creates a simple item with no extra features except for a custom tooltip.
When creating an item that has a tooltip, it should be formatted like so:

`public static final Item RUBY = registerItem("ruby", new TooltipItem(new Item.Settings(), "tooltip.tutorialmod.ruby.tooltip"));`

As demonstrated above, a new TooltipItem is created, passing along with it a lang file key that points towards the actual tooltip. There is likely a better way to address this problem, but this is just what I came up with.
If you have any questions, please let me know. I hope this helps!
