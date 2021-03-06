package Blueprints.Interfaces;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.frames.Adjacency;
import com.tinkerpop.frames.Property;

public interface Resource {
	@Property("rid")
	public void setRid(String rid);

	@Property("creatorid")
	public void setCreatorId(String creatorid);

	@Property("walluserid")
	public void setWallUserId(String walluserid);

	@Property("type")
	public void setType(String type);

	@Property("body")
	public void setBody(String body);

	@Property("doc")
	public void setDoc(String doc);

	@Property("rid")
	public String getRid();

	@Property("creatorid")
	public String getCreatorId();

	@Property("walluserid")
	public String getWallUserId();

	@Property("type")
	public String getType();

	@Property("body")
	public String getBody();

	@Property("doc")
	public String getDoc();

	@Adjacency(label = "owns")
	public User getCreatedByUser();

	@Adjacency(label = "creates")
	public void addManipulation(Manipulation manipulation);

	@Adjacency(label = "creates")
	public void removeManipulation(Manipulation manipulation);

	@Adjacency(label = "creates")
	public Iterable<Manipulation> getManipulations();
}