import jakarta.ws.rs.core.UriBuilder
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import serveresource.Resource
import java.net.URI


fun main(){

    val baseUri:URI = UriBuilder.fromUri("http://localhost").port(8080).build()
    val config:ResourceConfig = ResourceConfig(Resource::class.java)
    val server = GrizzlyHttpServerFactory.createHttpServer(baseUri,config)
}

