package org.francomoyano.quarkus.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.francomoyano.quarkus.models.Product;

import java.util.List;
import java.util.Optional;

@Path("/api/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductService {

    @GET
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1, "Lavarropas Drean 10kg", 174990.50),
                new Product(2, "Plancha ATMA 500w", 25790.00)
        );
    }

    @GET
    @Path("/{id}")
    public Optional<Product> getBook(@PathParam("id") int id) {
        return getAllProducts().stream().filter(product -> product.getId() == id).findFirst();
    }
}
