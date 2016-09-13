package pl.radmit.javaee.rest;

import pl.radmit.javaee.rest.product.request.ProductPostRequest;
import pl.radmit.javaee.rest.product.response.ProductResultResponse;
import pl.radmit.javaee.rest.product.response.Todo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by rmorawski on 13.09.16.
 */
@Path("/hello")
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
@Consumes({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
public class RestServiceApplication {

//    @GET
//    @Path("/{param}")
//    public Response getMsg(@PathParam("param") String msg) {
//
//        String output = "Jersey say : " + msg;
//
//        return Response.status(200).entity(output).build();
//
//    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Todo> getXML() {
        Todo todo = new Todo();
        todo.setSummary("This is my first todo");
        todo.setDescription("This is my first todo");

        Todo todo2 = new Todo();
        todo2.setSummary("This is my first todo2");
        todo2.setDescription("This is my first todo2");

        List<Todo> lista = new ArrayList<Todo>();
        lista.add(todo);
        lista.add(todo2);

        return lista;
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
    public ProductResultResponse addProduct(ProductPostRequest request) {
        ProductResultResponse rr = new ProductResultResponse();
        rr.setId(1L);
        rr.setProductName(request.getProductName());
        return rr;
//        Todo todo = new Todo();
//        todo.setSummary("This is my first todo");
//        todo.setDescription("This is my first todo");
//        return todo;
    }
}
