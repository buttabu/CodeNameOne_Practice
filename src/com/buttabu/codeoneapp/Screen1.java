/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buttabu.codeoneapp;

import com.codename1.ui.Display;

/**
 * GUI builder created Form
 *
 * @author ABUBUTT1
 */
public class Screen1 extends com.codename1.ui.Form {

    public Screen1() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Screen1(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_Label_3 = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_Label_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button_1.addActionListener(callback);
        gui_Button_2.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Button_1) {
                onButton_1ActionEvent(ev);
            }
            if(sourceComponent == gui_Button_2) {
                onButton_2ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.GridLayout(4, 3));
        setTitle("Screen1");
        setName("Screen1");
        addComponent(gui_Label_3);
        addComponent(gui_Button_1);
        addComponent(gui_Label_2);
        addComponent(gui_Label_4);
        addComponent(gui_Label_1);
        addComponent(gui_Button_2);
        gui_Label_3.setText("Label");
        gui_Label_3.setName("Label_3");
        gui_Button_1.setText("Visit My Website");
        gui_Button_1.setUIID("sitebutton");
        gui_Button_1.setName("Button_1");
        gui_Label_2.setText("Label");
        gui_Label_2.setName("Label_2");
        gui_Label_4.setText("Label");
        gui_Label_4.setName("Label_4");
        gui_Label_1.setText("Label");
        gui_Label_1.setName("Label_1");
        gui_Button_2.setText("Go To Another Screen");
        gui_Button_2.setName("Button_2");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
    Display.getInstance().execute("https://www.google.com/");
    }

    public void onButton_2ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        Screen2 box;
        box = new Screen2();
        box.show();
    }

}
