package com.nexoner.kuzey.item;

import com.nexoner.kuzey.KuzeyMod;
import com.nexoner.kuzey.item.custom.KuzeyiumAxeItem;
import com.nexoner.kuzey.item.custom.KuzeyiumEnrichedCoalItem;
import com.nexoner.kuzey.item.custom.KuzeyiumSwordItem;
import com.nexoner.kuzey.item.custom.RegeneratorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KuzeyMod.MOD_ID);

    //Item register start

    public static final RegistryObject<Item> KUZEYIUM_INGOT = ITEMS.register("kuzeyium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_CHUNK = ITEMS.register("kuzeyium_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> RAW_KUZEYIUM = ITEMS.register("raw_kuzeyium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> REGENERATOR = ITEMS.register("regenerator",
            () -> new RegeneratorItem(new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB).durability(1).setNoRepair()));

    public static final RegistryObject<Item> KUZEYIUM_NUGGET = ITEMS.register("kuzeyium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_COAL = ITEMS.register("kuzeyium_coal",
            () -> new KuzeyiumEnrichedCoalItem(new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));


    public static final RegistryObject<Item> KUZEYIUM_SWORD = ITEMS.register("kuzeyium_sword",
            () -> new KuzeyiumSwordItem(ModTiers.KUZEYIUM_WEAPON, 10, 1f, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_AXE = ITEMS.register("kuzeyium_axe",
            () -> new KuzeyiumAxeItem(ModTiers.KUZEYIUM_TOOL, 4, 0f, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_PICKAXE = ITEMS.register("kuzeyium_pickaxe",
            () -> new PickaxeItem(ModTiers.KUZEYIUM_TOOL, 6, 0f, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_SHOVEL = ITEMS.register("kuzeyium_shovel",
            () -> new ShovelItem(ModTiers.KUZEYIUM_TOOL, 4, 0f, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));


    public static final RegistryObject<Item> KUZEYIUM_HELMET = ITEMS.register("kuzeyium_helmet",
            () -> new ArmorItem(ModArmorMaterials.KUZEYIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_CHESTPLATE = ITEMS.register("kuzeyium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.KUZEYIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_LEGGINGS = ITEMS.register("kuzeyium_leggings",
            () -> new ArmorItem(ModArmorMaterials.KUZEYIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static final RegistryObject<Item> KUZEYIUM_BOOTS = ITEMS.register("kuzeyium_boots",
            () -> new ArmorItem(ModArmorMaterials.KUZEYIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModTab.KUZEY_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
