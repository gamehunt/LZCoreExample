package ru.j4fn.lizord.lzlibexample.items;

import ru.j4fn.lizord.lzlib.items.AbstractItem;
import ru.j4fn.lizord.lzlib.util.RegistryEntry;

@RegistryEntry
public class ExampleItem extends AbstractItem {
    public ExampleItem() {
        super("example_item");
    }
}
