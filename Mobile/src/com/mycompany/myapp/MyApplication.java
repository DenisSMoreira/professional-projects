package com.mycompany.myapp;


//import com.codename1.components.WebBrowser;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.io.IOException;

public class MyApplication {

    private Form current;

    public void init(Object context) {
        try{
            Resources theme = Resources.openLayered("/theme");
            UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
       }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void start() {
        if(current != null){
            current.show();
            return;
        }
        Form hi = new Form();
        hi.setLayout(new BorderLayout ());
         Container cnt = new Container(new LayeredLayout());
         
        WebBrowser wb = new WebBrowser();
        
        wb.setURL("jar:///Page.html");  
        cnt.addComponent(wb);
        hi.setScrollable(false);

        hi.setScrollableY(false);
        hi.addComponent(BorderLayout.CENTER,cnt);
        hi.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }

}
