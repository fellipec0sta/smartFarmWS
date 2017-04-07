package serviços;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import modelos.Rele;


@Path("/rele")
public class ServiceRele {
	
private static Map<Integer, Rele> al = new HashMap<Integer, Rele>();
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Rele getRele(){
        return al.get(0);
    }

    @POST
    @Path("/{valor}")
    @Produces(MediaType.APPLICATION_JSON)
    public void postRele(@PathParam("valor")String valor){
        Rele r = new Rele(valor);
        al.put(0, r);
    }

}
