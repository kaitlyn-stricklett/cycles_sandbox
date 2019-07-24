package kaitlyn.sandbox.domain_external_separate.domainA;

import org.springframework.data.jpa.repository.JpaRepository;

interface ESRepoA extends JpaRepository<ESEntityA, Integer> {
}
