package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.MediaType;
 
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
@Path("/users")

public class UserResource {
	
	    private static Map<UUID, User> DB = new HashMap<>(); 
	     
	    @GET
	    @Produces(MediaType.APPLICATION_JSON_VALUE)
	    public Users getAllUsers() {
	        Users users = new Users();
	        users.setUsers(new ArrayList<>(DB.values()));
	        return users;
	    }
	     
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON_VALUE)
	    @Produces(MediaType.APPLICATION_JSON_VALUE)
	    public Response createUser(User user) throws URISyntaxException 
	    {
	    	
	    	System.out.println("This is the user firstName:     " + user.getFirstName());
        	System.out.println("This is the user lastName:     " + user.getLastName());
	    	
	        if(user.getFirstName() == null || user.getLastName() == null) {  	
	            return Response.status(400).entity("Please provide all mandatory inputs").build();
	        }
	        //user.setId(DB.values().size()+1);
	        user.setId(UUID.randomUUID());
	        user.setUri("/user-management/"+user.getId());
	        DB.put(user.getId(), user);
	        return Response.status(201).contentLocation(new URI(user.getUri())).build();
	    }
	 
	    @GET
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON_VALUE)
            public Response getUserById(@PathParam("id") UUID id) throws URISyntaxException
	    {
                User user = DB.get(id);
	        if(user == null) {
	            return Response.status(404).build();
	        }
	        return Response
	                .status(200)
	                .entity(user)
	                .contentLocation(new URI("/user-management/"+id)).build();
	    }
	 
	    @PUT
	    @Path("/{id}")
	    @Consumes(MediaType.APPLICATION_JSON_VALUE)
	    @Produces(MediaType.APPLICATION_JSON_VALUE)
            public Response updateUser(@PathParam("id") UUID id, User user) throws URISyntaxException
	    {
                User temp = DB.get(id);
                if (temp == null) {
                    return Response.status(404).build();
                }
	        temp.setFirstName(user.getFirstName());
	        temp.setLastName(user.getLastName());
	        DB.put(temp.getId(), temp);
	        return Response.status(200).entity(temp).build();
	    }
	 
	    @DELETE
	    @Path("/{id}")
	    public Response deleteUser(@PathParam("id") UUID id) throws URISyntaxException {
	        User user = DB.get(id);
	        if(user != null) {
	            DB.remove(user.getId());
	            
	            //for loop through collection, get(id) - 1, decrement setID and setUri
	            
	            
	            return Response.status(200).build();
	        }
	        return Response.status(404).build();
	    }
	     
	    static
	    {
	        User user1 = new User();
	        UUID uuid1 = UUID.randomUUID();
	        user1.setId(uuid1);
	        user1.setFirstName("John");
	        user1.setLastName("Wick");
	        user1.setUri("/user-management/" + uuid1);
	 
	        UUID uuid2 = UUID.randomUUID();
	        User user2 = new User();
	        user2.setId(uuid2);
	        user2.setFirstName("Harry");
	        user2.setLastName("Potter");
	        user2.setUri("/user-management/" + uuid2);
	 
	        UUID uuid3 = UUID.randomUUID();
	        User user3 = new User();
	        user3.setId(uuid3);
	        user3.setFirstName("Ted");
	        user3.setLastName("Nugent");
	        user3.setUri("/user-management/" + uuid3);
	        
	        DB.put(user1.getId(), user1);
	        DB.put(user2.getId(), user2);
	        DB.put(user3.getId(), user3);
	    }
}
