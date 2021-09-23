package serveresource

import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("server")
class Resource {

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    fun getServerStatus() : Response{
      return Response.ok("Welcome").build()
    }
}