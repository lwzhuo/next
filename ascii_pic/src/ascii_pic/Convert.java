package ascii_pic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Convert {
	public static void main(String[] args){
		File file = new File("1.png");
		try{
			BufferedImage bi = (BufferedImage)ImageIO.read(file);
			int height = bi.getHeight();
			int width = bi.getWidth();
//			System.out.println(height+" "+width+" "+bi.getColorModel());
			for(int y=0;y<height-1;y++){
				for(int x=0;x<width-1;x++)
				System.out.print(bi.getRGB(x,y)==-1?"  ":"##");
				System.out.println();
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
