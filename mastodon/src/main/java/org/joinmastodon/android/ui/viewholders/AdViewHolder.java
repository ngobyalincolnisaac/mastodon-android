package org.joinmastodon.android.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.ViewGroup;

import org.joinmastodon.android.R;
import org.joinmastodon.android.model.viewmodel.ListItem;
import org.joinmastodon.android.ui.displayitems.AdDisplayItem;

public class AdViewHolder extends ListItemViewHolder<AdDisplayItem> {

    private WebView webView;

    public AdViewHolder(Context context, View parent) {
        super(context, parent);

        // Create WebView dynamically if no layout
        webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                500 // height of ad
        ));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient()); // ensures links open in WebView

        ((ViewGroup) parent).addView(webView);
    }

    @Override
    public void bind(AdDisplayItem item) {
        String adHtml = "<html><body style='margin:0;padding:0'>" +
                "<iframe id='acab808c' name='acab808c' " +
                "src='https://ads.wigowigo.com/www/delivery/afr.php?zoneid=4&cb=" + Math.random() + "' " +
                "frameborder='0' scrolling='no' width='100%' height='500' allow='autoplay'>" +
                "<a href='https://ads.wigowigo.com/www/delivery/ck.php?n=aa2edc8c&cb=" + Math.random() + "' target='_blank'>" +
                "<img src='https://ads.wigowigo.com/www/delivery/avw.php?zoneid=4&cb=" + Math.random() + "&n=aa2edc8c' border='0' alt='' />" +
                "</a></iframe>" +
                "</body></html>";

        webView.loadData(adHtml, "text/html", "UTF-8");
    }
			}
