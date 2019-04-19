package biofan.oresmod;

import biofan.oresmod.init.ModRecipes;
import biofan.oresmod.proxy.CommonProxy;
import biofan.oresmod.tabs.BioBlockTab;
import biofan.oresmod.tabs.BioMiscTab;
import biofan.oresmod.tabs.BioWeaponTab;
import biofan.oresmod.util.Reference;
import biofan.oresmod.util.handlers.RegistryHandler;
import biofan.oresmod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	//refer to main class by using the Main instance
	
	public static final CreativeTabs biotooltab = new BioWeaponTab("biotooltab");
	public static final CreativeTabs bioblocktab = new BioBlockTab("bioblocktab");
	public static final CreativeTabs biomisctab = new BioMiscTab("biomisctab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		RegistryHandler.otherRegistries();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		ModRecipes.init();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
}
