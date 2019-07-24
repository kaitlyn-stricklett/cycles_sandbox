package kaitlyn.sandbox.domain_single_package.domainA;

import org.springframework.data.jpa.repository.JpaRepository;

interface SPRepoA extends JpaRepository<SPEntityA, Integer> {
}
