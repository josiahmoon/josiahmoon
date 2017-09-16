package Tetris;

import sun.management.snmp.jvmmib.EnumJvmThreadCpuTimeMonitoring;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class TetrisMain extends Canvas implements Runnable, KeyListener{

    public static final int WIDTH = 400, HEIGHT = 540;

//MAIN

    public static void main(String args[]){
        JFrame frame = new JFrame("Tetris");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        TetrisMain tm = new TetrisMain();
        frame.add(tm);
        frame.setVisible(true);
        tm.start();
    }

//START

    public void start(){
        Thread t = new Thread(this);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }

//RUN

    public void run(){
        boolean running = true;
        while(running) {
            update();
            BufferStrategy buf = getBufferStrategy();
            if(buf==null){
                createBufferStrategy(3);
                continue;
            }
            Graphics2D g = (Graphics2D) buf.getDrawGraphics();
            render(g);
            buf.show();
        }
    }

//UPDATE

    public void update() {

    }

//RENDER

    public void render(Graphics2D g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }

//KEY PRESSED

    public void keyPressed(KeyEvent e){

    }

//KEY TYPED

    public void keyTyped(KeyEvent e){

    }


//KEY RELEASED
    public void keyReleased(KeyEvent e){

    }

}
