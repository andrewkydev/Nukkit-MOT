package cn.nukkit.item.customitem.parser.data;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author glorydark
 */
@Data
@ToString
@Builder
public class ItemRegistryData {

    private String format_version;

    private ItemDescriptionData itemDescription;

    private ItemComponentData itemComponent;

    public static ItemRegistryData parseItemRegistryData(Map<String, Object> map) {
        ItemRegistryData itemRegistryData = ItemRegistryData.builder().build();
        itemRegistryData.setFormat_version((String) map.getOrDefault("format_version", "1.16.100"));
        itemRegistryData.setItemDescription(
                ItemDescriptionData.parseItemDescription(
                        (Map<String, Object>) ((Map<String, Object>) map
                                .getOrDefault("minecraft:item", new HashMap<>()))
                                .getOrDefault("description", new HashMap<>())
                )
        );
        itemRegistryData.setItemComponent(
                ItemComponentData.parseItemComponent(
                        (Map<String, Object>) ((Map<String, Object>) map
                                .getOrDefault("minecraft:item", new HashMap<>()))
                                .getOrDefault("components", new HashMap<>())
                )
        );
        return itemRegistryData;
    }
}
