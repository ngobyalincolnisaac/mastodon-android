package org.joinmastodon.android.ui.viewholders;

import android.view.View;
import android.webkit.WebView;
import org.joinmastodon.android.R;

/**
 * ViewHolder for displaying a single Revive Ad in the timeline
 */
public class AdViewHolder extends StatusViewHolder {

    public WebView webView;

    // Constructor
    public AdViewHolder(View itemView){
        super(itemView);
        webView = itemView.findViewById(R.id.adWebView);
        webView.getSettings().setJavaScriptEnabled(true);
    }

    // Bind method to load your ad
    public void bind() {
        String adHtml = "<html><body style='margin:0;padding:0'>" +
                "<iframe id='acab808c' name='acab808c' " +
                "src='https://ads.wigowigo.com/www/delivery/afr.php?zoneid=4&cb=INSERT_RANDOM_NUMBER_HERE' " +
                "frameborder='0' scrolling='no' width='100%' height='500' allow='autoplay'>" +
                "<a href='https://ads.wigowigo.com/www/delivery/ck.php?n=aa2edc8c&cb=INSERT_RANDOM_NUMBER_HERE' target='_blank'>" +
                "<img src='https://ads.wigowigo.com/www/delivery/avw.php?zoneid=4&cb=INSERT_RANDOM_NUMBER_HERE&n=aa2edc8c' border='0' alt='' />" +
                "</a></iframe>" +
                "</body></html>";

        webView.loadData(adHtml, "text/html", "UTF-8");
    }
          }
