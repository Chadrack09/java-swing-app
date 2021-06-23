package main.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Chadrack
 * <p>
 *  <a href="https://www.javatpoint.com/java-swing">Learn Java Swing</a>
 * </p>
 * Please see {@link main.app.Worker} This refer to the Worker class
 * @see main.app.Worker; To discover about Worker object
 */
public class MainApp extends JFrame implements ActionListener {
 
  //Config || Initialization
  private final JPanel panel_north = new JPanel();
  private final JPanel panel_south = new JPanel();
  private final JPanel panel_center = new JPanel();
  private final JButton btn_prev = new JButton("<< Previous");
  private final JButton btn_next = new JButton("Next >>");
  private final JButton btn_exit = new JButton("Exit");
  private final Font font = new Font("Roboto", NORMAL, 14);
  private final Font font_2 = new Font("Roboto", Font.BOLD, 16);
  private final Font font_heading = new Font("Roboto", NORMAL, 24);
  
  //Panel North Config
  private final JLabel label_heading = new JLabel("Worker Records System");
  
  /**
   * @method    addNumber()
   * @note      This method add two number and
   *            return the total sum as integer.
   * 
   * @param a   The first number to enter
   *            for to make sum
   * @param b   The second number to enter
   * 
   * @return    return the total addition of <code>int r = a + b</code>
   * @see       #addComponents();
   * @see       main.app.Worker#getFirstName()
   * @throws    IOException ex
   * @throws    IllegalAccessException ex
   */
  public int addNumber(int a, int b) {
    int r = a + b;
    return r;
  }
  
  //Panel Center Config 
  private final JLabel dis_record = new JLabel();
  private final JLabel title = new JLabel("Title");
  
  String[] title_ar = {"Adv", "Dr", "Miss", "Mr", "Mrs", "Prof"};
  
  private final JComboBox combo_titles = new JComboBox(title_ar);
  private final JLabel hiding = new JLabel("Hiding 1");
  private final JLabel hiding_2 = new JLabel("Hiding 2");
  private final JLabel hiding_3 = new JLabel("Hiding 3");
  private final JLabel hiding_4 = new JLabel("Hiding 4");
  private final JLabel hiding_5 = new JLabel("Hiding 5");
  private final JLabel hiding_6 = new JLabel("Hiding 6");
  private JLabel label_logo;

  private final JLabel first_name = new JLabel("First Name");
  private final JTextField fn_text_field = new JTextField();
  private final JLabel last_name = new JLabel("Last_Name");
  private final JTextField ln_text_field = new JTextField();
  private final JLabel gender = new JLabel("Gender");
  private final ButtonGroup btn_gender_group = new ButtonGroup();
  private final JPanel radio_panel = new JPanel();
  private final JRadioButton btn_radio_male = new JRadioButton("Male");
  private final JRadioButton btn_radio_female = new JRadioButton("Female");
  private final JLabel pension = new JLabel("Pension");
  private final JCheckBox checkbox_one = new JCheckBox();

  // Array List Of Workers
  private final ArrayList<Worker> workers = new ArrayList();
  private final ListIterator<Worker> workerIterator = workers.listIterator();
  private static int workerIndex = 0;
  boolean mytrue = true;
    

