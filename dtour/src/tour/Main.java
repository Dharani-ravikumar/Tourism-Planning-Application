package tour;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*; 
//import java.awt.image;
//import java.io;
//import javax.imageio.ImageIO;
import java.lang.Exception;
import javax.swing.tree.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

class demo extends JFrame implements ActionListener
{
	final String DB_URL = "jdbc:mysql://localhost:3306/base";
	final String USER = "root";
	final String PASS = "21_Jun_02";	
	final String QUERY = "SELECT PLACE,TOUR_GUIDE_DETAILS FROM det;";
	String data1,da,da1,in1,in2,in3,in4;
	JFrame j,j1,j2,j3;
	JList<String> bl,kl,fl,il;
	JLabel l,p,n,l1,l2,id,f1,fd,t,ol,bg,l3,l4,l5,l6,l7,l8,l9,l03,ul,pl,L;
	JScrollPane jsk,jsp,jkl,jfl,jil;
	JTextField t1,t2,n1,id1,ol1,t4,t5,t6,t7;
	JComboBox bx,kx,vx;
	JTextArea sow,sow2,sow3,sow4,sow5;
	JTextField t3=new JTextField();
	JPanel p0,p1,p2,p3,p4,p5,p00,p01,p02;
	JButton b,bt,bt0,bt01,bt1,bt2,added,delete,update,wel,bl1;
	JCheckBox m,f,k,in,it,ch,sp;
	JRadioButton fa,co,fr,p9,p8,p7,p6,bi,bu,sf;
	JTable jt,jt1;
	JTree T; 
	JScrollPane js,js1,js2;
	Image i;
	demo()
	{
		L=new JLabel();
		setSize(1200,700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img=new ImageIcon("po.jpg");
		L=new JLabel("",img,JLabel.CENTER);
		L.setBounds(0,0,1200,700);
		add(L);
		
		setVisible(true);
	l=new JLabel();
	l.setText("USERNAME");
	l.setBounds(30,30,80,50);
	t1=new JTextField(15);
	t1.setToolTipText("Enter the usernsme");
	t1.setBounds(100,50,100,20);
	p=new JLabel();
	p.setText("PASSWORD");
	p.setBounds(30,70,80,50);
	t2=new JTextField(15);
	t2.setToolTipText("Enter the password");
	t2.setBounds(100,85,100,20);
	b=new JButton("SUBMIT");
	b.setBounds(100,120,120,20);
//	ImageIcon icon=new ImageIcon("C:\\Users\\dhara\\eclipse\\java-2021-06\\eclipse\\plz.png"); 
	//JLabel label=new JLabel(icon);
	//label.setBounds(250,0,500,375);
	j=new JFrame();
	j.getContentPane().setBackground(new Color(51,204,255));
	j1=new JFrame();
	j1.getContentPane().setBackground(new Color(51,204,255));
	j2=new JFrame();
	j2.getContentPane().setBackground(new Color(51,204,255));
	p0=new JPanel();
	p0.setLayout(null);
	p0.setBackground(new Color(255,255,204));
	l7=new JLabel();
	l7.setText("WELCOME TO EXPLORING WORLD");
	l7.setBounds(400,30,500,50);
	l7.setFont(new Font("Verdana", Font.PLAIN, 20));
	l7.setPreferredSize(new Dimension(500,200));
	wel=new JButton("WELCOME");
    wel.setBounds(500,150,150,20);
    wel.addActionListener(this);
	bt0=new JButton("ADMIN LOGIN");
    bt0.setBounds(700,250,150,20);
    bt01=new JButton("USER LOGIN");
    bt01.setBounds(250,250,150,20);
	p0.setBounds(50,50,1200,500);
	p1=new JPanel();
	p1.setLayout(null);
	p1.setBackground(new Color(255,255,204));
	p2=new JPanel();
	p2.setLayout(null);
	p2.setBackground(new Color(255,255,204));
	
//	BufferedImage image = ImageIO.read(new File("./java.jpg"));
   // JLabel label = new JLabel(new ImageIcon(image));
 //   p2.add(label);
	
	
	p3=new JPanel();
	p3.setLayout(null);
	p3.setBackground(new Color(255,255,204));
	p4=new JPanel();
    p4.setLayout(null);
    p4.setBackground(new Color(255,255,204));
	p5=new JPanel();
	p5.setLayout(null);
	p5.setBackground(new Color(255,255,204));
	p01=new JPanel();
	p01.setLayout(null);
	p01.setBackground(new Color(255,255,204));
    p02=new JPanel();
	p02.setLayout(null);
	p02.setBackground(new Color(255,255,204));
	p00=new JPanel();
	p00.setLayout(null);
	p00.setBackground(new Color(255,255,204));
    
    
    j1.add(p0);
    p0.add(l7);
    p0.add(wel);
    p0.add(bt0);
    p0.add(bt01);
    j1.setSize(400,400);
    j1.setTitle("TRAVEL FREAK");
    j1.setBounds(10,10,700,600); 
	j1.setLayout(null);  
    j1.setVisible(true);
    bt0.addActionListener(new ActionListener() {
    @Override
	 public void actionPerformed(ActionEvent a) 
    {
    	j2.setVisible(true);
    }
    });
    bt01.addActionListener(new ActionListener() {
        @Override
    	 public void actionPerformed(ActionEvent a) 
        {
        	j.setVisible(true);
        }
        });
    
   

    JTabbedPane tp=new JTabbedPane();
	tp.setBounds(50,50,1200,500);
	tp.add("LOGIN", p1);
	
	
	tp.add("REGISTRATION" ,p2);
	tp.add("TOUR PLAN",p3);
    tp.add("EXECUTION" ,p4);
    tp.add("SUMMARY" ,p5); 
    
    j.add(tp);  
    j.setSize(400,400);
    j.setTitle("Application Form");
    j.setBounds(10,10,700,600); 
	j.setLayout(null);  
    //j.setVisible(true);
    p1.add(l);
    p1.add(t1);
    p1.add(p);
    p1.add(t2);
    p1.add(b);
    b.addActionListener(this);
    
    
    
    								   

    n=new JLabel("NAME");
    n.setBounds(30,30,80,50);
	n1=new JTextField(15);
	n1.setBounds(100,50,130,20);
	id=new JLabel("ID PROOF:");
	id.setBounds(30,70,80,50);
	id1=new JTextField(15);
	id1.setBounds(100,85,130,20);
    l1=new JLabel("Enter the no.of.people:");
    l1.setBounds(30,100,200,50);
    m = new JCheckBox("MALE");
    m.setBounds(160,115,100,20);
    f = new JCheckBox("FEMALE");
    f.setBounds(160,140,100,20);
    k = new JCheckBox("KIDS");
    k.setBounds(160,165,100,20);
    String num[]= {"Zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    bx = new JComboBox(num);
    bx.setBounds(260,115,80,20);
    kx = new JComboBox(num);
    kx.setBounds(260,140,80,20);
    vx = new JComboBox(num);
    vx.setBounds(260,165,80,20);
    l2=new JLabel("Select your package:");
    l2.setBounds(30,180,150,50);
    fa=new JRadioButton("Family package");
    fa.setBounds(160,195,150,20);
    co=new JRadioButton("Couple package");
    co.setBounds(160,220,150,20);
    fr=new JRadioButton("Friends package");
    fr.setBounds(160,245,150,20);
    bt=new JButton("SUBMIT");
    bt.setBounds(160,270,80,20);
    bt.addActionListener(this);
    bt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) { 
			String s3=n1.getText();
			String s4=id1.getText();
			String data1;
			if (fa.isSelected())
                data1 = "Family package";
            else if(co.isSelected())
                data1 = "Couple package";
            else
            	 data1 = "Friends package";
                        
			String s8 = (String)bx.getSelectedItem();
			String s9 = (String)kx.getSelectedItem();
			String s10=(String)vx.getSelectedItem();
			try {
                //Creating Connection Object
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbase","root","21_Jun_02");
                
                String q1 = "INSERT INTO det1 values('" + s3 + "','" + s4 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + data1 + "')";
                    
               
                Statement sta = connection.createStatement();
                   sta.executeUpdate(q1);
                    connection.close();

 
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
		}
	});
    
    ButtonGroup bg=new ButtonGroup();
    bg.add(fa);
    bg.add(co);
    bg.add(fr);
    p2.add(n);
    p2.add(n1);
    p2.add(id);
    p2.add(id1);
    p2.add(l1);
    p2.add(m);
    p2.add(kx);
    p2.add(f);
    p2.add(vx);
    p2.add(k);
    p2.add(bx);
    p2.add(l2);
    p2.add(fa);
    p2.add(co);
    p2.add(fr);
    p2.add(bt);
    bt.addActionListener(this);
    
    f1=new JLabel("SELECT YOUR FAV LOCATION:");
    f1.setBounds(30,30,200,25);
    p9=new JRadioButton("BEACH");
    p9.setBounds(200,45,100,20);
    String be[]= {"Pondichery","Goa","Calangute"};
    bl = new JList<String>(be);
    bl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jsk = new JScrollPane(bl);
    bl.setBounds(330,45,100,50);
    p8=new JRadioButton("HILLS STATION");
    p8.setBounds(200,100,120,20);
    String hills[]= {"Ooty","Kodikanal","Kiarighat"};
    kl = new JList<String>(hills);
    kl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jkl = new JScrollPane(kl);
    kl.setBounds(330,120,100,50);
    p7=new JRadioButton("FOREST");
    p7.setBounds(200,180,120,20);
    String forest[]= {"Rishikesh","Darjeeling","chikmagulur"};
    fl = new JList<String>(forest);
    fl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jfl = new JScrollPane(fl);
    fl.setBounds(330,180,100,50);
    p6=new JRadioButton("ISLAND");
    p6.setBounds(200,260,120,20);
    String islands[]= {"Majuli Island ","Diu Island","Lakshadweep"};
    il = new JList<String>(islands);
    il.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jil = new JScrollPane(fl);
    il.setBounds(330,260,100,50);
    
    fd=new JLabel("Select your fav food:");
    fd.setBounds(30,330,130,20);
    in = new JCheckBox("INDIAN");
    in.setBounds(200,330,80,20);
    it = new JCheckBox("ITALIAN");
    it.setBounds(280,330,80,20);
    ch = new JCheckBox("CHINESE");
    ch.setBounds(360,330,80,20);
    sp = new JCheckBox("SPANISH");
    sp.setBounds(440,330,80,20);
    
    t=new JLabel("Select your Vechile:");
    t.setBounds(30,360,120,20);
    bu=new JRadioButton("BUS TRAVELLERS");
    bu.setBounds(200,360,150,20);
    bi=new JRadioButton("BIKE");
    bi.setBounds(350,360,80,20);
    sf=new JRadioButton("FLIGHT");
    sf.setBounds(450,360,150,20);
    ButtonGroup gb=new ButtonGroup();
    gb.add(bu);
    gb.add(bi);
    gb.add(sf);
    ol=new JLabel("Others like Firecamp:");
    ol.setBounds(30,390,130,20);
    ol1=new JTextField(15);
    ol1.setBounds(200,390,120,20);
    bt1=new JButton("OK");
    bt1.setBounds(200,420,60,20);
    bt2=new JButton("OK");
    bt2.setBounds(600,350,70,25);
    l3=new JLabel("TRIP SUMMARY");
    l3.setBounds(600,30,200,25);
    l4=new JLabel("FOR FURTHER DETAILS CONTACT:tourism@gmail.com");
    l4.setBounds(600,400,450,20);
    l5=new JLabel("SPECIAL PLACES!!");
    l5.setBounds(100, 10 ,150, 20);
    l6=new JLabel("CONNECT WITH YOUR TOUR GUIDE...");
    l6.setBounds(500, 10 ,450, 20);
    
    
    ButtonGroup sg=new ButtonGroup();
    sg.add(p9);
    sg.add(p8);
    sg.add(p7);
    sg.add(p6);
    p3.add(f1);
    p3.add(p9);
    p3.add(bl);
    p3.add(p8);
    p3.add(kl);
    p3.add(p7);
    p3.add(fl);
    p3.add(p6);
    p3.add(il);
    p3.add(fd);
    p3.add(in);
    p3.add(it);
    p3.add(ch);
    p3.add(sp);
    p3.add(t);
    p3.add(bu);
    p3.add(bi);
    p3.add(sf);
    p3.add(ol);
    p3.add(ol1);
    p3.add(bt1);
    p4.add(bt2);
    p5.add(l3);
    p4.add(l4);
    p4.add(l5);
    p4.add(l6);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    sow=new JTextArea(" ");
    sow2=new JTextArea(" ");
    sow3=new JTextArea(" ");
   
    
    //sow.setSize(300,300);
    //sow.setLocation(600,100);
    sow.setLineWrap(true);
    sow.setEditable(false);
    //sow2.setSize(300,300);
    //sow2.setLocation(600,100);
    sow2.setLineWrap(true);
    sow2.setEditable(false);
    //sow3.setSize(300,300);
    //sow3.setLocation(1000,50);
    sow3.setLineWrap(true);
    sow3.setEditable(false);
    
    sow4=new JTextArea(" ");
    sow4.setSize(500,300);
    sow4.setLocation(370,100);
    sow4.setLineWrap(true);
    sow4.setEditable(false);
    
    p2.add(sow);
    p3.add(sow2);
    p4.add(sow3);
    p5.add(sow4);
    js = new JScrollPane(js);
    //add(js, BorderLayout.CENTER);
    
    String[][] data = {
    		//{"PLACE", "TOUR-GUIDE DETAILS"},
            { "Pondichery", "Ram--9876567847" },
            { "Goa", "Ramesh--9874723563" },
            {"Calangute","suresh--9567896545"},
            { "Ooty", "Rahul--9878476565" },
            { "Kodikanal", "vishnu--9873456915" },
            { "Kiarighat", "shiva--987349216" },
            { "chikmagulur", "Rajesh--8865743290" },
            {"Rishikesh","kishor--9876498089"}, 
            {"Darjeeling","Mukilan--9879685868"},
            { "Lakshadweep", "Ajay--9887389400" },
            { "Diu Island", "Krishna--8865743290" },
            { "Majuli Island", "Arjun--7655440098" },   
        };
  
       
      String[] columnNames = { "PLACE", "TOUR-GUIDE DETAILS" };
   
    DefaultTableModel md=new DefaultTableModel();
    md.setColumnIdentifiers(columnNames);
    jt= new JTable(data, columnNames);
    jt1=new JTable(data, columnNames);
    jt.getTableHeader().setReorderingAllowed(false);
    jt.setModel(md);
    jt.setBounds(500, 50 ,350, 210);
    p4.add(jt);
    js1 = new JScrollPane(js1);
    js1.setBounds(new Rectangle(500, 50 ,350, 210));
    js1.setViewportView(jt);
	p4.add(js1);
	
	//******
	JButton b8 = new JButton("DISPLAY");
	b8.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e)
			{
			//jt.setRowCount(0);
			 Object[] row1=new Object[2];
			try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				   Statement stmt = conn.createStatement();
				         ResultSet rs = stmt.executeQuery(QUERY);) 
						{
							if(rs.next())
							{ 
								do
								{
								row1[0]=rs.getString(1);
								row1[1]=rs.getString(2);
								md.addRow(row1);	
								}while(rs.next());
							}
							else
							{
								System.out.println("Record Not Found...");
							}
					  }
		   catch (SQLException e1) 
			{
				 e1.printStackTrace();
		    } 										
		}
	});				
	b8.setBounds(232, 398, 89, 23);
	p4.add(b8);
	
	
    jt.getSelectionModel().addListSelectionListener(new ListSelectionListener()
    {
        public void valueChanged(ListSelectionEvent event) 
        {
        	int selectedRow = jt.getSelectedRow();
            String Field = new String();
            for(int i = 0; i < jt.getColumnCount(); i++) 
            {
                Field += jt.getValueAt(selectedRow, i) + "  ";
            }
            sow4.append("You have contacted-"+Field);
            sow4.setEditable(false);
            sow5.append("You have contacted-"+Field);
            sow5.setEditable(false);
        }
        
    });
    j2.setSize(400,400);
    j2.setTitle("LOGIN");
    j2.setBounds(10,10,700,600); 
	j2.setLayout(null);  
    //j2.setVisible(true);
    JTabbedPane tp1=new JTabbedPane();
	tp1.setBounds(50,50,1200,500);
	tp1.add("LOGIN",p00);
	tp1.add("PLAN", p01);
	tp1.add("EDIT", p02);
	j2.add(tp1);
	ul=new JLabel();
	ul.setText("USERNAME");
	ul.setBounds(30,30,80,50);
	t6=new JTextField(15);
	t6.setToolTipText("Enter the usernsme");
	t6.setBounds(100,50,100,20);
	pl=new JLabel();
	pl.setText("PASSWORD");
	pl.setBounds(30,70,80,50);
	t7=new JTextField(15);
	t7.setToolTipText("Enter the password");
	t7.setBounds(100,85,100,20);
	bl1=new JButton("SUBMIT");
	bl1.setBounds(100,120,120,20);
	bl1.addActionListener(this);
	p00.add(ul);
    p00.add(pl);
    p00.add(t6);
    p00.add(t7);
    p00.add(bl1);
	l03=new JLabel("CUSTOMER DETAILS");
    l03.setBounds(600,30,200,25);
    sow5=new JTextArea(" ");
    sow5.setSize(500,300);
    sow5.setLocation(370,100);
    sow5.setLineWrap(true);
    sow5.setEditable(false);
    p01.add(l03);
    p01.add(sow5);
	l8=new JLabel();
	l8.setText("PLACE");
	l8.setBounds(30,30,80,50);
    t4=new JTextField();
    t4.setBounds(100,50,200,20);
    l9=new JLabel();
	l9.setText("CONTACT");
	l9.setBounds(30,70,80,50);
    t5=new JTextField();
    t5.setBounds(100,85,200,20);
    added = new JButton("Add");
    added.setBounds(200, 300, 100, 25);
    delete = new JButton("Delete");
    delete.setBounds(200, 400, 100, 25);
    update = new JButton("Update");
    update.setBounds(200, 350, 100, 25);
    js2 = new JScrollPane(js2);
    js2.setBounds(new Rectangle(500, 50 ,350, 210));
    js2.setViewportView(jt1);
    p02.add(l8);
    p02.add(t4);
    p02.add(l9);
    p02.add(t5);
    p02.add(added);
    p02.add(delete);
    p02.add(update);
    p02.add(jt1);
    //p02.add(js1);
    Object[] row=new Object[2];
    added.addActionListener(new ActionListener() {

		 @Override
		 public void actionPerformed(ActionEvent e) {

		 row[0] = t4.getText();
		 row[1] = t5.getText();
		 md.addRow(row);
		 }
		 });
    delete.addActionListener(new ActionListener() {

		 @Override
		 public void actionPerformed(ActionEvent e) {
		 int i = jt.getSelectedRow();
		 if (i >= 0) 
		 {
		 md.removeRow(i);
		 } 
		 else
		 {
		 System.out.println("Issue in Deleting");
		 }

        jt.addMouseListener(new MouseAdapter()
         {
         @Override
		 public void mouseClicked(MouseEvent e)
		 {
		 int i = jt.getSelectedRow();

		 t4.setText(md.getValueAt(i, 0).toString());
		 t5.setText(md.getValueAt(i, 1).toString());
		 }
		 });
		 }
		 });
        update.addActionListener(new ActionListener() {

			 @Override
			 public void actionPerformed(ActionEvent e) {

			 // i = the index of the selected row
			 int i = jt.getSelectedRow();

			 if (i >= 0) {
			 md.setValueAt(t4.getText(), i, 0);
			 md.setValueAt(t5.getText(), i, 1);
			 } else {
			 System.out.println("Update Error");
			 }
			 }
			 });
	
    

    
    DefaultMutableTreeNode location=new DefaultMutableTreeNode("location");  
    DefaultMutableTreeNode beach=new DefaultMutableTreeNode("beach");  
    DefaultMutableTreeNode hillstation=new DefaultMutableTreeNode("hill station");  
    DefaultMutableTreeNode Forest=new DefaultMutableTreeNode("Forest");
    DefaultMutableTreeNode Island=new DefaultMutableTreeNode("Island");
    location.add(beach);  
    location.add(hillstation);
    location.add(Forest);
    location.add(Island);
    
    DefaultMutableTreeNode Pondichery=new DefaultMutableTreeNode("Pondichery");  
    DefaultMutableTreeNode Goa=new DefaultMutableTreeNode("Goa");  
    DefaultMutableTreeNode Calangute=new DefaultMutableTreeNode("Calangute");
    DefaultMutableTreeNode ooty=new DefaultMutableTreeNode("ooty");  
    DefaultMutableTreeNode kodikanal=new DefaultMutableTreeNode(" kodikanal");  
    DefaultMutableTreeNode kiarighat=new DefaultMutableTreeNode("kiarighat");
    DefaultMutableTreeNode Rishikesh=new DefaultMutableTreeNode("Rishikesh");  
    DefaultMutableTreeNode Darjeeling=new DefaultMutableTreeNode("Darjeeling");  
    DefaultMutableTreeNode chikmagulur=new DefaultMutableTreeNode("chikmagulur");
    DefaultMutableTreeNode MajuliIsland=new DefaultMutableTreeNode("Majuli Island");  
    DefaultMutableTreeNode DiuIsland=new DefaultMutableTreeNode("Diu Island");  
    DefaultMutableTreeNode Lakshadweep=new DefaultMutableTreeNode("Lakshadweep");
    
    DefaultMutableTreeNode ParadiseBeach=new DefaultMutableTreeNode("Paradise Beach");  
    DefaultMutableTreeNode Auroville=new DefaultMutableTreeNode("Auroville");
    DefaultMutableTreeNode RajNiwas=new DefaultMutableTreeNode("Raj Niwas"); 
    DefaultMutableTreeNode BogmaloBeach=new DefaultMutableTreeNode("Bogmalo Beach");  
    DefaultMutableTreeNode MorjimBeach=new DefaultMutableTreeNode("Morjim Beach");
    DefaultMutableTreeNode ColvaBeach=new DefaultMutableTreeNode("Colva Beach"); 
    DefaultMutableTreeNode FortAguada=new DefaultMutableTreeNode("Fort Aguada");  
    DefaultMutableTreeNode BagaBeach=new DefaultMutableTreeNode("Baga Beach");
    DefaultMutableTreeNode KerkarArtComplex=new DefaultMutableTreeNode("Kerkar Art Complex.");
    
    DefaultMutableTreeNode KalhattiFalls=new DefaultMutableTreeNode("Kalhatti Falls");  
    DefaultMutableTreeNode OotyLake=new DefaultMutableTreeNode("Ooty Lake");
    DefaultMutableTreeNode RoseGarden=new DefaultMutableTreeNode("Rose Garden");
    
    DefaultMutableTreeNode CoakersWalk=new DefaultMutableTreeNode("Coakers Walk");  
    DefaultMutableTreeNode BryantPark=new DefaultMutableTreeNode("Bryant Park");
    DefaultMutableTreeNode SilverCascadeFalls=new DefaultMutableTreeNode("Silver Cascade Falls");
    
    DefaultMutableTreeNode JakhooTemple=new DefaultMutableTreeNode("Jakhoo Temple");  
    DefaultMutableTreeNode ProspectHill=new DefaultMutableTreeNode("Prospect Hill");
    DefaultMutableTreeNode MaharajaPalace=new DefaultMutableTreeNode("Maharaja's Palace");
    
    DefaultMutableTreeNode kuaripass=new DefaultMutableTreeNode("kuari pass");  
    DefaultMutableTreeNode trivenighat=new DefaultMutableTreeNode("triveni ghat");  
    DefaultMutableTreeNode PiranKaliyarSharif=new DefaultMutableTreeNode("Piran Kaliyar Sharif");

    DefaultMutableTreeNode tigerhill=new DefaultMutableTreeNode("Tiger hill");  
    DefaultMutableTreeNode batasialoop=new DefaultMutableTreeNode("Batasia loop");  
    DefaultMutableTreeNode kaudiyala=new DefaultMutableTreeNode("kaudiyala");
    

    DefaultMutableTreeNode mahatamagandhipark=new DefaultMutableTreeNode("mahatama gandhi park");  
    DefaultMutableTreeNode bhadrawildlifesanctuary=new DefaultMutableTreeNode("bhadra wildlife sanctuary");  
    DefaultMutableTreeNode hebbewaterfalls =new DefaultMutableTreeNode("hebbe waterfalls");
    
    DefaultMutableTreeNode AuniatiSatra=new DefaultMutableTreeNode("Auniati Satra");  
    DefaultMutableTreeNode Garmur=new DefaultMutableTreeNode("Garmur");
    DefaultMutableTreeNode Tengapania=new DefaultMutableTreeNode("Tengapania");
    
    DefaultMutableTreeNode gangeshwarmahadevtemple=new DefaultMutableTreeNode("gangeshwar mahadev temple");  
    DefaultMutableTreeNode naidacaves=new DefaultMutableTreeNode("naida caves");  
    DefaultMutableTreeNode sunsetpoint=new DefaultMutableTreeNode("sunset point");
    
    DefaultMutableTreeNode marinemuseum=new DefaultMutableTreeNode("marine museum");  
    DefaultMutableTreeNode yachutcruise=new DefaultMutableTreeNode("yachut cruise");  
    DefaultMutableTreeNode bangaramatoll=new DefaultMutableTreeNode("bangaram atoll");

   
    beach.add(Pondichery);
    beach.add(Goa);
    beach.add(Calangute);
    hillstation.add(ooty);
    hillstation.add(kodikanal);
    hillstation.add(kiarighat);
    Forest.add(Rishikesh);
    Forest.add(Darjeeling);
    Forest.add(chikmagulur);
    Island.add(MajuliIsland);
    Island.add(DiuIsland);
    Island.add(Lakshadweep);
    T= new JTree(location);
    Pondichery.add(ParadiseBeach);
    Pondichery.add(Auroville);
    Pondichery.add(RajNiwas);
    Goa.add(BogmaloBeach);
    Goa.add(MorjimBeach);
    Goa.add(ColvaBeach);
    Calangute.add(FortAguada);
    Calangute.add(BagaBeach);
    Calangute.add(KerkarArtComplex);
    ooty.add(KalhattiFalls);
    ooty.add(OotyLake);
    ooty.add(RoseGarden);
    kodikanal.add(CoakersWalk);
    kodikanal.add(BryantPark);
    kodikanal.add(SilverCascadeFalls);
    kiarighat.add(JakhooTemple);
    kiarighat.add(ProspectHill);
    kiarighat.add(MaharajaPalace);
    Rishikesh.add(kuaripass);
    Rishikesh.add(trivenighat);
    Rishikesh.add(PiranKaliyarSharif);
    Darjeeling.add(tigerhill);
    Darjeeling.add(batasialoop);
    Darjeeling.add(kaudiyala);
    chikmagulur.add(mahatamagandhipark);
    chikmagulur.add(bhadrawildlifesanctuary);
    chikmagulur.add(hebbewaterfalls);
    MajuliIsland.add(AuniatiSatra);
    MajuliIsland.add(Garmur);
    MajuliIsland.add(Tengapania);
    DiuIsland.add(gangeshwarmahadevtemple);
    DiuIsland.add(naidacaves);
    DiuIsland.add(sunsetpoint);
    Lakshadweep.add(marinemuseum);
    Lakshadweep.add(yachutcruise);
    Lakshadweep.add(bangaramatoll);
    
    p4.add(T);
    
	js.setBounds(new Rectangle(100, 50 ,350, 210));
	p4.add(js);
	js.setViewportView(T);
    T.setBounds(500, 50 ,350, 210);
    
    T.addTreeSelectionListener(new TreeSelectionListener() {

		@Override
		public void valueChanged(TreeSelectionEvent e) {
		   DefaultMutableTreeNode selectedNode = 
		       (DefaultMutableTreeNode)T.getLastSelectedPathComponent();   
		   String selectedNodeName = selectedNode.toString();
		   sow4.append(selectedNodeName+"-");
		   sow5.append(selectedNodeName+"-");
		  }
		});
    
    JMenuBar mb=new JMenuBar();  
    JMenu menu=new JMenu("FILE"); 
    menu.setMnemonic(KeyEvent.VK_F);
    JMenu submenu=new JMenu("SAVE");  
    j.add(mb);
    j.add(menu);
    j.add(submenu);
    
    JMenuItem i1=new JMenuItem("NEW",KeyEvent.VK_N);  
    KeyStroke ii2=KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK);
    i1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		System.out.println("Selected: " + e.getActionCommand());
      		JOptionPane.showMessageDialog(null,"New selected");
      	}
      	});
    JMenuItem i2=new JMenuItem("OPEN", KeyEvent.VK_O); 
    KeyStroke ii1=KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK);
    i2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		System.out.println("Selected: " + e.getActionCommand());
      		JOptionPane.showMessageDialog(null,"Open selected");
      	}
      	});
    JCheckBoxMenuItem i3 = new JCheckBoxMenuItem("EXIT");  
    i3.setMnemonic(KeyEvent.VK_E);  
   
    JMenuItem i4=new JMenuItem("SAVE AS",KeyEvent.VK_S);
    KeyStroke ii4=KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK);
   i4.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		System.out.println("Selected: " + e.getActionCommand());
      		JOptionPane.showMessageDialog(null,"Save As selected");
      	}
      	});
   JMenuItem i5=new JMenuItem("PRINT",KeyEvent.VK_P);  
    KeyStroke ii5=KeyStroke.getKeyStroke(KeyEvent.VK_P,Event.CTRL_MASK);
    i5.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		System.out.println("Selected: " + e.getActionCommand());
      		JOptionPane.showMessageDialog(null,"Print selected");
      	}
      	});
    
    
    
    i1.setAccelerator(ii2);
    i2.setAccelerator(ii1);
    i4.setAccelerator(ii4);
    i5.setAccelerator(ii5);
    
    JMenu menu1=new JMenu("EDIT"); 
    
    
    JRadioButtonMenuItem i6 = new JRadioButtonMenuItem("Undo");

    JRadioButtonMenuItem i7 = new JRadioButtonMenuItem("Go To");
    ButtonGroup bg4=new ButtonGroup();    
	    bg4.add(i6);
	    bg4.add(i7);
	    JMenuItem i8=new JMenuItem("Delete",KeyEvent.VK_D); 

    KeyStroke ii6=KeyStroke.getKeyStroke(KeyEvent.VK_D,Event.CTRL_MASK);
    i8.setAccelerator(ii5);
    i8.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		System.out.println("Selected: " + e.getActionCommand());
      		JOptionPane.showMessageDialog(null,"Delete selected");
      	}
      	});
    menu.add(i1); menu.add(i2); menu.add(i3);  
    submenu.add(i4); submenu.add(i5);  
    
    menu1.add(i6);
    menu1.add(i7);
    menu1.add(i8);
    //menu1.add(bg1);
   
    menu.add(submenu);  
    mb.add(menu); 
    mb.add(menu1);
    JPopupMenu jpu = new JPopupMenu();

 // Create the popup menu items.

 JMenuItem jmiCut = new
 JMenuItem("Cut");

 JMenuItem jmiCopy = new
 JMenuItem("Copy");

 JMenuItem jmiPaste = new
 JMenuItem("Paste");

 // Add the menu items to the popup

 jpu.add(jmiCut);

 jpu.add(jmiCopy);

 jpu.add(jmiPaste);
 
 f.addMouseListener(new MouseAdapter()
 {

 public void mousePressed(MouseEvent me)
 {

 if(me.isPopupTrigger())

 jpu.show(me.getComponent(), me.getX(),
 me.getY());

 }

 public void mouseReleased(MouseEvent me)
 {

 if(me.isPopupTrigger())

 jpu.show(me.getComponent(), me.getX(),
 me.getY());

 }

 });
 
    
    
    
	} 
	
	public void actionPerformed(ActionEvent ae)
	{ 
					
		if (ae.getSource()==bt)
		{
			
				String data2,data3;
				String data="NAME  :"+n1.getText() +"\n"+ "ID PROOF:"+id1.getText() + "\n";
			if(m.isSelected())
				data1="No. of people :male-"+bx.getItemAt(bx.getSelectedIndex())+"\n";
			if(f.isSelected())
				da="No. of people :female-"+kx.getItemAt(bx.getSelectedIndex())+"\n";
			if(k.isSelected())
				da1="No. of people :kids-"+vx.getItemAt(bx.getSelectedIndex())+"\n";
			if(fa.isSelected())
				data2="package : family package"+"\n";
			else if(co.isSelected())
			     data2="package : couple package"+"\n";
			else if(fr.isSelected())
			     data2="package : friends package"+"\n";
			else
				data2="no package selected";
			//sow.setText(data+data1+da+da1+data2);
			//sow.setEditable(false);
			sow4.append(data+data1+da+da1+data2);
			sow4.setEditable(false);
			sow5.append(data+data1+da+da1+data2);
			sow5.setEditable(false);
			
			
			}
		//user 
		//ImageIcon icon=new ImageIcon("C:\\Users\\dhara\\.eclipse\\god.pnj"); 
		//jlabel
		if(ae.getSource()==b)
		{
		String uv=t1.getText();
		String pv=t2.getText();
		if (t1.getText().isEmpty() && t2.getText().isEmpty() )
		{ 
			JOptionPane.showMessageDialog(null, "Enter Username or Password");
		}
		else
		{
			 JOptionPane.showMessageDialog(null,uv+" WELCOME "); 
		}
		}
		
		//admin
		if(ae.getSource()==bl1)
		{
		String u=t6.getText();
		String p=t7.getText();
		if (u.equals("Varsini") && p.equals("dv@123"))
		{ 
			JOptionPane.showMessageDialog(this,u+ "  Welcome ");
		}
		else
		{
			 JOptionPane.showMessageDialog(this, "Invalid Username or Password"); 
		}
		}
		if(ae.getSource()==bt)
		{
			JOptionPane.showMessageDialog(this,"your have registered successfully");
		}
		
		if(ae.getSource()==bt1)
		{

			String info1,info2,info3;
			 if(p9.isSelected())
			     info1="Location: Beach-"+bl.getSelectedValue()+"\n";
			else if(p8.isSelected())
			     info1="Location : Hill station-"+kl.getSelectedValue()+"\n";
			else if(p7.isSelected())
			     info1="Location : Forest-"+fl.getSelectedValue()+"\n";
			else if(p6.isSelected())
				info1="Location : Island-"+il.getSelectedValue()+"\n";
			else
				info1="no location selected";
			 
			if(in.isSelected())
			in1="FOOD : INDIAN"+"\n";
			if(it.isSelected())
			in2="FOOD :ITALIAN"+"\n";
		    if(ch.isSelected())
			in3="FOOD : CHINESE"+"\n";
		    if(sp.isSelected())
			in4="FOOD : SPANISH"+"\n";
		    
		    if(bu.isSelected())
			     info2="vehicle : Bus travellers"+"\n";
			else if(bi.isSelected())
			     info2="vehicle : Bike"+"\n";
			else if(sf.isSelected())
			     info2="vehicle : Flight"+"\n";
			else
				info2="no vehicle selected";
		    
			info3="Others like fire camp :"+ol1.getText()+ "\n";
		    //sow2.setText(info1+in1+in2+in3+in4+info2+info3);
			//sow2.setEditable(false);
			sow4.append(info1+in1+in2+in3+in4+info2+info3);
			sow4.setEditable(false);
			sow5.append(info1+in1+in2+in3+in4+info2+info3);
			sow5.setEditable(false);
			
		}
		if(ae.getSource()==bt1)
		{
			JOptionPane.showMessageDialog(this,"Enjoy your trip!!");
			
			
		}
		if(ae.getSource()==bt2)
		{
			JOptionPane.showMessageDialog(this,"Thankyou..have a great journey!!");	
	    }

	}
}
public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new demo();
			}
			
	});
		try {

		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("success");
		} catch (Exception e) {
		    System.out.println(e.toString());
		}	 
	}
}