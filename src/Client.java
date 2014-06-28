
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
    }
static String temp1,passname;

public class PTTInstance{
  File wavFile=new File("input.wav");  
  AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
  TargetDataLine line;
  
  AudioFormat getAudioFormat(){
    float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                                             channels, signed, bigEndian);
        return format;
}
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        area = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        quotetxt = new javax.swing.JTextArea();
        hostname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chatmsg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        portname = new javax.swing.JTextField();
        PTTButton = new javax.swing.JButton();

        area.setText("jTextField1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jButton2.setText("Refresh");
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DexChat");
        setName("frame12");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });

        jButton1.setText("Click here or press enter to send your message");
        jButton1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton1MouseWheelMoved(evt);
            }
        });
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quotetxt.setColumns(20);
        quotetxt.setEditable(false);
        quotetxt.setRows(5);
        quotetxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                quotetxtMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(quotetxt);

        hostname.setEditable(false);
        hostname.setText("localhost");
        hostname.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });

        jLabel1.setText("Server Name");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });

        chatmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatmsgActionPerformed(evt);
            }
        });
        chatmsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chatmsgKeyTyped(evt);
            }
        });

        jLabel2.setText("Your name");
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved1(evt);
            }
        });

        username.setEditable(false);
        username.setText("Default Name");
        username.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });

        jLabel3.setText("Port Number");
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });

        portname.setEditable(false);
        portname.setText("1234");
        portname.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });

        PTTButton.setText("Push to Talk");
        PTTButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PTTButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PTTButtonMouseReleased(evt);
            }
        });
        PTTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTTButtonActionPerformed(evt);
            }
        });
        PTTButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PTTButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PTTButtonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hostname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(portname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PTTButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addComponent(chatmsg)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(hostname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(portname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chatmsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(PTTButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        
Socket s = DexCCL.getSocket(port); 
try
{

Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
    {
        out.println(chatmsg.getText()); 
        chatmsg.setText("");
        if(!(chatmsg.getText().equalsIgnoreCase("CMD_ADMIN_EXIT")))
        {
            
        

//String quote="";
        while(true)
        {
    
            String input=in.nextLine();
            if(input.equalsIgnoreCase("END"))
                break;
            else
                quote = quote+"\n"+input;
        }}
    }
else if (app.equalsIgnoreCase("DISAPPROVE"))
{
    
}
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("REFRESH"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        username.setText(Launcher.username.getText());
        hostname.setText(Launcher.hostname.getText());
        portname.setText(Launcher.portname.getText());
        passname=Launcher.passname.getText();
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the DexChat Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("CMD_CONNECT"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
else if(app.equalsIgnoreCase("DISAPPROVE"))
{
    quotetxt.setText("Connection Failed! The possible reasons are:\n\t1. You entered a wrong password.\n\t2. The server version is not upto date.\nTry closing the chatbox and re-entering the details.\n Exiting in(seconds) ");
    //chatmsg.setEditable(false);
    //jButton1.setEnabled(false);
    //jButton3.setEnabled(false);
    //for(int i=30;i>0;i--)
    //{
     //   
     //   quotetxt.append("i\t");
     
     //this.wait(1000);
   // }
    dispose();
}
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 



quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("REFRESH"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton1MouseWheelMoved
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
    {
        out.println(chatmsg.getText()); 
        chatmsg.setText("");

//String quote="";
        while(true)
        {
    
            String input=in.nextLine();
            if(input.equalsIgnoreCase("END"))
                break;
            else
                quote = quote+"\n"+input;
        }
    }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseWheelMoved

    private void chatmsgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chatmsgKeyTyped
        String str=chatmsg.getText();
        int run=0;
        char a='q';
        
        
            //len++;
        if(str.endsWith("\\"))
        {
            str = str.substring(0, str.length()-1);
            area.setText(str);  
            //chatmsg.setText(chatmsg.getText().substring(0, chatmsg.getText().length()-1));
            run=1;
        }
        if(run==1)
        {
            int port = Integer.parseInt(portname.getText());
        chatmsg.setText("");
temp1=hostname.getText();

       
Socket s = DexCCL.getSocket(port); 
try
{

Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
    {
        out.println(area.getText()); 
        chatmsg.setText("");
        if(chatmsg.getText().equalsIgnoreCase("CMD_ADMIN_EXIT"))
        {
            System.exit(1);
        }

//String quote="";
        while(true)
        {
    
            String input=in.nextLine();
            if(input.equalsIgnoreCase("END"))
                break;
            else
                quote = quote+"\n"+input;
        }
    }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}
        }       // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_chatmsgKeyTyped

    private void quotetxtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quotetxtMouseMoved
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("REFRESH"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}// TODO add your handling code here:
    }//GEN-LAST:event_quotetxtMouseMoved

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("REFRESH"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseMoved1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved1
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("REFRESH"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved1

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("REFRESH"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved

    private void chatmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatmsgActionPerformed
        int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        
Socket s = DexCCL.getSocket(port); 
try
{

Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
    {
        out.println(chatmsg.getText()); 
        chatmsg.setText("");
        if(!(chatmsg.getText().equalsIgnoreCase("CMD_ADMIN_EXIT")))
        {
            
        

//String quote="";
        while(true)
        {
    
            String input=in.nextLine();
            if(input.equalsIgnoreCase("END"))
                break;
            else
                quote = quote+"\n"+input;
        }}
    }
else if (app.equalsIgnoreCase("DISAPPROVE"))
{
    
}
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_chatmsgActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int port = Integer.parseInt(portname.getText());
temp1=hostname.getText();

        System.out.println("Welcome to the Bart Client\n");
Socket s = DexCCL.getSocket(port); 
try
{
System.out.println("Connected on port " + port);
Scanner in =new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(),true); 




out.println(username.getText());
out.println(passname);
String app=in.nextLine();
String quote="";
if(app.equalsIgnoreCase("APPROVE"))
        {
            
        
    out.println("CMD_DISCONNECT"); 

while(true)
{
    
    String input=in.nextLine();
    if(input.equalsIgnoreCase("END"))
        break;
    else
        quote = quote+"\n"+input;
} }
// disconnect from the server
out.println("CMD_EXIT"); 
//System.out.println(in.nextLine());

s.close(); 

// write the quote on the chalkboard

quotetxt.setText("");

         quotetxt.append(quote+"\n");



}
catch (Exception e)
{
e.printStackTrace(); 
} // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void PTTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTTButtonActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_PTTButtonActionPerformed

    private void PTTButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PTTButtonKeyPressed
        // TODO add your handling code here:
       
            
    }//GEN-LAST:event_PTTButtonKeyPressed

    private void PTTButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PTTButtonKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_PTTButtonKeyReleased

    private void PTTButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PTTButtonMousePressed
        // TODO add your handling code here:
        System.out.println("Test begins");
        
       
 
    }//GEN-LAST:event_PTTButtonMousePressed

    private void PTTButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PTTButtonMouseReleased
        // TODO add your handling code here:
         System.out.println("Test done!");
    }//GEN-LAST:event_PTTButtonMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Client().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PTTButton;
    private javax.swing.JTextField area;
    private javax.swing.JTextField chatmsg;
    private javax.swing.JTextField hostname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField portname;
    private javax.swing.JTextArea quotetxt;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
