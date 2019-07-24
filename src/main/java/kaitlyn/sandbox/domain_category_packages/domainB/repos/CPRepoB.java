package kaitlyn.sandbox.domain_category_packages.domainB.repos;

import kaitlyn.sandbox.domain_category_packages.domainB.entity.CPEntityB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CPRepoB extends JpaRepository<CPEntityB, Integer> {
}
