package mongoproject.phondb;
import com.mongodb.MongoClient;

import org.bson.Document;
import com.mongodb.client.*;
public class Phonedb {
		MongoClient client;
		MongoDatabase db;
		MongoCollection<Document> collection;
		public static final String COLLECTION_NAME="phonedb";
		public Phonedb() {
			try {
			client=new MongoClient("localhost",27017);
			db=client.getDatabase("Phonedb");
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
		public void addToCollection(int transaction_id,String sender_no,String receiver_no,int msg_len,String receiving_time) {
			Document doc=new Document()	;
			doc.put("transaction_id", transaction_id);
			doc.put(" sender_no",  sender_no);
			doc.put(" receiver_no", receiver_no );
			doc.put(" message_len",  msg_len);
			doc.put(" receiving_time",receiving_time);
			collection.insertOne(doc);
		}
		public void viewDocumnets() {
			FindIterable<Document> it=collection.find();
			for(Document d:it) {
				System.out.println(d);
			}
		}
		

}
