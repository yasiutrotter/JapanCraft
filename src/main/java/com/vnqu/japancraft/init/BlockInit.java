package com.vnqu.japancraft.init;

import com.vnqu.japancraft.JapanCraft;

import com.vnqu.japancraft.objects.blocks.SakuraSapling;
import com.vnqu.japancraft.objects.blocks.SakuraSlab;
import com.vnqu.japancraft.objects.blocks.SakuraStairs;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@ObjectHolder(JapanCraft.MOD_ID)
@Mod.EventBusSubscriber(modid = JapanCraft.MOD_ID, bus = Bus.MOD)
public class BlockInit
{
    public static final Block sakura_log = null;
    public static final Block sakura_leaves = null;
    public static final Block sakura_planks = null;
    public static final Block sakura_stairs = null;
    public static final Block sakura_slab = null;
    public static final Block sakura_sapling = null;
    //public static final Block shoji = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(JapanCraft.MOD_ID, "sakura_log"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(JapanCraft.MOD_ID, "sakura_planks"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)).setRegistryName(JapanCraft.MOD_ID, "sakura_leaves"));
        event.getRegistry().register(new SakuraStairs(Blocks.OAK_PLANKS.getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(JapanCraft.MOD_ID, "sakura_stairs"));
        event.getRegistry().register(new SakuraSlab(Blocks.OAK_PLANKS.getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(JapanCraft.MOD_ID, "sakura_slab"));
        event.getRegistry().register(new SakuraSapling(new OakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0F).sound(SoundType.PLANT)).setRegistryName(JapanCraft.MOD_ID, "sakura_sapling"));
        //event.getRegistry().register(new Shoji(Block.Properties.create(Material.CARPET).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH).harvestTool(ToolType.AXE)).setRegistryName(JapanCraft.MOD_ID, "shoji"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(sakura_log, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "sakura_log"));
        event.getRegistry().register(new BlockItem(sakura_planks, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "sakura_planks"));
        event.getRegistry().register(new BlockItem(sakura_leaves, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "sakura_leaves"));
        event.getRegistry().register(new BlockItem(sakura_stairs, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "sakura_stairs"));
        event.getRegistry().register(new BlockItem(sakura_slab, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "sakura_slab"));
        event.getRegistry().register(new BlockItem(sakura_sapling, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "sakura_sapling"));
        //event.getRegistry().register(new BlockItem(shoji, new Item.Properties().group(JapanCraft.JapanCraftBlocksGroup.instance)).setRegistryName(JapanCraft.MOD_ID, "shoji"));
    }
}
