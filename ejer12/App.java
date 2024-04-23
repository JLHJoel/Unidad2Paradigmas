//Lozano Hernandez Joel
//Ejercicio 12 Archivos Json
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {
  /**
   * @param args
   * @throws IOException 
   * @throws FileNotFoundException 
   * @throws org.json.simple.parser.ParseException 
   */
  public static void main(String[] args) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
    System.out.println("Ejercicio 12 Archivos Json");
    JSONParser jsonP = new JSONParser();
    try(FileReader reader = new FileReader("C:\\Users\\JoelJr\\Desktop\\Paradigmas\\ejer12\\posts.json")){
      Object obj = jsonP.parse(reader);
      JSONArray empList =(JSONArray) obj;
      System.out.println(empList);
      empList.forEach(emp -> parseEmpObj((JSONObject)emp));

    }
    catch (FileNotFoundException e){e.printStackTrace();}
    catch (IOException e){e.printStackTrace();}
   
      // Object obj= new Object();
      // try {
      //   obj = parser.parse(new FileReader("posts.json"));
      // } catch (org.json.simple.parser.ParseException e) {
      //   // TODO Auto-generated catch block
      //   e.printStackTrace();
      // }
      // JSONObject jsonObject = (JSONObject) obj;
      // JSONArray array = (JSONArray) jsonObject.get();
      // System.out.println("JSON Leido: " + jsonObject);

    
  }
  private static void parseEmpObj(JSONObject emp) {
    JSONObject empObj = (JSONObject) emp.get("posts");
    //get emp firstname, lastname, website
    String userId = (String) empObj.get("userId").toString();
    String id = (String) empObj.get("id").toString();
    String title = (String) empObj.get("title").toString();
    String body = (String) empObj.get("body").toString();
    System.out.println("User = " + userId);
    System.out.println("ID = " + id);
    System.out.println("Title = " + title);
    System.out.println("Message = " + body);
  }
}