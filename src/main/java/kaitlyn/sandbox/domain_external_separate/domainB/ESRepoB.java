package kaitlyn.sandbox.domain_external_separate.domainB;

import org.springframework.data.jpa.repository.JpaRepository;

interface ESRepoB extends JpaRepository<ESEntityB, Integer> {
}
