package kaitlyn.sandbox.domain_category_packages.domainB;

import kaitlyn.sandbox.domain_category_packages.domainB.external.iCPApiB;
import kaitlyn.sandbox.domain_category_packages.domainB.publicObjects.CPPojoB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPApiB implements iCPApiB {
    private CPDomainB domain;

    @Autowired
    public CPApiB(CPDomainB domain) {
        this.domain = domain;
    }

    @Override public CPPojoB get() {
        return domain.get();
    }

    @Override public void save(CPPojoB pojo) {
        domain.save(pojo);
    }
}
