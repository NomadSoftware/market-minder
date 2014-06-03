package biz.nomadsoftware.market_minder.resources;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import biz.nomadsoftware.market_minder.dao.AisleDAO;

@Path("/accounts/{account_id}/stores/{store_id}/aisles")
@Produces(MediaType.APPLICATION_JSON)
public class AisleResource extends BaseResource {

	private final AisleDAO dao;

	public AisleResource(AisleDAO dao) {
		this.dao = dao;
	}

}
