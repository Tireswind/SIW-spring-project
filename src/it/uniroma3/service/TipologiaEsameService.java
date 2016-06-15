package it.uniroma3.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import it.uniroma3.models.TipologiaEsame;;

public interface TipologiaEsameService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN", "ROLE_ANONYMOUS"})
	public List<TipologiaEsame> listExamType();

	@Secured({"ROLE_ADMIN"})
	public void insertExamType(TipologiaEsame examType);

	@Secured({"ROLE_ADMIN"})
	public void deleteExamType(Long examTypeId);

	@Secured({"ROLE_ADMIN"})
	TipologiaEsame getTipologiaFromId(Long attribute);

}
