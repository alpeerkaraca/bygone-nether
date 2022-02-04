package com.izofar.bygonenether.init;

import com.izofar.bygonenether.BygoneNetherMod;
import com.izofar.bygonenether.entity.ModPiglinBrute;
import com.izofar.bygonenether.entity.PiglinPrisonerEntity;
import com.izofar.bygonenether.entity.WarpedEnderManEntity;
import com.izofar.bygonenether.entity.WexEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public abstract class ModEntityTypes {

	public static final DeferredRegister<EntityType<?>> MOD_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, BygoneNetherMod.MODID);
	public static final DeferredRegister<EntityType<?>> VANILLA_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, "minecraft");
	
	public static final RegistryObject<EntityType<WexEntity>> WEX = MOD_ENTITY_TYPES.register("wex", () -> EntityType.Builder.<WexEntity>of(WexEntity::new, MobCategory.MONSTER).fireImmune().sized(0.4F, 0.8F).clientTrackingRange(8).build(new ResourceLocation(BygoneNetherMod.MODID, "wex").toString()));
	public static final RegistryObject<EntityType<WarpedEnderManEntity>> WARPED_ENDERMAN = MOD_ENTITY_TYPES.register("warped_enderman", () -> EntityType.Builder.<WarpedEnderManEntity>of(WarpedEnderManEntity::new, MobCategory.MONSTER).fireImmune().sized(0.6F, 2.9F).clientTrackingRange(8).build(new ResourceLocation(BygoneNetherMod.MODID, "warped_enderman").toString()));
	
	public static final RegistryObject<EntityType<PiglinPrisonerEntity>> PIGLIN_PRISONER = MOD_ENTITY_TYPES.register("piglin_prisoner", () -> EntityType.Builder.<PiglinPrisonerEntity>of(PiglinPrisonerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(new ResourceLocation(BygoneNetherMod.MODID, "piglin_prisoner").toString()));
	public static final RegistryObject<EntityType<ModPiglinBrute>> PIGLIN_BRUTE = VANILLA_ENTITY_TYPES.register("piglin_brute", () -> EntityType.Builder.<ModPiglinBrute>of(ModPiglinBrute::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(new ResourceLocation("minecraft:piglin_brute").toString()));
	
	public static void register(IEventBus eventBus) {
		MOD_ENTITY_TYPES.register(eventBus);
		VANILLA_ENTITY_TYPES.register(eventBus);
	}

}
