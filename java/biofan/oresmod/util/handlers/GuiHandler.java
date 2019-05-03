package biofan.oresmod.util.handlers;


import biofan.oresmod.blocks.container.ContainerCombinationFurnace;
import biofan.oresmod.blocks.gui.GuiCombinationFurnace;
import biofan.oresmod.blocks.tileentities.TileEntityCombinationFurnace;
import biofan.oresmod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_COMBINATION_FURNACE) return new ContainerCombinationFurnace(player.inventory, (TileEntityCombinationFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_COMBINATION_FURNACE) return new GuiCombinationFurnace(player.inventory, (TileEntityCombinationFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}
}