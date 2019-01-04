package org.appdapter.core.item;

import java.util.Set;
import org.appdapter.core.name.ModelIdent;
import org.appdapter.core.name.Ident;

public class ItemFuncs
{
    public static Ident getNeighborIdent(final Ident neighborIdent, final String fieldName) {
        Ident result = null;
        if (neighborIdent != null && neighborIdent instanceof ModelIdent) {
            final ModelIdent neighborModelIdent = (ModelIdent)neighborIdent;
            result = neighborModelIdent.getIdentInSameModel(fieldName);
        }
        return result;
    }

    public static Ident getNeighborIdent(final Item neighborItem, final String fieldName) {
        final Ident neighborItemIdent = neighborItem.getIdent();
        return getNeighborIdent(neighborItemIdent, fieldName);
    }

    public static String getString(final Item parent, final String fieldName, final String defaultVal) {
        final Ident pid = getNeighborIdent(parent, fieldName);
        return parent.getValString(pid, defaultVal);
    }

    public static Long getLong(final Item parent, final String fieldName, final Long defaultVal) {
        final Ident pid = getNeighborIdent(parent, fieldName);
        return parent.getValLong(pid, defaultVal);
    }

    public static Integer getInteger(final Item parent, final String fieldName, final Integer defaultVal) {
        final Long defLong = (defaultVal != null) ? new Long(defaultVal) : null;
        final Long lv = getLong(parent, fieldName, defLong);
        return (lv != null) ? (lv.intValue()) : null;
    }

    public static Double getDouble(final Item parent, final String fieldName, final Double defaultVal) {
        final Ident pid = getNeighborIdent(parent, fieldName);
        return parent.getValDouble(pid, defaultVal);
    }

    public static Set<Item> getLinkedItemSet(final Item parent, final String linkName) {
        final Ident pid = getNeighborIdent(parent, linkName);
        return (Set<Item>)parent.getLinkedItemSet(pid, Item.LinkDirection.FORWARD);
    }

    public static int getLinkedItemCount(final Item parent, final String linkName, final Item.LinkDirection linkDir) {
        final Ident pid = getNeighborIdent(parent, linkName);
        return parent.getLinkedItemCount(pid, Item.LinkDirection.FORWARD);
    }

    public static Item getSingleLinkedItem(final Item parent, final String linkName, final Item.LinkDirection linkDir) {
        final Ident pid = getNeighborIdent(parent, linkName);
        return parent.getSingleLinkedItem(pid, Item.LinkDirection.FORWARD);
    }
}

/*

	Total time: 13 ms

*/