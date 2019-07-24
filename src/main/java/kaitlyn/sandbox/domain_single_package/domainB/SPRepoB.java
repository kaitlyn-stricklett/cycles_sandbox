package kaitlyn.sandbox.domain_single_package.domainB;

import org.springframework.data.jpa.repository.JpaRepository;

interface SPRepoB extends JpaRepository<SPEntityB, Integer> {
}
