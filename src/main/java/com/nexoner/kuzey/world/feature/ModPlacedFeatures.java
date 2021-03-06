package com.nexoner.kuzey.world.feature;


import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.heightproviders.VeryBiasedToBottomHeight;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> KUZEYIAN_PLACED = PlacementUtils.register("kuzeyian_placed",
            ModConfiguredFeatures.KUZEYIAN_SPAWN,RarityFilter.onAverageOnceEvery(200), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE);

    public static final Holder<PlacedFeature> KUZEYIUM_ORE_PLACED = PlacementUtils.register("kuzeyium_ore_placed",
            ModConfiguredFeatures.KUZEYIUM_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.of(VeryBiasedToBottomHeight.of(VerticalAnchor.aboveBottom(15),VerticalAnchor.aboveBottom(50),25))));

}
