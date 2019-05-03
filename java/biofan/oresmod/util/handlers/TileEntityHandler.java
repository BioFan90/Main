package biofan.oresmod.util.handlers;


import biofan.oresmod.blocks.tileentities.TileEntityCombinationFurnace;
import biofan.oresmod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCombinationFurnace.class, new ResourceLocation(Reference.MOD_ID + ":sintering_furnace"));
	}
}