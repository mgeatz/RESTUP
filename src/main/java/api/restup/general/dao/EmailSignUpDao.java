package api.restup.general.dao;

import api.restup.util.MongoConnect;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class EmailSignUpDao {

	private MongoCollection databaseCollection;
	private MongoDatabase database;

	public EmailSignUpDao() {
		MongoConnect mongoConnect = new MongoConnect("EmailSignUp", "emails");
		this.databaseCollection = mongoConnect.getCollection();

		MongoClient mongoClient = new MongoClient();
		MongoDatabase database = mongoClient.getDatabase("EmailSignUp");
		this.database = database;
	}

	public void addEmail(String emailAddress, String clientIP) {
		MongoCollection collection = getDatabaseCollection();
		Document document = new Document("emailAddress", emailAddress).append("clientIP", clientIP);
		collection.insertOne(document);
	}

	public MongoCollection getDatabaseCollection() {
		return databaseCollection;
	}

	public void setDatabaseCollection(MongoCollection databaseCollection) {
		this.databaseCollection = databaseCollection;
	}
}
