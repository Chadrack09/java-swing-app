## Java Swing App

Java Swing application with swing components

The Worker class is the blueprint of all worker objects

```java
  private void addComponents() {
    // Add To MainFrame [JFrame]
    // Note: The JFrame is divided using Border Layout;
    this.add(panel_north, BorderLayout.NORTH);
    this.add(panel_center, BorderLayout.CENTER);
    this.add(panel_south, BorderLayout.SOUTH);
    
    //Adding to Panel North
    panel_north.add(label_heading);
    
    //Adding To Panel South
    panel_south.add(btn_prev);
    panel_south.add(btn_next);
    panel_south.add(btn_exit);
    
    //Grouping Radio Buttons
    btn_gender_group.add(btn_radio_male);
    btn_gender_group.add(btn_radio_female);
    
    //Adding To radio_panel, radio buttons
    radio_panel.add(btn_radio_male);
    radio_panel.add(btn_radio_female);
    
    //Adding To Panel Center
    panel_center.add(hiding);
    panel_center.add(hiding_2);
    panel_center.add(dis_record);
    panel_center.add(title);
    panel_center.add(combo_titles);
    panel_center.add(hiding_3);
    panel_center.add(first_name);
    panel_center.add(fn_text_field);
    label_logo = new JLabel(new ImageIcon("logo.png")); 
    panel_center.add(label_logo);
  }

```