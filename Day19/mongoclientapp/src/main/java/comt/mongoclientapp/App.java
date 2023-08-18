package comt.mongoclientapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        MongoApp obj=new MongoApp();
        obj.createCollection();
        obj.getCollections();
        obj.addToCollection("Peter", "Sales");
        obj.viewDocumnets();   
        obj.updateDoc();
}
}