package net.pixeldreamstudios.gearofvalor.item.armor;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public enum ValorArmorMaterial implements ArmorMaterial {
    PALADIN("paladin", 28, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 20, SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 0.1F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", -0.05, Operation.MULTIPLY_BASE)
    )),
    WOODLAND_SPIRIT("woodland_spirit", 28, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 20, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.1F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
    Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", -0.05, Operation.MULTIPLY_BASE)
    )),
    ARISMAS_AWAKENING("arismas_awakening", 28, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.0F, 0.1F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", -0.05, Operation.MULTIPLY_BASE)
    )),
    REAPERS_EMBRACE("reapers_embrace", 28, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 20, SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.1F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", -0.05, Operation.MULTIPLY_BASE)
    ));

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private final Map<Attribute, AttributeModifier> additionalAttributes;

    private ValorArmorMaterial(String pName, int pDurabilityMultiplier, EnumMap pProtectionFunctionForType, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier pRepairIngredient, Map additionalAttributes) {
        this.name = "diamond";
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionFunctionForType = pProtectionFunctionForType;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue(pRepairIngredient);
        this.additionalAttributes = additionalAttributes;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return (Integer)HEALTH_FUNCTION_FOR_TYPE.get(type) * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return (Integer)this.protectionFunctionForType.get(type);

    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public Map<Attribute, AttributeModifier> getAdditionalAttributes() {
        return this.additionalAttributes;
    }
}
