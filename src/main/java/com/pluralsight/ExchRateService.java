package com.pluralsight;

/**
 * Created by sdaribazaron on 2016-08-10.
 */
import com.pluralsight.model.ExchRateLite;
import com.pluralsight.repository.ExchRateProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Solbon Daribazaron <s.daribazaron@visiona.pl>
 */

@Path("exchRates")
@Produces(MediaType.APPLICATION_JSON)
public class ExchRateService {

    public static final String EXCH_RATE_MNGR = "er.ExchRate-Mgr";

    @POST
    @Path("exchRate")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(ExchRateLite rate) {
        ExchRateProvider provider = new ExchRateProvider();

        provider.add(rate);
        return Response.ok().build();
    }

}