  public MainApp() {
    super();
    this.setTitle("Check Workers");
    this.setVisible(true);
    this.setMinimumSize(new Dimension(720, 452));
    this.setMaximumSize(new Dimension(792, 572));
    this.setLayout(new BorderLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Instantiating Workers
//    "Adv", "Dr", "Miss", "Mr", "Mrs", "Prof"
    Worker worker_1 = new Worker("Mr", "John", "Markus", "Male", true);
    Worker worker_2 = new Worker("Mrs", "Sarah", "Nicole", "Female", false);
    Worker worker_3 = new Worker("Adv", "Parker", "Henson", "Male", true);
    Worker worker_4 = new Worker("Dr", "Strange", "Merry", "Male", true);
    Worker worker_5 = new Worker("Miss", "Clara", "Simon", "Female", true);
    Worker worker_6 = new Worker("Prof", "Patrick", "Albert", "Male", false);
    Worker worker_7 = new Worker("Adv", "Johnny", "Malcom", "Male", false);
    Worker worker_8 = new Worker("Mr", "Simon", "Saint", "Male", false);
    Worker worker_9 = new Worker("Miss", "Mila", "Lady", "Female", true);
    Worker worker_10 = new Worker("Mrs", "Sierra", "Mobs", "Female", false);
    workers.add(worker_1);
    workers.add(worker_2);
    workers.add(worker_3);
    workers.add(worker_4);
    workers.add(worker_5);
    workers.add(worker_6);
    workers.add(worker_7);
    workers.add(worker_8);
    workers.add(worker_9);
    workers.add(worker_10);
    
    //Sorting The Array List
    Collections.sort(workers);
    
    // Calling addComponents Method
    addComponents();
    
    // Calling editComponents Method
    editComponents();
    
    // Calling Records Method
    record(workerIndex);
    
    // Calling Add Action Event Method
    addActionEvent();
  }
  
  // Edit Components Method
  private void editComponents() {
    //Panel North
    panel_north.setBorder(new TitledBorder(""));
    panel_north.setBackground(Color.decode("#007bff"));
    panel_north.setForeground(Color.white);
    label_heading.setFont(font_heading);
    label_heading.setForeground(Color.white);
    
    
    //Panel Center
    //panel_center.setBorder(new TitledBorder("Panel Center"));
    panel_center.setLayout(new GridLayout(6, 3));
    hiding.setVisible(false);
    hiding_2.setVisible(false);
    hiding_3.setVisible(false);
    hiding_4.setVisible(false);
    hiding_5.setVisible(false);
    hiding_6.setVisible(false);
    btn_prev.setBackground(Color.decode("#007bff"));
    btn_prev.setForeground(Color.white);
    btn_prev.setFont(font);
    btn_next.setBackground(Color.decode("#007bff"));
    btn_next.setForeground(Color.white);
    btn_next.setFont(font);
    btn_exit.setBackground(Color.decode("#dc3545"));
    btn_exit.setForeground(Color.white);
    btn_exit.setFont(font);
    fn_text_field.setBackground(Color.decode("#6c757d"));
    ln_text_field.setBackground(Color.decode("#6c757d"));
    fn_text_field.setForeground(Color.white);
    ln_text_field.setForeground(Color.white);
    fn_text_field.setFont(font_2);
    ln_text_field.setFont(font_2);
    
    //Panel South
    panel_south.setLayout(new GridLayout(1, 3));
    panel_south.setBorder(new TitledBorder("Panel South"));
  }//end of method
  
  // Add Components Methhod
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
    panel_center.add(hiding_4);
    panel_center.add(last_name);
    panel_center.add(ln_text_field);
    panel_center.add(hiding_5);
    panel_center.add(gender);
    panel_center.add(radio_panel);
    panel_center.add(hiding_6);
    panel_center.add(pension);
    panel_center.add(checkbox_one);
    label_logo = new JLabel(new ImageIcon("logo.png")); 
    panel_center.add(label_logo);
  }//end of method
  
  //Record Method
  public void record(int workerIndex) {
    combo_titles.setEditable(false);
    combo_titles.setSelectedItem(workers.get(workerIndex).getTitle());
    fn_text_field.setText(workers.get(workerIndex).getFirstName());
    fn_text_field.setEditable(false);
    ln_text_field.setText(workers.get(workerIndex).getLastName());
    ln_text_field.setEditable(false);

    //Setting Gender
    if(workers.get(workerIndex).getGender().equals("Male")){
      btn_radio_male.setSelected(true);
    } else btn_radio_female.setSelected(true);
    //Setting Pension
    if(workers.get(workerIndex).isIsPension()){
      checkbox_one.setSelected(true);
    } else checkbox_one.setSelected(false);

    dis_record.setText("Display: Record " +(workerIndex+1) + " of " +workers.size());
  }

  public void addActionEvent(){
    btn_prev.addActionListener(this);
    btn_next.addActionListener(this);
    btn_exit.addActionListener(this);
  }
  
  //  @Override
  public void actionPerformed(ActionEvent e) {
    //-----------------------
    // Previous
    //-----------------------
    if(e.getSource() == btn_prev){
        if(workerIndex > 0){
          workerIndex--;
          record(workerIndex);
        }
    }
    //-----------------------
    // Next
    //-----------------------
    if(e.getSource() == btn_next){
      if(workerIterator.hasNext()){
        workerIndex++;
        if(workerIndex < workers.size()){
          record(workerIndex);
        }
      }
    } 
    //-----------------------
    // Exit
    //-----------------------
    if (e.getSource() == btn_exit) {
      System.exit(0);
    }
  }
  
  // [Main Method]
  public static void main(String[] args) {
    new MainApp();
  }
}
