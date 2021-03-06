package coda.babyfat.init;

import coda.babyfat.BabyFat;
import coda.babyfat.items.BFSpawnEggItem;
import coda.babyfat.items.BallItem;
import coda.babyfat.items.RanchuBucketItem;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import vazkii.patchouli.api.BookEvent;

public class BFItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BabyFat.MOD_ID);

    public static final RegistryObject<Item> RANCHU = ITEMS.register("ranchu", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(1).saturationMod(0.2F).build()).tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> RANCHU_BUCKET = ITEMS.register("ranchu_bucket", () -> new RanchuBucketItem(BFEntities.RANCHU::get, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> RANCHU_SPAWN_EGG = ITEMS.register("ranchu_spawn_egg", () -> new BFSpawnEggItem(BFEntities.RANCHU, 0x736036, 0xd1a965, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> BALL = ITEMS.register("ball", () -> new BallItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> WATER_LETTUCE = ITEMS.register("water_lettuce", () -> new LilyPadItem(BFBlocks.WATER_LETTUCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
}
