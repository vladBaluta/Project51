package boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/v1/")
public class BoundaryApiImpl {
	
	@GET
	@Path("{username}")
	public Response getMessage(@PathParam("username") String username) {
		return Response.status(200).entity(String.format("Hallo, %s!", username)).build();
	}
}
