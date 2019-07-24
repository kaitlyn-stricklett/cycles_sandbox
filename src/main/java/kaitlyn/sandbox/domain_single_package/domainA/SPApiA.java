package kaitlyn.sandbox.domain_single_package.domainA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPApiA implements iSPApiA {
    private SPDomainA domain;

    @Autowired
    public SPApiA(SPDomainA domain) {
        this.domain = domain;
    }
}
