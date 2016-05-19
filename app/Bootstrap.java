import java.io.FileInputStream;
import java.io.FileNotFoundException;

import play.db.jpa.Blob;
import play.jobs.*;
import play.libs.MimeTypes;
import play.test.*;
import models.*;

@OnApplicationStart
public class Bootstrap extends Job {
	public void doJob() throws FileNotFoundException {
		Fixtures.deleteDatabase();
		Fixtures.loadModels("data.yml");

		String photoName1 = "public/images/homer.gif";
		Blob blob1 = new Blob();
		blob1.set(new FileInputStream(photoName1), MimeTypes.getContentType(photoName1));
		User homer = User.findByEmail("homer@simpson.com");
		homer.profilePicture = blob1;
		homer.save();

		String photoName2 = "public/images/marge.gif";
		Blob blob2 = new Blob();
		blob2.set(new FileInputStream(photoName2), MimeTypes.getContentType(photoName2));
		User marge = User.findByEmail("marge@simpson.com");
		marge.profilePicture = blob2;
		marge.save();

		String photoName3 = "public/images/lisa.gif";
		Blob blob3 = new Blob();
		blob3.set(new FileInputStream(photoName3), MimeTypes.getContentType(photoName3));
		User lisa = User.findByEmail("lisa@simpson.com");
		lisa.profilePicture = blob3;
		lisa.save();

		String photoName4 = "public/images/bart.png";
		Blob blob4 = new Blob();
		blob4.set(new FileInputStream(photoName4), MimeTypes.getContentType(photoName4));
		User bart = User.findByEmail("bart@simpson.com");
		bart.profilePicture = blob4;
		bart.save();

		String photoName5 = "public/images/maggie.png";
		Blob blob5 = new Blob();
		blob5.set(new FileInputStream(photoName5), MimeTypes.getContentType(photoName5));
		User maggie = User.findByEmail("maggie@simpson.com");
		maggie.profilePicture = blob5;
		maggie.save();

		String photoName6 = "public/images/ned.png";
		Blob blob6 = new Blob();
		blob6.set(new FileInputStream(photoName6), MimeTypes.getContentType(photoName6));
		User ned = User.findByEmail("ned@flanders.com");
		ned.profilePicture = blob6;
		ned.save();
	}
}
