package comt.mongoclientapp;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.*;
public class MongoApp {
	MongoClient client;
	MongoDatabase db;
	MongoCollection<Document> collection;
	public static final String COLLECTION_NAME="employee collection";
	public MongoApp() {
		try {
		client=new MongoClient("localhost",27017);
		db=client.getDatabase("payroll");
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void createCollection() {
		try {
			db.createCollection(COLLECTION_NAME);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
	public void getCollections() {
		collection=db.getCollection(COLLECTION_NAME);
	}
	public void addToCollection(String employeeName,String department) {
		Document doc=new Document()	;
		doc.put("employeeName", employeeName);
		doc.put("department", department);
		collection.insertOne(doc);
	}
	public void viewDocumnets() {
		FindIterable<Document> it=collection.find();
		for(Document d:it) {
			System.out.println(d);
		}
	}
	public void updateDoc()
	{
		Document query=new Document().append("empname", "sam");
		try
		{
			Bson updates=Updates.combine(Updates.set("dept", "marketing"));
			UpdateResult updateresult=collection.updateOne(query,updates);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
	

}