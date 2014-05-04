package Blueprints.Interfaces;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.frames.Adjacency;
import com.tinkerpop.frames.Incidence;
import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.VertexFrame;

public interface Resource extends VertexFrame {
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

	@Adjacency(label = "owns", direction = Direction.IN)
	public User getCreatedByUser();

	@Incidence(label = "manipulation")
	public Iterable<Manipulation> getManipulations();

	@Incidence(label = "manipulation", direction = Direction.IN)
	public Manipulation addManipulations(User user);

	@Incidence(label = "manipulation")
	public void removeManipulations(Manipulation manipulaltion);

	//	@Adjacency(label = "created", direction = Direction.IN)
	//	public Iterable<User> getCreatedByPerson();

	//	@Incidence(label = "created", direction = Direction.IN)
	//	public Iterable<CreatedInfo> getCreatedInfo();
}