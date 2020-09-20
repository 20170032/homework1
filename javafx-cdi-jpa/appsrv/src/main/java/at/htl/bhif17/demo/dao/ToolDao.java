package at.htl.bhif17.demo.dao;

import at.htl.bhif17.demo.model.Tool;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
@Dependent
public class ToolDao {
    @Inject
    EntityManager em;

    public List<Tool> getAll(){
       return em.createQuery("select t from Tool t", Tool.class).getResultList();
    }
    public Tool save(Tool t){
        return em.merge(t);
    }
    public Tool findById(int id) {
        return em.find(Tool.class, id);
    }
}
