package xzw.shuai.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author DELL
 */
public class TankFrame extends Frame {

    int x =200, y = 200;

    public TankFrame() {

        // 窗口大小
        this.setSize(500, 500);
        // 不允许改变窗口大小
        this.setResizable(false);
        // 标题
        this.setTitle("tank war");
        this.setVisible(true);
        // 监听关闭窗口触发事件
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    @Override
    public void paint(Graphics g) {

        /*         x
            --------------->
             |
             |
       y     |
             |
             |

         */
        g.setColor(new Color(0x43B5A3));
        g.fillRect(x, y, 50, 50);
        x += 10;
        y +=10;
        System.out.println("paint");


    }


}
