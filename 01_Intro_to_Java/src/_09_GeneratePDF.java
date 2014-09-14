import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class _09_GeneratePDF {
	public static void main(String[] args) {
		try {
			
			Document cardsPDF = new Document();
			PdfWriter.getInstance(cardsPDF, new FileOutputStream("Deck-of-Cards.pdf"));
			cardsPDF.open();
			
			PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100F);
            table.getDefaultCell().setFixedHeight(180F);
            

            BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
            Font black = new Font(baseFont, 75f, 0, BaseColor.BLACK);
            Font red = new Font(baseFont, 75f, 0, BaseColor.RED);
            
            String card = "";
            String face = "";
            char suit = ' ';

            for (int f = 14; f >= 2; f--) {
	            	switch (f) {
	            	case 10:
		            		face = f + "";
		            		break;
	            	case 11:
		            		face = "J ";
		            		break;
	            	case 12:
				            face = "Q ";
				            break;
	            	case 13:
				            face = "K ";
				            break;
	            	case 14:
				            face = "A ";
				            break;
	            	default:
				            face = f + " ";
				            break;
	            	}
	
	            	for (int s = 1; s <= 4; s++) {
	            		switch (s) {
	            		case 1:
					            suit = '\u2663';
					            break;
	            		case 2:
					            suit = '\u2666';
					            break;
	            		case 3:
					            suit = '\u2665';
					            break;
	            		case 4:
					            suit = '\u2660';
					            break;
	            		}
	
	            card = face + suit;
	            if (s == 1 || s == 4) {
	            	table.addCell(new Paragraph(card, black));
	            } 
	            else if (s == 2 || s == 3) {
	            	table.addCell(new Paragraph(card, red));
	            }
	        }
	    }       
            cardsPDF.add(table);
            cardsPDF.close();   
		}
		catch (Exception e) {
            e.printStackTrace();
		}
	}
}
