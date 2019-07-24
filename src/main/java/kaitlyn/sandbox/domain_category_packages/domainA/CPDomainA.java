package kaitlyn.sandbox.domain_category_packages.domainA;

import kaitlyn.sandbox.domain_category_packages.domainA.entity.CPEntityA;
import kaitlyn.sandbox.domain_category_packages.domainA.publicObjects.CPPojoA;
import kaitlyn.sandbox.domain_category_packages.domainA.repos.CPRepoA;
import kaitlyn.sandbox.domain_category_packages.domainB.external.iCPApiB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class CPDomainA {
    private CPRepoA repo;
    private iCPApiB otherApi;

    @Autowired
    CPDomainA(CPRepoA repo, iCPApiB otherApi){
        this.repo = repo;
        this.otherApi = otherApi;
    }

    public CPPojoA get() {
        return new CPPojoA();
    }

    public void save(CPPojoA pojo) {
        repo.save(new CPEntityA());
    }
}
