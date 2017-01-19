/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano.dialogs;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author CLOMA-ALCANTARA
 */
class MessageBox extends ClassExtension{
    
    protected static boolean No_errors_onSETTINGBT_IMG = true;
    
    
    void showMsgDialog(Component obj,String Message){
        initComponents(obj);
        this.Title = "Message";
        if(Message != null){
        this.Msg = Message;}
        this.CANCELBT = "OK";
        Confirm_BUTTON.hide();
        
        Set_Strings();
        set_Default_Icon(1); // Info Icon
       set_LOOK_AND_FEEL();
        Cancel_BUTTON.requestFocus();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg){
        initComponents(obj);
        if(Title!= null){
            this.Title = Title;}
        if(Msg != null){
        this.Msg = Msg;}
        this.CANCELBT = "OK";
        Confirm_BUTTON.hide();
        
        Set_Strings();
        set_Default_Icon(1); // Info Icon
       set_LOOK_AND_FEEL();
        Cancel_BUTTON.requestFocus();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT){
        initComponents(obj);
        if(Title!= null){
        this.Title = Title;}
        if(Msg != null){
        this.Msg = Msg;}
        if(OKBT !=  null){
        this.CANCELBT = OKBT;}
        Confirm_BUTTON.hide();
        
        Set_Strings();
        set_Default_Icon(1); // Info Icon
       set_LOOK_AND_FEEL();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT, int Type){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.CANCELBT = OKBT;
        Confirm_BUTTON.hide();
        
        Set_Strings();
        if((Type > 3 || Type < 0)){
            Type = 1;}
        set_Default_Icon(Type);
       set_LOOK_AND_FEEL();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT, int Type, Color BackgroundColor){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.CANCELBT = OKBT;
        Confirm_BUTTON.hide();
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        
        Set_Strings();
        if(Type > 3 || Type < 0){
            Type = 1;}
        set_Default_Icon(Type);
       set_LOOK_AND_FEEL();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT, int Type, Color BackgroundColor, Color Message_ForegroundColor){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.CANCELBT = OKBT;
        Confirm_BUTTON.hide();
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        
        Set_Strings();
        if(Type > 3 || Type < 0){
            Type = 1;}
        set_Default_Icon(Type);
       set_LOOK_AND_FEEL();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT, int Type, Color BackgroundColor, Color Message_ForegroundColor, Color TopBar_Color){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.CANCELBT = OKBT;
        Confirm_BUTTON.hide();
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        if(TopBar_Color != null){
        TopBar_TITLE.setBackground(TopBar_Color);}
        
        Set_Strings();
        if(Type > 3 || Type < 0){
            Type = 1;}
        set_Default_Icon(Type);
       set_LOOK_AND_FEEL();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT, int Type, Color BackgroundColor, Color Message_ForegroundColor, Color TopBar_Color, ImageIcon Message_Icon){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.CANCELBT = OKBT;
        Confirm_BUTTON.hide();
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        if(TopBar_Color != null){
        TopBar_TITLE.setBackground(TopBar_Color);}
        
        if(Type > 3 || Type < 0){
            Type = 1;}
        set_Default_Icon(Type); 
        
        if(Message_Icon != null){
            set_user_Icon(Message_Icon);
        }
        
        Set_Strings();
        
       set_LOOK_AND_FEEL();
        Show_DialogFrame();
    }
    
    void showMsgDialog(Component obj,String Title, String Msg, String OKBT, int Type,Image Background_Image, Color Message_ForegroundColor, Color TopBar_Color, ImageIcon Message_Icon, boolean Background_isTransparent){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.CANCELBT = OKBT;
        Confirm_BUTTON.hide();
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        if(TopBar_Color != null){
        TopBar_TITLE.setBackground(TopBar_Color);}
        
        if(Type > 3 || Type < 0){
            Type = 2;}
        set_Default_Icon(Type);
        
        if(Message_Icon != null){
            set_user_Icon(Message_Icon);
        }
        Set_Strings();
        
        set_LOOK_AND_FEEL();
       
        if(Background_Image != null){
            No_errors_onSETTINGBT_IMG = set_Background_Image(Background_Image);}
        if(Background_isTransparent && No_errors_onSETTINGBT_IMG && Background_Image != null){
            Frame_Pane.setOpaque(false);
            FrameBG.setOpaque(false);
            Content_Pane.setOpaque(false);
            MyOptionPane.getRootPane().setOpaque(false);
            MyOptionPane.getContentPane().setBackground(new Color(0,0,0,0));
            MyOptionPane.setBackground(new Color(0,0,0,0));
        }
        Show_DialogFrame();
    }
    
}
