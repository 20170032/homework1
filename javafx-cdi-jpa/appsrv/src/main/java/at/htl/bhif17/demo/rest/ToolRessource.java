package at.htl.bhif17.demo.rest;

import at.htl.bhif17.demo.dao.ToolDao;
import at.htl.bhif17.demo.model.Tool;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("tools")
@Produces(MediaType.APPLICATION_JSON)
@Transactional
public class ToolRessource {
    @Inject
    ToolDao toolDao;

    @GET
    public List<Tool> all(){
        return toolDao.getAll();
    }
}
