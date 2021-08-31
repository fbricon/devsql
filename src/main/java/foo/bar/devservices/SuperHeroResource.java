package foo.bar.devservices;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/heroes")
public class SuperHeroResource {

    @PostConstruct
    @Transactional
    public void init() {
        new Hero("Superman").persist();
        new Hero("Batman").persist();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Hero> hello() {
        List<Hero> heroes = Hero.listAll();
        return heroes;
    }

    @POST
    @Transactional
    public void create(String name) {
        new Hero(name).persist();
    }
}