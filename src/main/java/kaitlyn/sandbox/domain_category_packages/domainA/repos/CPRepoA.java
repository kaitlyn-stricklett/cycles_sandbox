package kaitlyn.sandbox.domain_category_packages.domainA.repos;

import kaitlyn.sandbox.domain_category_packages.domainA.entity.CPEntityA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CPRepoA extends JpaRepository<CPEntityA, Integer> {
}
