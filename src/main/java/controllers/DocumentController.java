package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.DocumentDAO;
import models.Document;

@RestController
public class DocumentController {

	@Autowired
	protected DocumentDAO documentDao;

	@GetMapping(value = "/Documents")
	public List<Document> listeDocuments() {
		return documentDao.findAll();
	}

	@GetMapping(value = "/Documents/{id}")
	public Document afficherUnDocument(@PathVariable int id) {
		Document document = documentDao.findById(id);
		if (document == null) {
			//throw new ObjetIntrouvableException("Document avec identifiant = " + id + " est introuvable");
		}
		return document;
	}

	@PostMapping(value = "/Document")
	public void ajouterDocument(@RequestBody Document document) {
		documentDao.save(document);
	}

	@DeleteMapping(value = "/Documents/{id}")
	public void supprimerEnseignat(@PathVariable int id) {
		documentDao.deleteById(id);
	}

	@PutMapping(value = "/Document")
	public void updateDocument(@RequestBody Document document) {
		documentDao.save(document);
	}
	
}
