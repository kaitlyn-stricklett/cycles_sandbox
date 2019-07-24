package kaitlyn.sandbox.domain_category_packages.domainB;

import kaitlyn.sandbox.domain_category_packages.domainA.external.iCPApiA;
import kaitlyn.sandbox.domain_category_packages.domainB.entity.CPEntityB;
import kaitlyn.sandbox.domain_category_packages.domainB.publicObjects.CPPojoB;
import kaitlyn.sandbox.domain_category_packages.domainB.repos.CPRepoB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class CPDomainB {
    private CPRepoB repo;
    private iCPApiA otherApi;

    @Autowired
    CPDomainB(CPRepoB repo, iCPApiA otherApi){
        this.repo = repo;
        this.otherApi = otherApi;
    }

    public CPPojoB get() {
        return new CPPojoB();
    }

    public void save(CPPojoB pojo) {
        repo.save(new CPEntityB());
    }
}
