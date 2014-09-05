package demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "brands", path = "brands")
public interface BrandRepository extends PagingAndSortingRepository<Brand, Long> {
}