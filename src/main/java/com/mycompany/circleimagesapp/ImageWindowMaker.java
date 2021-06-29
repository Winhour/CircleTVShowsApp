/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.circleimagesapp;

import com.mycompany.circleimagesapp.models.ImageModel;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import javax.swing.Timer;


/**
 *
 * @author Marcin
 */
public class ImageWindowMaker {
    
    int i = 1;
    
    int currenthour = 17;
    int currentminute = 0;
    
    int previoushour = 16;
    int previousminute = 45;
    
    int nexthour = 17;
    int nextminute = 15;
    
    final int timeinterval = 5;
    
    LocalTime time;
    
    JWindow windowcenter = new JWindow();
    JLabel ja = new JLabel();
    
    boolean notvshowsflag = false;
    boolean tryflag = false;

    
    List<JWindow> jwindowlist = new ArrayList<>();
    int Cx = 950;
    int Cy = 530;
    int rh = 390;
    int rw = 600;
    double d = 1.57079633;
 
    
    List<ImageModel> imagemodellist = new ArrayList<>();
    List<ImageModel> currentmodellist = new ArrayList<>();
    List<Image> todeletelist = new ArrayList<>();
    
    ImageModel imagemodel;
    int currentelement = 0;
    
    Timer timer = new Timer(300000, new ActionListener() {                       /* 300000 for 5 minutes */
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            
            
            if (notvshowsflag){
                notvshowsflag = false;
                ja.setBounds(5,5,650,430);
                ja.setBackground(Color.BLACK);
                ja.setForeground(Color.WHITE);
                windowcenter.getContentPane().removeAll();

                windowcenter.add(ja);
                windowcenter.repaint();
                

            }
            
            windowcenter.setVisible(false);
            //windowcenter.removeAll();
            windowcenter.repaint();
            
            dotheThing();
            
            
        }
    });
    
    public void run(){
        
        int xw = 726;
        int xy = 484;
        
        windowcenter.setSize(xw,xy);
        windowcenter.setLayout(null);
        windowcenter.setLocation(Cx-(xw/2),Cy-(xy/2));
        windowcenter.getContentPane().setBackground(Color.GRAY);
        windowcenter.setVisible(false);
        
        ja.setBounds(5,5,xw-10,xy-10);
        ja.setBackground(Color.BLACK);
        ja.setForeground(Color.WHITE);
        
        windowcenter.add(ja);
        
        windowcenter.setVisible(false);
        
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        int minute = rightNow.get(Calendar.MINUTE);
        
        currenthour = hour;
        currentminute = minute;
        
        previousminute = minute - 15;
        previoushour = currenthour;
        if(previousminute<0){
            previousminute = previousminute + 60;
            previoushour--;
        }
        
        nextminute = minute + 15;
        nexthour = currenthour;
        if(nextminute >= 60){
            nextminute = nextminute - 60;
            nexthour++;
        }
        
        System.out.println("Starting time: " + currenthour + "  " + currentminute);
            
        dotheThing();
        
        timer.start();
        
    }
    
    private double [] getCoordinatesonCircle(double [] coordinates, double d, int rw, int rh, int Cx, int Cy){
         
         double x = Cx + (rw * sin(d));
         double y = Cy + (rh * cos(d));
         
         //System.out.println("x: " + x + "  " + "y: " + y);
         
         coordinates[0] = x;
         coordinates[1] = y;
         
         
         return coordinates;
     }
     
     private void makeImageWindow(double[] coordinates, List<JWindow> jwindowlist, ImageModel imagemodel) throws IOException{
         
       //System.out.println(imagepath);
       
       
       int xy = 160;
       int xw = (int)(xy * 1.7);
         
        BufferedImage bi_e = ImageIO.read(new File(System.getProperty("user.dir")+"/10_PRZDANE/"+imagemodel.getImagepath()));
        
        Image bi = bi_e.getScaledInstance(xw, xy, Image.SCALE_SMOOTH);
         
        JWindow window = new JWindow(){

            public void paint(Graphics g){

            g.drawImage(bi,5,5,bi.getWidth(this)-10,bi.getHeight(this)-10,this);

            };
        };
        
        todeletelist.add(bi);
        
        
        window.setBackground(Color.orange);
        
        window.setSize(xw,xy);
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.getContentPane().setBackground(Color.BLUE);
        window.setLayout(null);
        //window.setUndecorated(true);
        window.setLocation((int)coordinates[0]-(xw/2), (int)coordinates[1]-(xy/2));
        
        JPopupMenu popMenu = new JPopupMenu();
        
        
        JMenuItem menuItem[] = new JMenuItem[3];
        
        ShowAction a = new ShowAction(imagemodel.getImagepath(),window);
        ForumAction f = new ForumAction(imagemodel.getForumpath(),window);
        UrlAction u = new UrlAction(imagemodel.getUrl(),window);
        
        menuItem[0] = new JMenuItem("Show");
        //menuItem[0].addActionListener(clickChoiceHandler);
       // menuItem[0].setActionCommand("show_command");
        menuItem[0].setAction(a);
        popMenu.add(menuItem[0]);
        
        menuItem[1] = new JMenuItem("Forum");
        //menuItem[1].addActionListener(clickChoiceHandler);
        //menuItem[1].setActionCommand("forum_command");
        menuItem[1].setAction(f);
        popMenu.add(menuItem[1]);
        
        
        menuItem[2] = new JMenuItem("Url");
        //menuItem[2].addActionListener(clickChoiceHandler);
        //menuItem[2].setActionCommand("url_command");
        menuItem[2].setAction(u);
        popMenu.add(menuItem[2]);
        
        bi_e = null;
        
        
        window.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered(java.awt.event.MouseEvent evt) {

                //ja.setFont(new Font("Book Antiqua", Font.PLAIN, 10));
                //ja.setText(imagemodel.getInfo());
                
                //windowcenter.getContentPane().removeAll();
                
                //System.out.println("test");
                
                //ja = new JLabel();
                
                ja.setBounds(5,5,716,474);
                ja.setBackground(Color.BLACK);
                ja.setForeground(Color.WHITE);
                
                BufferedImage bi_x = null;
                try {
                    bi_x = ImageIO.read(new File(System.getProperty("user.dir")+"/10_PRZDANE/"+imagemodel.getImagepath()));
                } catch (IOException ex) {
                    Logger.getLogger(ImageWindowMaker.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                Image bi2 = bi_x.getScaledInstance(716, 474, Image.SCALE_SMOOTH);
                
                ImageIcon bi_exit = new ImageIcon(bi2);

                ja.setIcon(bi_exit);
                
                windowcenter.add(ja);
                windowcenter.repaint();
                
                windowcenter.setVisible(true);
                
                bi_x = null;
                
                
                
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                
                windowcenter.setVisible(false);
                //window.repaint();

            }
            

            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1){
                    //System.out.println("Left button clicked");
                    
                    JLabel jl = new JLabel();
    
                    JFrame popupwindow = new JFrame();
                    
                    
                    BufferedImage bi_x = null;
                    try {
                        bi_x = ImageIO.read(new File(System.getProperty("user.dir")+"/10_PRZDANE/"+imagemodel.getImagepath()));
                    } catch (IOException ex) {
                        Logger.getLogger(ImageWindowMaker.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Image bi2 = bi_x.getScaledInstance(1340, 792, Image.SCALE_SMOOTH);

                    ImageIcon bi_exit = new ImageIcon(bi2);

                    jl.setBounds(5,5,1340,792);
                    jl.setBackground(Color.BLACK);
                    jl.setForeground(Color.WHITE);
                    jl.setIcon(bi_exit);
                    
                    popupwindow.setSize(1370,845);
                    popupwindow.setLayout(null);
                    popupwindow.setLocation(400,200);

                    popupwindow.add(jl);

                    popupwindow.setVisible(true);

                    
                } else if (evt.getButton() == java.awt.event.MouseEvent.BUTTON2){
                    //System.out.println("Middle button clicked");
                } else if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                    //System.out.println("Right button clicked");
                    popMenu.show(window, evt.getX(), evt.getY());
                } 
            }
        });
        
       
        
        window.setVisible(true);
        
        //window.toBack();
        
        jwindowlist.add(window);

         
     }
     
     
     private void makeNoTVShowsWindow(){
         
        int xy = 160;
        int xw = (int)(xy * 1.7);

        JWindow window = new JWindow();

        window.setSize(xw,xy);
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.getContentPane().setBackground(Color.BLUE);
        window.setLayout(null);
        //window.setUndecorated(true);
        window.setLocation(Cx-(xw/2), Cy-rh-(xy/2));
        window.setBackground(Color.orange);
        
        System.out.println("No current TV shows");

        JTextArea jm = new JTextArea();

        jm.setBounds(5,5,xw-10,xy-10);
        jm.setBackground(Color.BLACK);
        jm.setForeground(Color.WHITE);
        jm.setFont(new Font("Book Antiqua", Font.PLAIN, 16));
        jm.setText("No TV shows available currently");
        
        //jm.setHorizontalAlignment(JTextArea.CENTER);

        window.getContentPane().removeAll();
        window.add(jm);
        window.repaint();
        window.setVisible(true);
        notvshowsflag = true;
        
        window.toBack();
        
        jwindowlist.add(window);
         
     }
     
     
     public String findFile(FileFilter fileFilter){
      
        File dir = new File(System.getProperty("user.dir") + "/10_PRZDANE");

        File[] files = dir.listFiles(fileFilter);
        /*for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
         }*/
        
        return files[0].getAbsolutePath();
                
     }
     
     public int getLastId(){
         
        int maxid = 0;
        String tmp;
        int tmpid;
         
        File dir = new File(System.getProperty("user.dir") + "/10_PRZDANE");
         
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            
            tmp = files[i].getPath().replace(System.getProperty("user.dir")+"\\10_PRZDANE\\", "");
            //System.out.println("tmp wersja 1: "+tmp);
            tmp = tmp.replace(System.getProperty("user.dir"),"");
            //System.out.println("tmp wersja 2: "+tmp);
            tmp = tmp.replace("/10_PRZDANE/","");
            //System.out.println("tmp wersja 3: "+tmp);
            //System.out.println("Systemgetproperty: " + System.getProperty("user.dir"));
            
            
            
            tmpid = Integer.parseInt(tmp.substring(0,2));
            if (tmpid > maxid) maxid = tmpid;
            
         }
         
         
         
         return maxid;
     }
     
    public static boolean isBetween(LocalTime candidate, LocalTime start, LocalTime end) {
        return !candidate.isBefore(start) && !candidate.isAfter(end);  
    }
    
    public void pullupimagewindows(){
        
        jwindowlist.forEach(temp -> {
                temp.toFront();
            });
        
        if(notvshowsflag){
            windowcenter.toFront();
        }
        
    }
    
    public void pulldownimagewindows(){
        
        jwindowlist.forEach(temp -> {
                temp.toBack();
            });
        
        if(notvshowsflag){
            windowcenter.toBack();
        }
        
    }
    
    public void dotheThing(){               /* Main function of the program */
        
        System.out.println("Current time: " + currenthour + "  " + currentminute);
        
        imagemodellist.forEach(temp -> {
                time = LocalTime.parse(String.format("%02d", temp.getHour())+":"+String.format("%02d", temp.getMin()));
                
                /*if ((currenthour-1)<temp.getHour() && (currenthour+1)>temp.getHour()){*/
                if(isBetween(time, LocalTime.of(previoushour, previousminute), LocalTime.of(nexthour, nextminute))){    
                    currentmodellist.add(temp);
                }
            });
        
            Collections.reverse(currentmodellist);
            
            i = currentmodellist.size();
            
            if(i > 4){
                
                rh = 390;
                rw = 600;
                
            } else {
                
                rh = 330;
                rw = 500;
                
            }
            
            
            jwindowlist.forEach(temp -> {
                temp.removeAll();
                temp.dispose();
            });
            
            /* Trying to save memory, but this doesn't seem to be the problem */
            
            todeletelist.forEach(temp -> {
                temp = null;
            });
            
            todeletelist.clear();

            double[] coordinates = {0,0};
            
            //System.out.println("");
            
            if (i!=0){
                for (d=Math.PI;d<(3*Math.PI)-0.3;d+=((2*Math.PI)/i)){
                    
                    if (currentelement == i) currentelement = 0;
                    imagemodel = currentmodellist.get(currentelement);

                    coordinates = getCoordinatesonCircle(coordinates,d,rw,rh,Cx,Cy);
                    
                    if (!tryflag){
                        System.out.println("element_id: " + currentelement + " name: " + imagemodel.getImagepath() + "   x: " + coordinates[0] + "  " + "y: " + coordinates[1]);
                    }
                    else {
                        System.out.println("element_id: " + (currentelement + 1) + " name: " + imagemodel.getImagepath() + "   x: " + coordinates[0] + "  " + "y: " + coordinates[1]);
                    }
                    
                    try {
                        makeImageWindow(coordinates, jwindowlist, imagemodel);
                    } catch (IOException ex) {
                        Logger.getLogger(ImageWindowMaker.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    
                    /* Here there is some silly wizardry to flip the list after first element, to have it in clockwise order */
                    
                    if (currentelement == 0 && !tryflag){
                        currentmodellist.remove(0);
                        Collections.reverse(currentmodellist);
                        currentelement--;
                        tryflag = true;
                    }
                    
                    currentelement++;
                    
                    


                }
            } else {
                
                /*System.out.println("No current TV shows");

                JTextArea jm = new JTextArea();
                
                jm.setBounds(5,5,650,430);
                jm.setBackground(Color.BLACK);
                jm.setForeground(Color.WHITE);
                jm.setFont(new Font("Book Antiqua", Font.PLAIN, 32));
                jm.setText("No TV shows available currently");
                
                windowcenter.getContentPane().removeAll();
                windowcenter.add(jm);
                windowcenter.repaint();
                windowcenter.setVisible(true);
                notvshowsflag = true;*/
                
                makeNoTVShowsWindow();
                
                
            }
            
            //System.out.println("");
            
            i++;
            
            currentmodellist.clear();
            currentelement = 0;
            tryflag = false;
            
            currentminute+=timeinterval;                  /* Get rid of this later */
            previousminute+=timeinterval;
            nextminute+=timeinterval;
            
            if(currentminute>=60){
                currentminute-=60;
                currenthour++;
                if(currenthour == 24) currenthour = 0;
            }
            
            if(previousminute>=60){
                previousminute-=60;
                previoushour++;
                if(previoushour == 24) previoushour = 0;
            }
            
            if(nextminute>=60){
                nextminute-=60;
                nexthour++;
                if(nexthour == 24) nexthour = 0;
            }
            
            
            if(currenthour > 1 && currenthour < 6) {
                timer.stop();
                System.exit(0);
            }
        
        
    }
    
}

class ShowAction extends AbstractAction {
    
    String imagepath;
    JLabel jl = new JLabel();
    JWindow window;
    
    JFrame popupwindow = new JFrame();
    
    
    public ShowAction(String imagepath, JWindow window) {
        super("Show");
        this.imagepath = imagepath;
        this.window = window;
    }
    public void actionPerformed(ActionEvent e) {
        //System.out.println("test show action");
        BufferedImage bi_x = null;
        try {
            bi_x = ImageIO.read(new File(System.getProperty("user.dir")+"/10_PRZDANE/"+imagepath));
        } catch (IOException ex) {
            Logger.getLogger(ImageWindowMaker.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image bi2 = bi_x.getScaledInstance(1340, 792, Image.SCALE_SMOOTH);

        ImageIcon bi_exit = new ImageIcon(bi2);

        jl.setBounds(5,5,1340,792);
        jl.setBackground(Color.BLACK);
        jl.setForeground(Color.WHITE);
        jl.setIcon(bi_exit);

        popupwindow.setSize(1370,845);
        popupwindow.setLayout(null);
        popupwindow.setLocation(400,200);

        popupwindow.add(jl);
        
        popupwindow.setVisible(true);
        popupwindow.toFront();
        
        //window.setVisible(false);
        //window.setVisible(true);
        window.repaint();
        
    }
}

class ForumAction extends AbstractAction {
    
    String imagepath;
    JLabel jl = new JLabel();
    JWindow window;
    
    JFrame popupwindow = new JFrame();
    
    
    public ForumAction(String imagepath, JWindow window) {
        super("Forum");
        this.imagepath = imagepath;
        this.window = window;
    }
    public void actionPerformed(ActionEvent e) {
        //System.out.println("test forum action");
        BufferedImage bi_x = null;
        try {
            bi_x = ImageIO.read(new File(imagepath));
        } catch (IOException ex) {
            Logger.getLogger(ImageWindowMaker.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image bi2 = bi_x.getScaledInstance(1340, 792, Image.SCALE_SMOOTH);

        ImageIcon bi_exit = new ImageIcon(bi2);

        jl.setBounds(5,5,1340,792);
        jl.setBackground(Color.BLACK);
        jl.setForeground(Color.BLACK);
        jl.setIcon(bi_exit);

        popupwindow.setBackground(Color.BLACK);
        popupwindow.setSize(1370,845);
        popupwindow.setLayout(null);
        popupwindow.setLocation(400,200);

        popupwindow.add(jl);
        popupwindow.getContentPane().setBackground(Color.BLACK);
        
        popupwindow.setVisible(true);
        popupwindow.toFront();
        
        //window.setVisible(false);
        //window.setVisible(true);
        window.repaint();
        
    }
}

class UrlAction extends AbstractAction {
    
    String url;
    JWindow window;
    
    public UrlAction(String url, JWindow window) {
        super("Url");
        this.url = url;
        this.window = window;
    }
    public void actionPerformed(ActionEvent e) {
        //System.out.println("test url action");
        
        url = url.substring(0, url.length() - 1);  
        
        //System.out.println(url);
        
        Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(url);
			desktop.browse(oURL);
		} catch (URISyntaxException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException ex) {
            Logger.getLogger(UrlAction.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        //window.setVisible(false);
        //window.setVisible(true);
        window.repaint();
        
    }
}

