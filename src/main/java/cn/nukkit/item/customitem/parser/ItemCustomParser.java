package cn.nukkit.item.customitem.parser;

import cn.nukkit.item.Item;
import cn.nukkit.item.customitem.*;
import cn.nukkit.item.customitem.data.ItemCreativeGroup;
import cn.nukkit.item.customitem.parser.data.ItemComponentData;
import cn.nukkit.item.customitem.parser.data.ItemDescriptionData;
import cn.nukkit.item.customitem.parser.data.ItemRegistryData;

/**
 * @author glorydark
 */
public class ItemCustomParser {

    public static void registerCustomItem(ItemRegistryData itemRegistryData) {
        CustomItem itemCustom = null;
        ItemComponentData itemComponentData = itemRegistryData.getItemComponent();
        ItemDescriptionData itemDescriptionData = itemRegistryData.getItemDescription();
        ItemCreativeGroup group = ItemCreativeGroup.valueOf(itemDescriptionData.getGroup());
        switch (group) {
            case HELMET:
                itemCustom = new ItemCustomArmor(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.armorBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isHelmet() {
                        return true;
                    }
                };
                break;
            case CHESTPLATE:
                itemCustom = new ItemCustomArmor(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.armorBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isChestplate() {
                        return true;
                    }
                };
                break;
            case LEGGINGS:
                itemCustom = new ItemCustomArmor(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.armorBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isLeggings() {
                        return true;
                    }
                };
                break;
            case BOOTS:
                itemCustom = new ItemCustomArmor(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.armorBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isBoots() {
                        return true;
                    }
                };
                break;
            case SWORD:
                itemCustom = new ItemCustomTool(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.toolBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isSword() {
                        return true;
                    }
                };
                break;
            case AXE:
                itemCustom = new ItemCustomTool(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.toolBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isAxe() {
                        return true;
                    }
                };
                break;
            case PICKAXE:
                itemCustom = new ItemCustomTool(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.toolBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isPickaxe() {
                        return true;
                    }
                };
                break;
            case HOE:
                itemCustom = new ItemCustomTool(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.toolBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isHoe() {
                        return true;
                    }
                };
                break;
            case SHOVEL:
                itemCustom = new ItemCustomTool(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {

                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.toolBuilder(this, itemDescriptionData.getCategory())
                                .creativeGroup(group)
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public boolean isShovel() {
                        return true;
                    }
                };
                break;
            case ENCHANTED_BOOK:
            case RAW_FOOD:
            case COOKED_FOOD:
            case MISC_FOOD:
                // todo
            default:
                itemCustom = new ItemCustom(itemDescriptionData.getIdentifier(),
                        itemComponentData.getDisplay_name(),
                        itemComponentData.getIcon()) {
                    @Override
                    public CustomItemDefinition getDefinition() {
                        return CustomItemDefinition.simpleBuilder(this,
                                itemDescriptionData.getCategory())
                                .creativeGroup(itemDescriptionData.getGroup())
                                .handEquipped(itemComponentData.isHand_equipped())
                                .build();
                    }

                    @Override
                    public int getMaxDurability() {
                        return itemComponentData.getMax_durability();
                    }

                    @Override
                    public int getMaxStackSize() {
                        return itemComponentData.getMax_stack_size();
                    }
                };
                break;
        }
        Item.registerCustomItem(itemCustom.getClass());
    }
}
