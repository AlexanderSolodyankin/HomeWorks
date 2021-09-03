package com.company.service;

import com.company.dao.UserDaoInterface;
import com.company.dao.impl.UserDaoImpl;
import com.company.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/user")
public class UserService {
    UserDaoInterface userDao = new UserDaoImpl();

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response save(User user){

        user = userDao.saveUser(user);
        String out;
        if(user != null){
            out = "Данные приняты ваш код: " + user.hashCode();
        }else out = "Не верный ввод данных";
        return Response.ok().entity(out).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll(){
        List<User> allUsers = userDao.getAll();
        return Response.ok().entity(allUsers).build();
    }
}
