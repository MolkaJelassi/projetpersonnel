package tn.esprit.beautifulminds.services.other;

import javax.ejb.Remote;

@Remote
public interface congeServiceRemote {
	public Integer getCar(Integer id, Integer j);
}
