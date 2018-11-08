package Kata4.main;

import Kata4.model.Histogram;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.view.MailListReader;

public class KATA4 {
    
    public static void main(String[] args) {
        
        MailListReader reader = new MailListReader("emails.txt");
        Histogram<String> histogram = MailHistogramBuilder.build((reader.read()));
        new HistogramDisplay(histogram).execute();
    }
    
}
