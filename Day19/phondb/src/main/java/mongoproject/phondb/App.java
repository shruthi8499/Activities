package mongoproject.phondb;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Phonedb obj=new Phonedb();
        obj.createCollection();
        obj.getCollections();
        obj.addToCollection(1,"9963040649","8499929356",5,"05:30");
        obj.addToCollection(2,"8594698756","7895648264",15,"12:30");
        obj.addToCollection(3,"9874513455","8459678456",7,"11:00");
        obj.viewDocumnets();  
        
    }
    
}
