package org.joinmastodon.android.ui.displayitems;

import org.joinmastodon.android.ui.adapters.GenericListItemsAdapter;
import org.joinmastodon.android.model.Status;

/**
 * Represents an Ad item in the Mastodon timeline.
 */
public class AdDisplayItem extends StatusDisplayItem {

    public AdDisplayItem() {
        // Pass a dummy Status object, because StatusDisplayItem requires one
        super(new Status(), 0); 
    }

    @Override
    public int getType() {
        // Use a unique type value that your adapter can check
        return GenericListItemsAdapter.AD_ITEM_VIEW_TYPE;
    }
}
