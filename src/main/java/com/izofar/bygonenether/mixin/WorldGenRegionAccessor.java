package com.izofar.bygonenether.mixin;

import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.StructureFeatureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(WorldGenRegion.class)
public interface WorldGenRegionAccessor {
    @Accessor("structureFeatureManager")
    StructureFeatureManager getStructureFeatureManager();
}
