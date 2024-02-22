package cn.nukkit.item.customitem.parser.data;

import cn.nukkit.item.customitem.parser.type.ItemGroupType;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author glorydark
 */
@Data
@Builder
@ToString
public class ItemComponentData {

    private ItemGroupType creative_category_parent; // minecraft:creative_category

    private int max_stack_size; // minecraft:max_stack_size

    private boolean hand_equipped; // minecraft:hand_equipped

    private int max_durability;

    private String icon; // minecraft:icon

    private String display_name; // minecraft:display_name

    public static ItemComponentData parseItemComponent(Map<String, Object> componentMap) {
        ItemComponentData itemComponentData = ItemComponentData.builder().build();
        String key = "minecraft:creative_category";
        if (componentMap.containsKey(key)) {
            Map<String, Object> subData = (Map<String, Object>) componentMap.getOrDefault(key, new HashMap<>());
            itemComponentData.setCreative_category_parent(getGroupByName((String) subData.getOrDefault("parent", "")));
        }
        key = "minecraft:max_stack_size";
        itemComponentData.setMax_stack_size((Integer) componentMap.getOrDefault(key, 64));
        key = "minecraft:hand_equipped";
        itemComponentData.setHand_equipped((Boolean) componentMap.getOrDefault(key, false));
        key = "minecraft:durability";
        if (componentMap.containsKey(key)) {
            Map<String, Object> subData = (Map<String, Object>) componentMap.getOrDefault(key, new HashMap<>());
            itemComponentData.setMax_durability((Integer) subData.getOrDefault("max_durability", 200));
        }
        key = "minecraft:icon";
        if (componentMap.containsKey(key)) {
            Map<String, Object> subData = (Map<String, Object>) componentMap.getOrDefault(key, new HashMap<>());
            itemComponentData.setIcon((String) subData.getOrDefault("value", ""));
        }
        key = "minecraft:display_name";
        if (componentMap.containsKey(key)) {
            Map<String, Object> subData = (Map<String, Object>) componentMap.getOrDefault(key, new HashMap<>());
            itemComponentData.setDisplay_name((String) subData.getOrDefault("value", "Unknown"));
        }
        return itemComponentData;
    }

    protected static ItemGroupType getGroupByName(String category) {
        switch (category) {
            case "itemGroup.name.sword":
            case "itemGroup.name.hoe":
            case "itemGroup.name.axe":
            case "itemGroup.name.pickaxe":
            case "itemGroup.name.shovel":
                return ItemGroupType.TOOL;
            case "itemGroup.name.helmet":
            case "itemGroup.name.chestplate":
            case "itemGroup.name.leggings":
            case "itemGroup.name.boots":
                return ItemGroupType.ARMOR;
            case "itemGroup.name.miscFood":
            case "itemGroup.name.cookedFood":
                return ItemGroupType.EDIBLE;
            case "itemGroup.name.enchantedBook":
                return ItemGroupType.BOOK_ENCHANTED;
            default:
                if (category.equals("")) {
                    return ItemGroupType.UNKNOWN;
                }
                return ItemGroupType.COMMON;
        }
    }
}
