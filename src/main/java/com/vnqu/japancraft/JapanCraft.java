package com.vnqu.japancraft;

import com.vnqu.japancraft.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("japancraft")
public class JapanCraft {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "japancraft";
    public static JapanCraft instance;


    public JapanCraft()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    private void onServerStarting(FMLServerStartingEvent event)
    {

    }

    public static class JapanCraftBlocksGroup extends ItemGroup
    {
        public static final JapanCraftBlocksGroup instance = new JapanCraftBlocksGroup(ItemGroup.GROUPS.length, "japancraftblocktab");

        private JapanCraftBlocksGroup(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.sakura_log);
        }
    }
}
