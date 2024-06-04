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
import net.spell_power.api.SpellSchools;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public enum ValorArmorMaterials implements ArmorMaterial {
    PALADIN("paladin", 33, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_GOLD, 2.0f, 0.3f, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            SpellSchools.HEALING.attribute, new AttributeModifier("Healing", 10.0, Operation.ADDITION)
    )),
    WOODLAND_SPIRIT("woodland_spirit", 33, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_IRON, 2.0f, 0.1f, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            Attributes.ATTACK_SPEED, new AttributeModifier("Attack Speed", 0.05, Operation.MULTIPLY_BASE),
            SpellSchools.ARCANE.attribute, new AttributeModifier("Arcane", 10.0, Operation.ADDITION)
    )),
    ARISMAS_AWAKENING("arismas_awakening", 33, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.2f, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("Knockback Resistance", 0.05, Operation.MULTIPLY_BASE),
            SpellSchools.FIRE.attribute, new AttributeModifier("Fire", 10.0, Operation.ADDITION)
    )),
    REAPERS_EMBRACE("reapers_embrace", 5, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 3);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.1F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.05, Operation.MULTIPLY_BASE),
            SpellSchools.SOUL.attribute, new AttributeModifier("Soul", 10.0, Operation.ADDITION)
    )),
    ANCIENT_VANGUARD("ancient_vanguard", 30, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 0.3F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
            SpellSchools.LIGHTNING.attribute, new AttributeModifier("Lightning", 10.0, Operation.ADDITION),
            Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("Knockback Resistance", 0.05, Operation.MULTIPLY_BASE)
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

    ValorArmorMaterials(String pName, int pDurabilityMultiplier, EnumMap pProtectionFunctionForType, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier pRepairIngredient, Map additionalAttributes) {
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
        return HEALTH_FUNCTION_FOR_TYPE.get(type) * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionFunctionForType.get(type);

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
        return this.repairIngredient.get();
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
