package com.vnqu.japancraft.init;

        import com.vnqu.japancraft.JapanCraft;
        import net.minecraft.item.Food;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemGroup;
        import net.minecraftforge.event.RegistryEvent;
        import net.minecraftforge.eventbus.api.SubscribeEvent;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = JapanCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(JapanCraft.MOD_ID)
public class ItemInit
{
    public static final Item nori_leaf = null;
    //public static final Item cherry = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(JapanCraft.MOD_ID, "nori_leaf"));
        //event.getRegistry().register(new Item(new Item.Properties().group(JapanCraft.JapanCraftFoodGroup.instance).food(new Food.Builder().hunger())));
    }
}
