package org.sp.jersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionHandler implements ExceptionMapper<EmployeeException> {
    public Response toResponse(EmployeeException ex) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
