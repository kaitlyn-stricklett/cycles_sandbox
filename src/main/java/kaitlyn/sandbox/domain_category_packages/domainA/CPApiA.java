package kaitlyn.sandbox.domain_category_packages.domainA;

import kaitlyn.sandbox.domain_category_packages.domainA.external.iCPApiA;
import kaitlyn.sandbox.domain_category_packages.domainA.publicObjects.CPPojoA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPApiA implements iCPApiA {
    private CPDomainA domain;

    @Autowired
    public CPApiA(CPDomainA domain) {
        this.domain = domain;
    }

    @Override public CPPojoA get() {
        return domain.get();
    }

    @Override public void save(CPPojoA pojo) {
        domain.save(pojo);
    }
}
