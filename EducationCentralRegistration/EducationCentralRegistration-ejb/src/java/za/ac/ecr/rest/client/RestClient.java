/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.ecr.rest.client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import za.ac.ecr.dataobject.StudentDO;

/**
 *
 * @author QXW5421
 */
public class RestClient {


    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/MessagingController-war/rest";

    public RestClient() {
            client = javax.ws.rs.client.ClientBuilder.newClient();
            webTarget = client.target(BASE_URI).path("mc");
        }

        public void detele(StudentDO student) throws ClientErrorException {
            webTarget.request().delete();
        }

        public void create(StudentDO student) throws ClientErrorException {
            webTarget.request().post(Entity.json(student));
        }

        public void update(StudentDO student) throws ClientErrorException {
            webTarget.request().put(Entity.json(student));
        }

        public <T> T getStudent(Class<T> responseType, Long id) throws ClientErrorException {
            WebTarget resource = webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
            return resource.request().get().readEntity(responseType);
        }

        public void close() {
            client.close();
        }  
}

