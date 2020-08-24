package factory.software.santhosh;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Program2{
   public static void main(String args[]) throws IOException {
      //Creating a File object for directory
      File directoryPath = new File("D:/MicroServices");
      //List of all files and directories
      File filesList[] = directoryPath.listFiles();
      String pattern = "MMMM";	// month wise pattern	
     // String pattern = "yyyy-MMMM-dd";//day wise pattern
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		      
      List<String> listdays=new ArrayList<>();
      for(File file : filesList) {
          BasicFileAttributes attrs=Files.readAttributes(file.toPath(), BasicFileAttributes.class);
    	  long millis = attrs.creationTime().toMillis();
    	  String formatted = simpleDateFormat.format(millis);
    	  
    	  listdays.add(formatted);
      }
      
  //   System.out.println(file);
System.out.println(listdays);

Map<String, Long> collect = listdays.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
System.out.println(collect);

   }
}

output:{August=10} //Monthwise file count

{2020-August-24=1, 2020-August-12=1, 2020-August-11=1, 2020-August-15=3, 2020-August-18=4} //Daywise file count

