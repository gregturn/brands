package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseLoader {

	private final BrandRepository repository;

	@Autowired
	public DatabaseLoader(BrandRepository repository) {
		this.repository = repository;
	}

	@PostConstruct
	public void init() {
		repository.save(new Brand("Pivotal"));
	}

}
