package cn.nukkit.item.customitem.parser.data;

import cn.nukkit.item.customitem.data.ItemCreativeCategory;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @author glorydark
 */
@Data
@ToString
@Builder
public class ItemDescriptionData {

    private String identifier;

    private ItemCreativeCategory category;

    private String group;

    public static ItemDescriptionData parseItemDescription(Map<String, Object> map) {
        ItemDescriptionData itemDescriptionData = ItemDescriptionData.builder().build();
        itemDescriptionData.setIdentifier((String) map.getOrDefault("identifier", ""));
        itemDescriptionData.setCategory(getCategoryByName((String) map.getOrDefault("category", "")));
        itemDescriptionData.setGroup((String) map.getOrDefault("group", ""));
        return itemDescriptionData;
    }

    protected static ItemCreativeCategory getCategoryByName(String category) {
        switch (category) {
            case "none":
                return ItemCreativeCategory.NONE;
            case "construction":
                return ItemCreativeCategory.CONSTRUCTOR;
            case "nature":
                return ItemCreativeCategory.NATURE;
            case "equipment":
                return ItemCreativeCategory.EQUIPMENT;
            case "items":
            default:
                return ItemCreativeCategory.ITEMS;
        }
    }
}
