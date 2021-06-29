/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.circleimagesapp;

import com.mycompany.circleimagesapp.models.ImageModel;
import java.awt.AWTException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFrame;
import org.apache.commons.io.filefilter.WildcardFileFilter;

/**
 *
 * @author Marcin
 */



public class MainClass {
    

    
    public static void main(String[] args) throws InterruptedException, IOException, AWTException{

        //int numberofimages = 4;
        
        JFrame dummyframe = new JFrame("JPrzypTV");                           /* Need a dummy jframe for clickable taskbar icon */
        dummyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dummyframe.setUndecorated(true);
        dummyframe.setVisible(true);
        
        ImageWindowMaker iwm = new ImageWindowMaker();
        
        dummyframe.addWindowListener(new WindowAdapter() {// Window close event             /* Window deiconified helps to bring back back the jwindows to front, since that was a problem */
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            };

            public void windowIconified(WindowEvent e) {// Window minimized event

                iwm.pulldownimagewindows();
                
            }

            public void windowDeiconified(WindowEvent e) {// Window deminimized event

                iwm.pullupimagewindows();

            }
 
        });

        
        FileFilter fileFilter;
        
        int lastid = iwm.getLastId();
                        
        makeGreeting(lastid);       /* say hello */
        
        for (int i=1; i<=lastid; i++){
        
            
            if (i<10){
            
                fileFilter = new WildcardFileFilter("0" + i +"*PICTURE_OUT.png");
            
            } else {
                
                fileFilter = new WildcardFileFilter(i +"*PICTURE_OUT.png");
                
            }

            String test = iwm.findFile(fileFilter);
            //System.out.println(test);
            String[] split = test.split(" ");
            String timetmp = split[2];
            String[] split2 = timetmp.split("-");
            //System.out.println(split2[0] + "   " + split2[1]);
            int hour = Integer.parseInt(split2[0]);
            if (hour == 24) hour = 0;
            if (hour == 25) hour = 1;
            if (hour == 26) hour = 2;
            int min = Integer.parseInt(split2[1]);

            test = test.replace(System.getProperty("user.dir")+"\\10_PRZDANE\\", "");
            test = test.replace(System.getProperty("user.dir")+"/10_PRZDANE/", "");
            String id = test.substring(0,2);

            //System.out.println(id + "   " + test + "   " + hour + "   " + min);
            
            if (i<10){
            
                fileFilter = new WildcardFileFilter("0" + i +"*FORUM.png");
            
            } else {
                
                fileFilter = new WildcardFileFilter(i +"*FORUM.png");
                
            }
            
            String test2 = iwm.findFile(fileFilter);
            
            if (i<10){
            
                fileFilter = new WildcardFileFilter("0" + i +"*URL.txt");
            
            } else {
                
                fileFilter = new WildcardFileFilter(i +"*URL.txt");
                
            }
            
            String test3 = iwm.findFile(fileFilter);
            
            test3 = readFile(test3, StandardCharsets.UTF_8);
            
            
            ImageModel im = new ImageModel(id,hour,min,test,test3,test2);
            iwm.imagemodellist.add(im);

        }
        
        /*
        iwm.imagemodellist.forEach(temp -> {
                System.out.println(temp.getId() + "   " + temp.getImagepath() + "   " + temp.getHour() + "   " + temp.getMin());
            });
        */
        
        
        
        iwm.run();
        

     }
    
    
    //Unnecessary for now
    
    /*
    
    private static String readFile(String filepath) throws FileNotFoundException, IOException{
      
         String everything;
         
         try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        }
         
         
         return everything;
     }
    
    */

    private static String readFile(String path, Charset encoding)           //Simple filereader with charset encoding, need UTF-8
    throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
    
    private static void makeGreeting(int lastid){
        
        System.out.println(" _________  ______   ______      ______  __  __   ______   _________  __   __     \n" +
            "/________/\\/_____/\\ /_____/\\    /_____/\\/_/\\/_/\\ /_____/\\ /________/\\/_/\\ /_/\\    \n" +
            "\\__.::.__\\/\\:::_ \\ \\\\:::_ \\ \\   \\:::__\\/\\ \\ \\ \\ \\\\:::_ \\ \\\\__.::.__\\/\\:\\ \\\\ \\ \\   \n" +
            "  /_\\::\\ \\  \\:(_) \\ \\\\:(_) ) )_    /: /  \\:\\_\\ \\ \\\\:(_) \\ \\  \\::\\ \\   \\:\\ \\\\ \\ \\  \n" +
            "  \\:.\\::\\ \\  \\: ___\\/ \\: __ `\\ \\  /::/___ \\::::_\\/ \\: ___\\/   \\::\\ \\   \\:\\_/.:\\ \\ \n" +
            "   \\: \\  \\ \\  \\ \\ \\    \\ \\ `\\ \\ \\/_:/____/\\ \\::\\ \\  \\ \\ \\      \\::\\ \\   \\ ..::/ / \n" +
            "    \\_____\\/   \\_\\/     \\_\\/ \\_\\/\\_______\\/  \\__\\/   \\_\\/       \\__\\/    \\___/_(  \n" +
            "                                                                                ");
        
        System.out.println();
        System.out.println("JPrzypTV took in " + lastid + " TV programs.");
        System.out.println();

    }
     
     
     
    
}
