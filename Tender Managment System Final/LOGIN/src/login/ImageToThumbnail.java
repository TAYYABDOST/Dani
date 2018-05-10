/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author apex
 */
public class ImageToThumbnail {
     
    public String fromDir = null;
    public String toDir = null;
 
    public ImageToThumbnail(String fromDir,String ToDir)
    {
      super();
      this.fromDir = fromDir;
      this.toDir = ToDir;
    }
    
    public void CreateThumb(int width,int height) throws IOException
    {
     File f = new File(this.fromDir);
     File[] flist = f.listFiles(new FilenameFilter() {
         @Override
         public boolean accept(File file, String string) {
           
             return string.toLowerCase().endsWith(".jpeg") || string.toLowerCase().endsWith(".jpg");
             
         }
     });
     File f1 = new File(this.toDir + File.separator + "thumbnails");
      f1.mkdir();
      
        for (int i = 0; i < flist.length; i++) 
        {
         BufferedImage a = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
         Graphics2D g = (Graphics2D)a.getGraphics();
         g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
          BufferedImage bimg = null;
          bimg = ImageIO.read(new File(this.fromDir + File.separator + flist[i].getName()));
//          Dimension d = reSIZEImage(bimg,new Dimension(width,height));
//           Image a1 = bimg.getScaledInstance(d.width, d.height,Image.SCALE_SMOOTH);
//          g.drawImage(bimg,(width / 2)- d.width / 2 , (height / 2) - d.height / 2,null);
          
        }
    }
}
