package flowtext.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView) findViewById(R.id.flowWV);

        WebSettings settings = view.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(false);
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        view.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        view.loadData("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0; maximum-scale=1.0; minimum-scale=1.0; user-scalable=0;\"/>" +
                "<style>\n" +
                "img {\n" +
                "    float: right;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body style=\"background-color:rgb(244, 244, 244);\">\n" +
                "\n" +
                "<p style=\"color:rgb(164, 0, 0);\"><b>" + "Apple" + "</b></p>\n" +
                "\n" +
                "<p><img src=\"https://i.imgur.com/PgE6ZX5.jpg\" style=\"width:110px;height:70px;margin-left:5px;\">\n" +
                "\n" +
                "This is apple. Its is a fruit and edible. This apple is red in color. It is hanging from tree. Apples are very popular. It looks good. It looks good. It looks good. It looks good. It looks good." +
                " This text is below the apple picture in portrait mode." + "</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>", "text/html", "utf-8");
    }
}
