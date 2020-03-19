package com.vnqu.japancraft.objects.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class Shoji extends Block
{

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 8.5, 16, 32, 9),
            Block.makeCuboidShape(1, 0, 7.75, 15, 5, 8.75),
            Block.makeCuboidShape(0, 0, 8.25, 1, 32, 9.25),
            Block.makeCuboidShape(1, 0, 8.25, 15, 5, 9.25),
            Block.makeCuboidShape(1, 10, 8.25, 15, 11, 9.25),
            Block.makeCuboidShape(1, 16, 8.25, 15, 17, 9.25),
            Block.makeCuboidShape(1, 21, 8.25, 15, 22, 9.25),
            Block.makeCuboidShape(1, 26, 8.25, 15, 27, 9.25),
            Block.makeCuboidShape(1, 31, 8.25, 15, 32, 9.25),
            Block.makeCuboidShape(15, 0, 8.25, 16, 32, 9.25),
            Block.makeCuboidShape(12, 5, 8.25, 13, 31, 9.25),
            Block.makeCuboidShape(9, 5, 8.25, 10, 31, 9.25),
            Block.makeCuboidShape(6, 5, 8.25, 7, 31, 9.25),
            Block.makeCuboidShape(3, 5, 8.25, 4, 31, 9.25),
            Block.makeCuboidShape(0, 0, 8.25, 1, 32, 9.25),
            Block.makeCuboidShape(3, 5, 7.75, 4, 31, 8.75),
            Block.makeCuboidShape(6, 5, 7.75, 7, 31, 8.75),
            Block.makeCuboidShape(9, 5, 7.75, 10, 31, 8.75),
            Block.makeCuboidShape(12, 5, 7.75, 13, 31, 8.75),
            Block.makeCuboidShape(15, 0, 7.75, 16, 32, 8.75),
            Block.makeCuboidShape(1, 31, 7.75, 15, 32, 8.75),
            Block.makeCuboidShape(1, 26, 7.75, 15, 27, 8.75),
            Block.makeCuboidShape(1, 21, 7.75, 15, 22, 8.75),
            Block.makeCuboidShape(1, 16, 7.75, 15, 17, 8.75),
            Block.makeCuboidShape(1, 10, 7.75, 15, 11, 8.75)).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 8.5, 16, 32, 9),
            Block.makeCuboidShape(1, 0, 7.75, 15, 5, 8.75),
            Block.makeCuboidShape(0, 0, 8.25, 1, 32, 9.25),
            Block.makeCuboidShape(1, 0, 8.25, 15, 5, 9.25),
            Block.makeCuboidShape(1, 10, 8.25, 15, 11, 9.25),
            Block.makeCuboidShape(1, 16, 8.25, 15, 17, 9.25),
            Block.makeCuboidShape(1, 21, 8.25, 15, 22, 9.25),
            Block.makeCuboidShape(1, 26, 8.25, 15, 27, 9.25),
            Block.makeCuboidShape(1, 31, 8.25, 15, 32, 9.25),
            Block.makeCuboidShape(15, 0, 8.25, 16, 32, 9.25),
            Block.makeCuboidShape(12, 5, 8.25, 13, 31, 9.25),
            Block.makeCuboidShape(9, 5, 8.25, 10, 31, 9.25),
            Block.makeCuboidShape(6, 5, 8.25, 7, 31, 9.25),
            Block.makeCuboidShape(3, 5, 8.25, 4, 31, 9.25),
            Block.makeCuboidShape(0, 0, 8.25, 1, 32, 9.25),
            Block.makeCuboidShape(3, 5, 7.75, 4, 31, 8.75),
            Block.makeCuboidShape(6, 5, 7.75, 7, 31, 8.75),
            Block.makeCuboidShape(9, 5, 7.75, 10, 31, 8.75),
            Block.makeCuboidShape(12, 5, 7.75, 13, 31, 8.75),
            Block.makeCuboidShape(15, 0, 7.75, 16, 32, 8.75),
            Block.makeCuboidShape(1, 31, 7.75, 15, 32, 8.75),
            Block.makeCuboidShape(1, 26, 7.75, 15, 27, 8.75),
            Block.makeCuboidShape(1, 21, 7.75, 15, 22, 8.75),
            Block.makeCuboidShape(1, 16, 7.75, 15, 17, 8.75),
            Block.makeCuboidShape(1, 10, 7.75, 15, 11, 8.75)).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(7, 0, 0, 7.5, 32, 16),
            Block.makeCuboidShape(7.25, 0, 1, 8.25, 5, 15),
            Block.makeCuboidShape(6.75, 0, 0, 7.75, 32, 1),
            Block.makeCuboidShape(6.75, 0, 1, 7.75, 5, 15),
            Block.makeCuboidShape(6.75, 10, 1, 7.75, 11, 15),
            Block.makeCuboidShape(6.75, 16, 1, 7.75, 17, 15),
            Block.makeCuboidShape(6.75, 21, 1, 7.75, 22, 15),
            Block.makeCuboidShape(6.75, 26, 1, 7.75, 27, 15),
            Block.makeCuboidShape(6.75, 31, 1, 7.75, 32, 15),
            Block.makeCuboidShape(6.75, 0, 15, 7.75, 32, 16),
            Block.makeCuboidShape(6.75, 5, 12, 7.75, 31, 13),
            Block.makeCuboidShape(6.75, 5, 9, 7.75, 31, 10),
            Block.makeCuboidShape(6.75, 5, 6, 7.75, 31, 7),
            Block.makeCuboidShape(6.75, 5, 3, 7.75, 31, 4),
            Block.makeCuboidShape(6.75, 0, 0, 7.75, 32, 1),
            Block.makeCuboidShape(7.25, 5, 3, 8.25, 31, 4),
            Block.makeCuboidShape(7.25, 5, 6, 8.25, 31, 7),
            Block.makeCuboidShape(7.25, 5, 9, 8.25, 31, 10),
            Block.makeCuboidShape(7.25, 5, 12, 8.25, 31, 13),
            Block.makeCuboidShape(7.25, 0, 15, 8.25, 32, 16),
            Block.makeCuboidShape(7.25, 31, 1, 8.25, 32, 15),
            Block.makeCuboidShape(7.25, 26, 1, 8.25, 27, 15),
            Block.makeCuboidShape(7.25, 21, 1, 8.25, 22, 15),
            Block.makeCuboidShape(7.25, 16, 1, 8.25, 17, 15),
            Block.makeCuboidShape(7.25, 10, 1, 8.25, 11, 15)).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(7, 0, 0, 7.5, 32, 16),
            Block.makeCuboidShape(7.25, 0, 1, 8.25, 5, 15),
            Block.makeCuboidShape(6.75, 0, 0, 7.75, 32, 1),
            Block.makeCuboidShape(6.75, 0, 1, 7.75, 5, 15),
            Block.makeCuboidShape(6.75, 10, 1, 7.75, 11, 15),
            Block.makeCuboidShape(6.75, 16, 1, 7.75, 17, 15),
            Block.makeCuboidShape(6.75, 21, 1, 7.75, 22, 15),
            Block.makeCuboidShape(6.75, 26, 1, 7.75, 27, 15),
            Block.makeCuboidShape(6.75, 31, 1, 7.75, 32, 15),
            Block.makeCuboidShape(6.75, 0, 15, 7.75, 32, 16),
            Block.makeCuboidShape(6.75, 5, 12, 7.75, 31, 13),
            Block.makeCuboidShape(6.75, 5, 9, 7.75, 31, 10),
            Block.makeCuboidShape(6.75, 5, 6, 7.75, 31, 7),
            Block.makeCuboidShape(6.75, 5, 3, 7.75, 31, 4),
            Block.makeCuboidShape(6.75, 0, 0, 7.75, 32, 1),
            Block.makeCuboidShape(7.25, 5, 3, 8.25, 31, 4),
            Block.makeCuboidShape(7.25, 5, 6, 8.25, 31, 7),
            Block.makeCuboidShape(7.25, 5, 9, 8.25, 31, 10),
            Block.makeCuboidShape(7.25, 5, 12, 8.25, 31, 13),
            Block.makeCuboidShape(7.25, 0, 15, 8.25, 32, 16),
            Block.makeCuboidShape(7.25, 31, 1, 8.25, 32, 15),
            Block.makeCuboidShape(7.25, 26, 1, 8.25, 27, 15),
            Block.makeCuboidShape(7.25, 21, 1, 8.25, 22, 15),
            Block.makeCuboidShape(7.25, 16, 1, 8.25, 17, 15),
            Block.makeCuboidShape(7.25, 10, 1, 8.25, 11, 15)).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Shoji(Properties properties)
    {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING)) {
        case NORTH:
            return SHAPE_N;
        case SOUTH:
            return SHAPE_S;
        case EAST:
            return SHAPE_E;
        case WEST:
            return SHAPE_W;
        default:
            return SHAPE_N;

        }

    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return super.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

}
